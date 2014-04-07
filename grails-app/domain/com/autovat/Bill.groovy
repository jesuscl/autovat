package com.autovat

import cr.co.arquetipos.currencies.Money
import org.joda.time.LocalDate

class Bill {
    /** This is the Bill reference */
    String reference
    /** Date of the bill */
    LocalDate date
    /** Total amount */
    Money amount
    /** VAT type applied */
    VatType vatType

    static constraints = {
    }
}
