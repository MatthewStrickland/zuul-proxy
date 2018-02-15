package com.betvictor.task

import org.springframework.boot.context.embedded.LocalServerPort
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

/**
 * Test class for the eureka microservice.
 */
@SpringBootTest(classes = [EurekaApplication.class],
        webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class EurekaApplicationSpec extends Specification {

    @LocalServerPort
    private int localPort;

    def "application serving random port"() {
        when: "application has started"

        then: "application is serving on the correct port"
        localPort == 8761
    }

}
