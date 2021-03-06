package Endpoints;
import Controller.ButtStockController;
import arma.ButtStock;
import java.util.ArrayList;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@RequestScoped
@Path("buttstocks")
@Produces("application/json")
public class ButtStockEndpoint {
    ButtStockController controller = new ButtStockController();
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ButtStock postButtStock(ButtStock b) {
        return controller.createButtStock(b);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<ButtStock> listButtStock() {
        return controller.getButtStocks();
    }

    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ButtStock detailButtStock(@PathParam("id") String id) {
        return controller.getById(id);
    }

    @Path("/{id}")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ButtStock updateButtStock(@PathParam("id") String id, ButtStock updatedButtStock) throws NotFoundException {
        return controller.updateButtStock(updatedButtStock);
    }
    
    @Path("/{id}")
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void deleteButtStock(@PathParam("id") String id) {
        controller.removeButtStock(id);
    }
}
