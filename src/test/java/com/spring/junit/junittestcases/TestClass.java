package com.spring.junit.junittestcases;

import com.spring.junit.junittestcases.calcs.Calculator;
import org.junit.jupiter.api.*;

public class TestClass {

        @BeforeAll
        static void setup(){
            System.out.println("@BeforeAll executed");
        }

        @BeforeEach
        void setupThis(){
            System.out.println("@BeforeEach executed");
        }

        @Test
        void testCalcOne()
        {
            System.out.println("======TEST ONE EXECUTED=======");
            Assertions.assertEquals( 4 , Calculator.add(2, 2));
        }

        @Test
        void testCalcTwo()
        {
            System.out.println("======TEST TWO EXECUTED=======");
            Assertions.assertEquals( 6 , Calculator.add(2, 4));
        }

        @AfterEach
        void tearThis(){
            System.out.println("@AfterEach executed");
        }

        @AfterAll
        static void tear(){
            System.out.println("@AfterAll executed");
        }
    }

