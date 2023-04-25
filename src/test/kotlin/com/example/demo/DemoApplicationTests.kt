package com.example.demo

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.reactive.server.WebTestClient
import org.testcontainers.junit.jupiter.Testcontainers

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Testcontainers

class DemoApplicationTests : DatabaseContainerConfiguration() {

    @Autowired
    private lateinit var webTestClient: WebTestClient

    @Test
    fun shouldFetchBooks() {
        webTestClient
            .get()
            .uri("/")
            .exchange()
            .expectStatus()
            .isOk
            .expectBody()
            .consumeWith(System.out::println)

    }

}
