package org.example.services;

import org.junit.*;

import javax.sound.midi.SysexMessage;
import java.util.Date;


public class CalculatorTest {

    int counter=0;

    //execute before all test case
    @BeforeClass
    public static void init(){
       System.out.println("Before all test cases");
        System.out.println("Started test : ----" +new Date());
    }

    //execute the method before each test case
    @Before
    public void beforeEach(){
        System.out.println("Before each test case -----");
        counter = 0;
    }

    //execute the method after each test case
    @After
    public void afterEach(){
        System.out.println("After each test case --------");
    }

    //test method of addTwoNumbers
    @Test(timeout = 2000)
    public void addTwoNumbers() throws InterruptedException {
         for(int i=0;i<=20;i++){
             counter = counter +i;
         }
          Thread.sleep(1000);
          int result = CalculatorService.addTwoNumbers(12, 14);
          int expected = 26;
          Assert.assertEquals(expected, result);
          System.out.println("Counter in first test case " + counter);
          //actual result,
          //expected result
    }

    @Test
    public void sumAnyNumber(){
        for(int i=0;i<10;i++){
            counter = counter + i;
        }
        int result = CalculatorService.sumAnyNumber(2,3,4,5,6);
        int expected = 20;
        Assert.assertEquals(expected, result);
        System.out.println("Counter in second case :" + counter);
    }

    @AfterClass
    public static void cleanup(){
        System.out.println("After all test cases");
        System.out.println("Ended Test ---: "+ new Date());
    }

    //BeforeClass
    //AfterClass
    //Test
    //Before
    //After

}
