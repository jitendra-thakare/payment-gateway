package com.way2paid.payment_gateway.payment;

import com.way2paid.payment_gateway.common.Entity.Money;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "order_record")
public class OrderRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    // no FK - cross service boundary
    @Column(name = "merchant_id", nullable = false)
    private UUID merchantId;

    @Embedded
    private Money amount;


}
