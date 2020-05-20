package pe.edu.upc.boundary;

import pe.edu.upc.business.CustomerBusiness;
import pe.edu.upc.model.entity.Customer;


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
    private CustomerBusiness customerBusiness;

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
            customers = customerBusiness.findAll();
        } catch (Exception e) {

        }
        return customers;
    }

    @GET
    @Path("getcustomer")
    @Produces(MediaType.APPLICATION_JSON)
    public Customer getCustomer() {
        Optional<Customer> customer = Optional.empty();
        try {
            customer = customerBusiness.findById(1);

        } catch (Exception e) {

        }
        return customer.get();
    }

    @GET
    @Path("getcustomer/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Customer getCustomer(@PathParam("id") Integer id) {
        Optional<Customer> customer = Optional.empty();
        try {
            customer = customerBusiness.findById(id);

        } catch (Exception e) {

        }
        return customer.get();
    }

    @POST
    @Path("postcustomer")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response postCustomer( Customer customer ) {
        String result = "Customer recived: " + customer;
        return Response.status(Response.Status.CREATED).entity(result).build();
    }
}
