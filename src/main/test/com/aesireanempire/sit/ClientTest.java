package com.aesireanempire.sit;

import org.apache.cxf.jaxrs.client.WebClient;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class ClientTest extends TestBase {

    @Test
    public void testGreetsBob(TestBase testBase) throws Exception {
        String url = getBaseURL() + "/hello/bob";

        String response = WebClient.create(url).get(String.class);
        Assert.assertEquals("Hello, Bob!", response);
    }

    @Test
    public void testGreetsSam(TestBase testBase) throws Exception {
        String url = getBaseURL() + "/hello/sam";

        String response = WebClient.create(url).get(String.class);
        Assert.assertEquals("Hello, Sam!", response);
    }

    @Test
    public void testGreetsSamInSpanish(TestBase testBase) throws Exception {
        String url = getBaseURL() + "/hello/sam";

        String response = WebClient.create(url).query("lang", "es").get(String.class);
        Assert.assertEquals("Hola, Sam!", response);
    }
}
