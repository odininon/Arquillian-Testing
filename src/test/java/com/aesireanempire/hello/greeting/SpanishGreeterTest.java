package com.aesireanempire.hello.greeting;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SpanishGreeterTest {
    @Test
    public void greet() throws Exception {
        String actual = new SpanishGreeter().greet("terry");

        Assert.assertEquals("Hola, terry!", actual);
    }

}