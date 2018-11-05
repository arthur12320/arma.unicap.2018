package factory;

import Dao.ButtStockDao;
import Dao.DaoBridge;

/**
 *
 * @author tulioaoki
 */
public class ButtStockDaoFactory {
    public DaoBridge getDao(int t) {
        switch (t) {
            case 1:
                return ButtStockDao.getInstance();
            case 2:
                return null;
            case 3:
                return null;
            default:
                return null;
        }
    }
}
