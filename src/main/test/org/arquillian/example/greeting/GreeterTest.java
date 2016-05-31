package org.arquillian.example.greeting;

import org.arquillian.example.TestBase;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class GreeterTest extends TestBase {
    @Test
    public void testGreetsBob(Greeter greeter) throws Exception {
        String actual = greeter.createGreeting("Bob");

        Assert.assertEquals("Did not greet Bob", "Hello, Bob!", actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testThrowsExceptionForNull(Greeter greeter) throws Exception {
        greeter.createGreeting(null);
    }
}