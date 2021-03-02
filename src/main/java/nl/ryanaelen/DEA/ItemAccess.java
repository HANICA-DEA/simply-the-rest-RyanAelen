package nl.ryanaelen.DEA;


import nl.ryanaelen.DEA.services.ItemService;
import nl.ryanaelen.DEA.services.dto.ItemDTO;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/items")
public class ItemAccess {
    private ItemService itemService;

    public ItemAccess() {
        this.itemService = new ItemService();
    }


    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response jsonResponse() {
        return Response.ok(itemService.getAll()).build();
    }

    @GET
    @Path("/")
    @Produces(MediaType.TEXT_PLAIN)
    public Response iets() {
        return Response.ok("bread, butter").build();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response itemId(@PathParam("id") int id) {
        return Response.ok(itemService.getItem(id)).build();
    }
}
