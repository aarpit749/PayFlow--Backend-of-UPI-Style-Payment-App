package com.airtibe.java.payFlow.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;

    @NotBlank(message = "Sender UPI ID cannot be blank")
    @Column(nullable = false)
    private String senderUpiId;

    @NotBlank(message = "Receiver UPI ID cannot be blank")
    @Column(nullable = false)
    private String receiverUpiId;

    @NotNull(message = "Amount is required")
    @Positive(message = "Amount must be greater than 0")
    @Column(nullable = false)
    private Double amount;

    @Size(max = 140, message = "Note cannot exceed 140 characters")
    private String note;

}
