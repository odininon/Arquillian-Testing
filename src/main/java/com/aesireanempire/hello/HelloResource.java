package com.aesireanempire.hello;


import com.aesireanempire.hello.greeting.Greeter;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("hello")
public class HelloResource {

    private final Greeter greeter;

    @Inject
    public HelloResource(Greeter greeter) {
        this.greeter = greeter;
    }

    @GET
    @Path("/{name}")
    public Response hello(@PathParam("name") final String name,
                          @DefaultValue("en") @QueryParam("lang") final String language) {

        return Response.ok(greeter.greet(name, language)).build();
    }
}
