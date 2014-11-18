package com.autovat

import cr.co.arquetipos.currencies.Money
import grails.rest.Resource

@Resource(uri='/workers', formats=['json', 'xml'])
class Worker extends Person {
    User user
    String email
    String bankAccountNumber
    BigDecimal withholdingTaxRatio
    Money dailyRates
    Address address

    static embedded = ['address', 'dailyRates']

    static constraints = {
    }
}
