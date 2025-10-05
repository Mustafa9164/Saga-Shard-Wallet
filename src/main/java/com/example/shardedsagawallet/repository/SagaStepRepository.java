package com.example.shardedsagawallet.repository;

import com.example.shardedsagawallet.entity.SagaStep;
import com.example.shardedsagawallet.service.saga.SagaContext;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SagaStepRepository extends JpaRepository<SagaStep, Long> {

    boolean execute(Object context);

    boolean compensate(SagaContext context);

    String getStepName();

}