package factory;

import Dao.DaoBridge;
import Dao.SightDao;

/**
 *
 * @author tulioaoki
 */
public class SightDaoFactory {
    public DaoBridge getDao(int t) {
        switch (t) {
            case 1:
                return SightDao.getInstance();
            case 2:
                return null;
            case 3:
                return null;
            default:
                return null;
        }
    }
}
