package com.autovat

import grails.rest.Resource

@Resource(uri='/clients', formats=['json', 'xml'])
class Client extends Person {

    Address address
    Worker worker

    static embedded = ['address']

    static constraints = {
    }
}
