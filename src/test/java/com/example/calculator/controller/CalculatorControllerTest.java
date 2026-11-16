
package com.example.calculator.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class CalculatorControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testAddition() throws Exception {
        mockMvc.perform(get("/api/calculator/add")
                .param("a", "5")
                .param("b", "3"))
                .andExpect(status().isOk())
                .andExpect(content().string("8.0"));
    }

    @Test
    void testSoustraction() throws Exception {
        mockMvc.perform(get("/api/calculator/subtract")
                .param("a", "5")
                .param("b", "3"))
                .andExpect(status().isOk())
                .andExpect(content().string("2.0"));
    }

    @Test
    void testMultiplication() throws Exception {
        mockMvc.perform(get("/api/calculator/multiply")
                .param("a", "5")
                .param("b", "3"))
                .andExpect(status().isOk())
                .andExpect(content().string("15.0"));
    }

    @Test
    void testDivision() throws Exception {
        mockMvc.perform(get("/api/calculator/divide")
                .param("a", "10")
                .param("b", "5"))
                .andExpect(status().isOk())
                .andExpect(content().string("2.0"));
    }
}
