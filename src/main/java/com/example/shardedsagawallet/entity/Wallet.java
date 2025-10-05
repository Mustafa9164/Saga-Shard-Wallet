package com.example.shardedsagawallet.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "wallet")
public class Wallet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id",nullable = false)
    private long userId;
    @Column(name = "is_active",nullable = false)
    private Boolean isActive;
    @Column(name = "balance",nullable = false)
    private BigDecimal balance=BigDecimal.ZERO;

    private boolean hasSufficientBalance(BigDecimal amount){
        return balance.compareTo(amount)>=0;
    }

    public void debit(BigDecimal amout){
        if(!hasSufficientBalance(amout)){
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance=balance.subtract(amout);
    }

    public void credit(BigDecimal amount){
        balance=balance.add(amount);
    }


}
