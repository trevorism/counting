package com.brooks.web

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

/**
 * @author trevor.brooks
 */
@Path("/")
class AppEndpoint {

    private static int counter = 0;

    @GET
    @Path("increment/a.gif")
    @Produces(MediaType.APPLICATION_JSON)
    int increment(){
        return ++counter

    }

    @GET
    @Path("get")
    @Produces(MediaType.APPLICATION_JSON)
    int get(){
        counter
    }

    @GET
    @Path("clear")
    @Produces(MediaType.APPLICATION_JSON)
    boolean clear(){
        counter = 0;
        return true;
    }


}
