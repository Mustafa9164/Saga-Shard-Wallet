package com.example.shardedsagawallet.service.saga.steps;

import com.example.shardedsagawallet.entity.SagaStep;
import com.example.shardedsagawallet.repository.WalletRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class CreditDestinationWalletStep {

    private final WalletRepository walletRepository;
}
