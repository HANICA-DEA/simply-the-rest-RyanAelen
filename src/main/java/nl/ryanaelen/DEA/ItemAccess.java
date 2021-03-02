package nl.ryanaelen.DEA;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/items")
public class ItemAccess {

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response jsonResponse() {
        return Response.ok("[\"bread\", \"butter\"]").build();
    }

    @GET
    @Path("/")
    @Produces(MediaType.TEXT_PLAIN)
    public Response iets() {
        return Response.ok("bread, butter").build();
    }
}
