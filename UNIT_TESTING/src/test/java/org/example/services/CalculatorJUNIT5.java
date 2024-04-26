package org.example.services;

import org.junit.jupiter.api.*;

public class CalculatorJUNIT5 {

    //execute the logic before all test cases;
    @BeforeAll
    public static void init(){
        System.out.println("This is single time logic");
    }

    @BeforeEach
    public void eachTestCase(){
        System.out.println("Before Each Case----");
    }
    @Test
    @DisplayName("This custom test name")
    public void addTwoNumbers(){
        System.out.println("First Test Case");
        int result   = CalculatorService.addTwoNumbers(10,20);
        int expected = 50;
        Assertions.assertEquals(result, expected, "Test Failed");
    }

    @Test
    @Disabled
    public void addAnyNumberTest(){
        System.out.println("Second Test Case");
        int result = CalculatorService.sumAnyNumber(12,2,3,4,5);
        int expected = 18;
        Assertions.assertEquals(result, expected, "No Match");
    }

    @AfterEach
    public void afterEachTestCase(){
        System.out.println("After Each Test Case");
    }

    @AfterAll
    public static void cleanUp(){
        System.out.println("After all test case logic");
    }
}
//@BeforeAll
//@AfterAll
//@BeforeEach
//@AfterEach
//@Test
//@Disabled


