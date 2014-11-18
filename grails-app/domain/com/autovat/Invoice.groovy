package com.autovat

import cr.co.arquetipos.currencies.Money
import grails.rest.Resource
import org.joda.time.LocalDate

@Resource(uri='/invoices', formats=['json', 'xml'])
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
