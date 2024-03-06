package com.desafiopicpay.desafiopicpay.data.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "wallets")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Wallet {

    @Id
    @UuidGenerator(style = UuidGenerator.Style.RANDOM)
    @Column(name = "id", updatable = false, unique = true, nullable = false)
    private UUID id;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", unique = true)
    private User user;

    @Column(name = "amount")
    private BigDecimal amount;

    @JsonIgnore
    @OneToMany(mappedBy = "payer")
    private List<Transaction> transactionsAsPayer;

    @JsonIgnore
    @OneToMany(mappedBy = "payee")
    private List<Transaction> transactionsAsPayee;
}
