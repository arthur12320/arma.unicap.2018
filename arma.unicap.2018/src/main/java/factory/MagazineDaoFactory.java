package factory;

import Dao.DaoBridge;
import Dao.MagazineDao;
import memento.Memento;

/**
 *
 * @author tulioaoki
 */
public class MagazineDaoFactory extends Factory {
    int t = Memento.getState();
    
    @Override
    public DaoBridge getDao() {
        switch (t) {
            default:
                return MagazineDao.getInstance();
            case 2:
                return null;
            case 3:
                return null;
        }
    }
}
