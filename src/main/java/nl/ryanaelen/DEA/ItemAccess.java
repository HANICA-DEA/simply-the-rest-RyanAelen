package nl.ryanaelen.DEA;


import nl.ryanaelen.DEA.services.ItemService;
import nl.ryanaelen.DEA.services.dto.ItemDTO;

import javax.ejb.Singleton;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/items")
@Singleton
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

    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addItem(ItemDTO itemDTO) {
        itemService.addItem(itemDTO);
        return Response.status(Response.Status.CREATED).build();
    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response removeItem(@PathParam("id") int id) {
        itemService.deleteItem(id);
        return Response.status(Response.Status.OK).build();
    }
}
