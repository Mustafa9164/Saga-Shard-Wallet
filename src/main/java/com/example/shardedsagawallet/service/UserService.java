package com.example.shardedsagawallet.service;

import com.example.shardedsagawallet.entity.User;
import com.example.shardedsagawallet.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User createUser(User user){
        log.info("creating user: {}",user.getEmail());
        User newUser = userRepository.save(user);
        log.info("User created with Id: {} in database shardwallet{}",newUser.getId(),(newUser.getId()%2+1));
        return newUser;

    }
}
