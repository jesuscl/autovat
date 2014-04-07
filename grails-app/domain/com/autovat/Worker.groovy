package com.autovat

import cr.co.arquetipos.currencies.Money

class Worker extends Person {
    String username
    String hashedPassword
    String salt

    String email
    String bankAccountNumber
    BigDecimal withholdingTaxRatio
    Money dailyRates
    Address address

    static constraints = {
    }
}
