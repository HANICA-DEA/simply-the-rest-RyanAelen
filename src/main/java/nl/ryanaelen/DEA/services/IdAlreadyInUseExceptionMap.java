package nl.ryanaelen.DEA.services;

import nl.ryanaelen.DEA.services.exceptions.IdAlreadyInUseException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class IdAlreadyInUseExceptionMap implements ExceptionMapper<IdAlreadyInUseException> {
    @Override
    public Response toResponse(IdAlreadyInUseException e) {
        return Response.status(Response.Status.CONFLICT).build();
    }
}
