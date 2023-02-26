package org.veenron.demo.mp.rest;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.veenron.demo.mp.domain.Activity;

@Path("/activities")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ActivityResource {

    @GET
    public Response get() {
        var activity = new Activity("100", "programming", true);
        return Response.ok(activity).build();
    }

    @GET
    @Path(("{uid}"))
    public Response get(@PathParam("uid")String uid) {
        var activity = new Activity("100", "programming", true);
        return Response.ok(activity).build();
    }

    @POST
    public Response post(Activity activity) {
        return Response.ok(activity).build();
    }
}
