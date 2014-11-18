package com.autovat

import cr.co.arquetipos.currencies.Money
import grails.rest.Resource
import org.joda.time.LocalDate

@Resource(uri='/bills', formats=['json', 'xml'])
class Bill extends VatDomain {
    /** This is the Bill reference */
    String reference
    /** Date of the bill */
    LocalDate date
    /** Total amount */
    Money amount
    /** VAT type applied */
    VatType vatType
    /** Provider of the product*/
    Provider provider
    /** Worker */
    Worker worker

    static constraints = {
    }
}
