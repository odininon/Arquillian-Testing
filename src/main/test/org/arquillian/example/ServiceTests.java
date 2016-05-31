package org.arquillian.example;

import org.apache.cxf.jaxrs.client.WebClient;
import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class ServiceTests extends TestBase {
    @Test
    public void testGreetsBob() throws Exception {
        String url = getBaseURL() + "rs/v1/greeting/";

        String response = WebClient.create(url).query("name", "Bob").get(String.class);

        Assert.assertEquals("Not greeting the correct person", "Hello, Bob!", response);
    }

    @Test
    public void testGreetsUnknownUser() throws Exception {
        String url = getBaseURL() + "rs/v1/greeting/";

        String response = WebClient.create(url).get(String.class);

        Assert.assertEquals("Not greeting the correct person", "Hello, World!", response);
    }
}
