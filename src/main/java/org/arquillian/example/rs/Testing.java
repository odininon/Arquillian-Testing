package org.arquillian.example.rs;

import org.arquillian.example.greeting.Greeter;

import javax.inject.Inject;
import javax.ws.rs.*;

@Path("/greeting")
public class Testing {

    @Inject
    private Greeter greeter;

    @GET
    public String getGreeting(@DefaultValue("World") @QueryParam("name") String name) {
        return greeter.createGreeting(name);
    }
}
