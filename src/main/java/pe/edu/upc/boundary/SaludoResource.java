package pe.edu.upc.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("saludos")
public class SaludoResource {

    @GET
    public String saludo() {
        return "Hello programmers";
    }
}
