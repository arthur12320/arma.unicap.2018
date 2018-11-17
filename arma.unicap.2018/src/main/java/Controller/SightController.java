package Controller;

import Dao.DaoBridge;
import arma.Sight;
import factory.AbstractFactory;
import java.util.ArrayList;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author zearthur99
 */
@ApplicationScoped
public class SightController {

    private DaoBridge<Sight> dao = AbstractFactory.getFactory("sight").getDao();

    public SightController() {
    }

    public Sight createSight(Sight s) {
        if (dao.idExists(s.getId()) == false) {
            dao.insertItem(s);
            return s;
        }
        return null;
    }

    public Sight updateSight(Sight s) {
        dao.replaceItem(s, s.getId());
        return s;
    }

    public ArrayList<Sight> getSights() {
        return dao.getList();
    }

    public void removeSight(String id) {
        int i;
        try {
            i = Integer.parseInt(id);
            dao.remove(i);
        } catch (NumberFormatException e) {
        }
    }

    public Sight getById(String id) {
        int i;
        try {
            i = Integer.parseInt(id);
            return dao.getById(i);
        } catch (NumberFormatException e) {
            return null;
        }

    }
}
