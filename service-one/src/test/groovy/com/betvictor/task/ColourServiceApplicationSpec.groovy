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
 * Test class for the colours microservice.
 */
@SpringBootTest(properties = ["eureka.client.enabled:false"],
        classes = [ColourServiceApplication.class],
        webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@AutoConfigureMockMvc
class ColourServiceApplicationSpec extends Specification {

    @LocalServerPort
    private int localPort;

    @Autowired
    private MockMvc mvc;

    def "application serving random port"() {
        when: "application has started"

        then: "application port is random and not 8080"
        localPort != 8080
    }

    def "default root welcomes"() {
        given: "application has started"

        when: "we get the root endpoint"
        def result = mvc.perform(MockMvcRequestBuilders.get("")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn()

        then: "a welcome message is returned"
        result.response.contentAsString == "[\"blue\",\"green\",\"red\",\"purple\"]"
    }
}
