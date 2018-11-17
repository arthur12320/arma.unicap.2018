package factory;

import Dao.DaoBridge;
import Dao.SightDao;
import memento.Memento;

/**
 *
 * @author tulioaoki
 */
public class SightDaoFactory extends Factory {
    int t = Memento.getState();
    
    @Override
    public DaoBridge getDao() {
        switch (t) {
            default:
                return SightDao.getInstance();
            case 2:
                return null;
            case 3:
                return null;
        }
    }
}
