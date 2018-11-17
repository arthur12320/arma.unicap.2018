package factory;

import Dao.DaoBridge;
import Dao.GunDao;
import memento.Memento;

/**
 *
 * @author tulioaoki
 */
public class GunDaoFactory extends Factory {
    int t = Memento.getState();
    
    @Override
    public DaoBridge getDao() {
        switch (t) {
            default:
                return GunDao.getInstance();
            case 2:
                return null;
            case 3:
                return null;
        }
    }
}
