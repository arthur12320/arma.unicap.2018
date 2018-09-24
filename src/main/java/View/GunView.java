package View;
import Controller.GunController;
import arma.Gun;
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

@RequestScoped
@Path("guns")
@Produces("application/json")
public class GunView {
    
    GunController controller = new GunController();

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Gun postGun(Gun b) {
        return b;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Gun> listGun() {
       return controller.getGuns();
    }

    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Gun detailGun(@PathParam("id") String id) {
        return controller.getById(id);
    }

    @Path("/{id}")
    @PUT
    public Gun updateGun(@PathParam("id") String id, Gun updatedGun) throws NotFoundException {
        updatedGun.setId(id);
        return controller.updateGun(updatedGun,id);
    }

    @Path("/{id}")
    @DELETE
    public void deleteGun(@PathParam("id") String id) {
        controller.removeGun(id);
    }
    
    //ADD/PUTS
    @Path("/{id}/put-barrel/{barrel}")
    @PUT
    public Gun putBarrel(@PathParam("id") String id,@PathParam("barrel") String barrel) throws NotFoundException {
        return controller.putBarrel(id, barrel);
    }
    
    @Path("/{id}/put-bt/{bt}")
    @PUT
    public Gun putBt(@PathParam("id") String id,@PathParam("bt") String bt) throws NotFoundException {
        return controller.putButtStock(id, bt);
    }
    
    @Path("/{id}/put-magazine/{magazine}")
    @PUT
    public Gun putMagazine(@PathParam("id") String id,@PathParam("magazine") String magazine) throws NotFoundException {
        return controller.putMagazine(id, magazine);
    }
    
    @Path("/{id}/put-sight/{sight}")
    @PUT
    public Gun putSight(@PathParam("id") String id,@PathParam("sight") String sight) throws NotFoundException {
        return controller.putSight(id, sight);
    }
    
    //REMOVES 
    @Path("/{id}/remove-barrel")
    @PUT
    public Gun delBarrel(@PathParam("id") String id) throws NotFoundException {
        return controller.delBarrel(id);
    }
    
    @Path("/{id}/remove-bt")
    @PUT
    public Gun delBt(@PathParam("id") String id) throws NotFoundException {
        return controller.delButtStock(id);
    }
    
    @Path("/{id}/remove-magazine")
    @PUT
    public Gun delMagazine(@PathParam("id") String id) throws NotFoundException {
        return controller.delMagazine(id);
    }
    
    @Path("/{id}/remove-sight")
    @PUT
    public Gun delSight(@PathParam("id") String id) throws NotFoundException {
        return controller.delSight(id);
    }
    //END REMOVES
    
    
    //Style related
    @Path("/{id}/put-style/{style}")
    @PUT
    public Gun addStyle(@PathParam("id") String id,@PathParam("style") String style) throws NotFoundException {
        return controller.putStyle(id, style);
    }
    
    @Path("/{id}/remove-style")
    @PUT
    public Gun delStyle(@PathParam("id") String id) throws NotFoundException {
        return controller.delStyle(id);
    }
    
    //COMPATIBILITY
    @Path("/{id}/compatibility-barrel/{item}")
    @PUT
    public Gun addCompatibilityBarrel(@PathParam("id") String id,@PathParam("item") String item) throws NotFoundException {
        return controller.addCompatibilityBarrel(id, item);
    }
    
    @Path("/{id}/compatibility-bt/{item}")
    @PUT
    public Gun addCompatibilityButtStock(@PathParam("id") String id,@PathParam("item") String item) throws NotFoundException {
        return controller.addCompatibilityBt(id, item);
    }
    
    @Path("/{id}/compatibility-magazine/{item}")
    @PUT
    public Gun addCompatibilityMagazine(@PathParam("id") String id,@PathParam("item") String item) throws NotFoundException {
        return controller.addCompatibilityMagazine(id, item);
    }
    
    @Path("/{id}/compatibility-sight/{item}")
    @PUT
    public Gun addCompatibilitySight(@PathParam("id") String id,@PathParam("item") String item) throws NotFoundException {
        return controller.addCompatibilitySight(id, item);
    }

}