package com.example.unitvsint.controllers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

;


// We use ExtendWith and WebMvcTest when writing integration tests
@ExtendWith(SpringExtension.class)
@WebMvcTest(HelloController.class)
class HelloControllerIntTest {

    @Autowired
    private MockMvc mvc;
    // Autowired mocks our Requests. It's a class that comes with Spring. We get an instance of this.

    @Test
    void hello() throws Exception {
        // Request Builder is part of MockMvc
        RequestBuilder request = MockMvcRequestBuilders.get("/hello");
        MvcResult result = mvc.perform(request).andReturn();
        // MvcResult is part of MockMvc, we will use the instantiation of mvc and use the perform method which will
        // add an exception that you will need to add, and then we return
        assertEquals("Hello, World!", result.getResponse().getContentAsString());
    }

    @Test
    public void testHelloWithName() throws Exception {
        RequestBuilder get = MockMvcRequestBuilders.get("/hello?name=Teo");
        mvc.perform(get)
                .andExpect(content().string("Hello, Teo!"));
    }
}