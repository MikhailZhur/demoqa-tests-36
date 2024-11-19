package com.demoqa;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FirstUnitTest {

    @BeforeEach
    void beforeEach(){
        System.out.println("                @beforeEach()");
    }

    @AfterEach
    void afterEach(){
        System.out.println("                @afterEach()");
    }

    @Test
    void firstTest(){
        Assertions.assertTrue(3 > 2);
        System.out.println("                @Test! firstTest()");
    }

    @Test
    void secondTest(){
        Assertions.assertTrue(3 > 2);
        System.out.println("                @Test! firstTest()");
    }
}
