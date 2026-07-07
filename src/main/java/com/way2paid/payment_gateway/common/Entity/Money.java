package com.way2paid.payment_gateway.common.Entity;


import jakarta.persistence.Embeddable;

@Embeddable
public class Money {
    private int amountUnits;
    public String currency;

    public Money(int amountUnits, String currency) {
        this.amountUnits = amountUnits;
        this.currency = currency;
    }

    public Money of(int amountUnits, String currency) {
        return new Money(amountUnits, currency);
    }

    private Money inr(int amountUnits) {
        return new Money(amountUnits, "INR");
    }

    public Money add(Money other) {
        if(!this.currency.equals(other.currency)) {
            throw new IllegalArgumentException("Cannot add Money with different currencies");
        }
        return new Money(this.amountUnits + other.amountUnits, this.currency);
    }

    public Money subtract(Money other) {
        if(!this.currency.equals(other.currency)) {
            throw new IllegalArgumentException("Cannot subtract Money with different currencies");
        }
        return new Money(this.amountUnits - other.amountUnits, this.currency);
    }

    public int getAmountUnits() {
        return amountUnits;
    }
}
