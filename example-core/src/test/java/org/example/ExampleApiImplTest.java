package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExampleApiImplTest {

    @Test
    void greeting_should_return_the_expected_result() {
        var exampleApi = new ExampleApiImpl();

        var result = exampleApi.greeting();

        assertEquals("Hello World", result);
    }
}
