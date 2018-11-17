package factory;

import Dao.BarrelDao;
import Dao.DaoBridge;
import memento.Memento;

/**
 *
 * @author tulioaoki
 */
public class BarrelDaoFactory extends Factory{
    
    public DaoBridge getDao() {
        int t = Memento.getState();
        switch (t) {
            default:
                return BarrelDao.getInstance();
            case 2:
                return null;
            case 3:
                return null;
        }
    }
}
