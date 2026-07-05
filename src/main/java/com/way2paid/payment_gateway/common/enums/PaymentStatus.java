package com.way2paid.payment_gateway.common.enums;

public enum PaymentStatus {
    CREATED,
    AUTHORIZING,
    AUTHORIZED,
    CAPTURING,
    CAPTURED,
    REFUNDING,
    REFUNDED,
    FAILED,
    CANCELLED,
    PARTIALLY_REFUNDED,
    SETTLED,
    AUTH_EXPIRED,
}
