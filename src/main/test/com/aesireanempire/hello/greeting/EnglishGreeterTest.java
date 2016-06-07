package com.aesireanempire.hello.greeting;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EnglishGreeterTest {
    @Test
    public void greet() throws Exception {
        String actual = new EnglishGreeter().greet("bob");

        Assert.assertEquals("Hello, bob!", actual);
    }

}