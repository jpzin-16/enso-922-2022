package app;

import io.jooby.annotations.*;

@Path("/subtracao/{op1}/{op2}")
public class Subtracao {
    
    @GET
    public Double calculandoSubtracao(@PathParam double op1, @PathParam double op2){
        return op1 - op2;    
    }
}