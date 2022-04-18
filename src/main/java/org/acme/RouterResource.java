package org.acme;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.acme.domain.Person;
import org.acme.services.CellService;

import io.smallrye.mutiny.Multi;

@Path("/router")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RouterResource {

    @GET
    public Multi<ArrayList<Person>> router() {
        return CellService.getPerson();
    }
}