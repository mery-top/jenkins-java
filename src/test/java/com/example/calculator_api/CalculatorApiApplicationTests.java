package com.example.calculator_api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorApiApplicationTests {
	
	CalculatorController controller = new CalculatorController();
	
	@Test
    void testAdd() {
        assertEquals(8, controller.add(5, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(2, controller.sub(5, 3));
    }

    @Test
    void testMultiply() {
        assertEquals(15, controller.multi(5, 3));
    }

}
