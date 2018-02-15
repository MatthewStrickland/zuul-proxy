package com.betvictor.task

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.context.embedded.LocalServerPort
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import spock.lang.Specification

/**
 * Test class for the eureka microservice.
 */
@SpringBootTest(classes = [EurekaApplication.class],
        webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@AutoConfigureMockMvc
class EurekaApplicationSpec extends Specification {

    @LocalServerPort
    private int localPort;

    @Autowired
    private MockMvc mvc;

    def "application serving random port"() {
        when: "application has started"

        then: "application is serving on the correct port"
        localPort == 8761
    }

}
