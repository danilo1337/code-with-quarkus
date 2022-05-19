package org.acme;

import java.util.Arrays;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Object hello() {
        // return "Hello Quarkus - Teste";
        return Arrays.asList(
            "Teste1",
                "Teste2",
                "Teste3");
    }

    @GET
    @Path("/teste")
    @Produces(MediaType.APPLICATION_JSON)
    public Object teste() {
        // return "Hello Quarkus - Teste";
        return Arrays.asList(
            "Teste1",
                "Teste2",
                "Teste3");
    }
}