package com.way2paid.payment_gateway.merchant.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "merchant_webhook_config")
public class MerchantWebhookConfig {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = jakarta.persistence.FetchType.LAZY, optional = false)
    @JoinColumn(name = "merchant_id", nullable = false)
    private Merchant merchant;

    @Column(nullable = false, length = 500)
    private String targetUrl;

    @Column(length = 255)
    private String webhookSecretHash;

    @Column(nullable = false)
    private boolean enabled = true;

    @Column(length = 255)
    private String eventTypes; // Comma-separated list of event types

}
