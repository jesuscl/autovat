package com.autovat

/**
 * Created by jesus on 01/04/14.
 */
public enum VatType {
    T_21(0.21, '21%'),
    T_10(0.10, '10%'),
    NONE(0, 'Not apply')

    BigDecimal rate
    String description

    VatType(rate, description) {
        this.rate = rate
        this.description = description
    }

    String toString() {
        this.description
    }
}