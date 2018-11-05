package factory;

import Dao.DaoBridge;
import Dao.GunDao;

/**
 *
 * @author tulioaoki
 */
public class GunDaoFactory {
    public DaoBridge getDao(int t) {
        switch (t) {
            case 1:
                return GunDao.getInstance();
            case 2:
                return null;
            case 3:
                return null;
            default:
                return null;
        }
    }
}
