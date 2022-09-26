package app;

import io.jooby.annotations.*;

@Path("/soma/{op1}/{op2}")
public class Adicao {
    
    @GET
    public Double calculandoSoma(@PathParam double op1, @PathParam double op2){
        return op1 + op2;    
    }

}