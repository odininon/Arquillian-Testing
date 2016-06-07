package com.aesireanempire.hello.greeting;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class GreeterTest {
    @Test
    public void greet() throws Exception {
        HashMap<String, IGreeter> languages = new HashMap<>();
        languages.put("en", new IGreeter() {
            @Override
            public String greet(String name) {
                return "Hello todd";
            }
        });

        String greet = new Greeter(languages).greet("todd", "en");

        Assert.assertEquals("Hello todd", greet);
    }

    @Test
    public void defaultsToEnglishIfUnknownLanguage() throws Exception {
        HashMap<String, IGreeter> languages = new HashMap<>();
        languages.put("en", new IGreeter() {
            @Override
            public String greet(String name) {
                return "Hello todd";
            }
        });

        String greet = new Greeter(languages).greet("todd", "zh");

        Assert.assertEquals("Hello todd", greet);
    }

}