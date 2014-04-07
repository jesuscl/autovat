package com.autovat

import cr.co.arquetipos.currencies.Money
import org.joda.time.LocalDate

class Invoice extends VatDomain {
    /** This is the invoice reference */
    String reference
    /** Description */
    String description
    /** Date of the invoice */
    LocalDate date
    /** Total amount */
    Money amount
    /** VAT type applied */
    VatType vatType
    /** Withholding tax ratio */
    BigDecimal withholdingTaxRatio
    /** Client */
    Client client
    /** Worker */
    Worker worker

    static constraints = {
    }
}
