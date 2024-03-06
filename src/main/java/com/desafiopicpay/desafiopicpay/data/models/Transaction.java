package com.desafiopicpay.desafiopicpay.data.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "transactions")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Transaction {

    @Id
    @UuidGenerator(style = UuidGenerator.Style.RANDOM)
    @Column(name = "id", updatable = false, unique = true, nullable = false)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "payer_id", referencedColumnName = "id", nullable = false)
    private Wallet payer;

    @ManyToOne
    @JoinColumn(name = "payee_id", referencedColumnName = "id", nullable = false)
    private Wallet payee;

    @Column(name = "amount", nullable = false)
    private BigDecimal amount;
}
