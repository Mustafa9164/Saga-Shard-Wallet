package com.example.shardedsagawallet.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

    @Entity
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @Table(name = "saga_step")
    public class SagaStep {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "saga_instance_id", nullable = false)
        private Long sagaInstanceId;

        @Column(name = "step_name", nullable = false)
        private String stepName;

        @Column(name = "status", nullable = false)
        private StepStatus status;

        @Column(name = "error_message", nullable = true)
        private String errorMessage;

        // json step data
        @Column(name = "step_data", columnDefinition = "json")
        private String stepData;


    }
