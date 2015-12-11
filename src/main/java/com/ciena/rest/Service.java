package com.ciena.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * Created by Castiel on 2015-12-06.
 */
@Path("/service")
public class Service {



    @GET
    @Path("/print/{name}/{lastname}")
   // @Produces("application/json")
    public Response produceJSON(@PathParam("name") String name,
                                @PathParam("lastname") String lastname ) {

        Student st = new Student(name, lastname,19,12);

        String str = st.getFirstName() + " " + st.getLastName();

        return Response.status(200).entity(str).build();

    }
//
//    @GET
//    @Path("/simple")
//    @Produces("application/json")
//    public String simple(){
//
//        return "suricate!";
//    }

}
