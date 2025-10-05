package com.example.shardedsagawallet.entity;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.calcite.model.JsonType;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "saga_instance")
public class SagaInsatnce {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private SagaStatus status = SagaStatus.STARTED;

    @Type (JsonType.class)
    @Column(name = "context", columnDefinition = "json")
    private String context;

    @Column(name = "current_step")
    private String currentStep;



}

