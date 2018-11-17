package factory;

import Dao.ButtStockDao;
import Dao.DaoBridge;
import memento.Memento;

/**
 *
 * @author tulioaoki
 */
public class ButtStockDaoFactory extends Factory {
    int t = Memento.getState();
    
    @Override
    public DaoBridge getDao() {
        switch (t) {
            default:
                return ButtStockDao.getInstance();
            case 2:
                return null;
            case 3:
                return null;
        }
    }
}
