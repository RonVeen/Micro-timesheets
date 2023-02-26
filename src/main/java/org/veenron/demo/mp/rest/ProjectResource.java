package org.veenron.demo.mp.rest;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.veenron.demo.mp.domain.Project;
import org.veenron.demo.mp.persist.Persistence;

import java.util.UUID;

@Path("/projects")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProjectResource {

    @GET
    @Path("{uid}")
    public Response getResource(@PathParam("uid")String uid) {
        Project project = Persistence.getInstance().getOne(uid);
        if (project == null) {
            return Response.noContent().build();
        }
        return Response.ok(project).build();
    }

    @POST
    public Response post(Project project) {
        Persistence.getInstance().store(project);
        return Response.ok(project).build();
    }

    @PUT
    @Path("{uid}")
    public Response put(@PathParam("uid")String uid,  Project project) {
        Project created = Persistence.getInstance().store(project);
        created.setActive(true);
        return Response.ok(created).build();
    }


}
