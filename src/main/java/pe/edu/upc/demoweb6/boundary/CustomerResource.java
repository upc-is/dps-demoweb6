package pe.edu.upc.demoweb6.boundary;

import pe.edu.upc.demoweb6.service.CustomerService;
import pe.edu.upc.demoweb6.model.entity.Customer;


import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Path("customers")
public class CustomerResource {

    @Inject
    private CustomerService customerService;

    @GET
    @Path("test")
    public String getTest() {
        return "Customer Test";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Customer> getCustomers() {
        List<Customer> customers = new ArrayList<>();
        try {
            customers = customerService.findAll();
        } catch (Exception e) {

        }
        return customers;
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Customer getCustomer(@PathParam("id") Integer id) {
        Optional<Customer> customer = Optional.empty();
        try {
            customer = customerService.findById(id);

        } catch (Exception e) {

        }
        return customer.get();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response postCustomer( Customer customer ) {
        String result = "Customer recived: " + customer;
        return Response.status(Response.Status.CREATED).entity(result).build();
    }
}
