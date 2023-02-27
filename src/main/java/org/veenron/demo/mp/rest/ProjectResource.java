package org.veenron.demo.mp.rest;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.veenron.demo.mp.domain.Project;
import org.veenron.demo.mp.persist.Storage;

@Path("/projects")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProjectResource {

    @Inject
    PersistenceService ps;

    @GET
    @Path("{uid}")
    public Response getResource(@PathParam("uid")String uid) {
        Project project = ps.projectStorage.getOne(uid);
        if (project == null) {
            return Response.noContent().build();
        }
        return Response.ok(project).build();
    }

    @POST
    public Response post(Project project) {
        ps.projectStorage.store(project);
        return Response.ok(project).build();
    }

    @PUT
    @Path("{uid}")
    public Response put(@PathParam("uid")String uid,  Project project) {
        Project created = ps.projectStorage.store(project);
        created.setActive(true);
        return Response.ok(created).build();
    }


}
