package factory;

import Dao.BarrelDao;
import Dao.DaoBridge;

/**
 *
 * @author tulioaoki
 */
public class BarrelDaoFactory {
    public DaoBridge getDao(int t) {
        switch (t) {
            case 1:
                return BarrelDao.getInstance();
            case 2:
                return null;
            case 3:
                return null;
            default:
                return null;
        }
    }
}
