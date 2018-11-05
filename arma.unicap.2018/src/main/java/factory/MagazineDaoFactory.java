package factory;

import Dao.DaoBridge;
import Dao.MagazineDao;

/**
 *
 * @author tulioaoki
 */
public class MagazineDaoFactory {
    public DaoBridge getDao(int t) {
        switch (t) {
            case 1:
                return MagazineDao.getInstance();
            case 2:
                return null;
            case 3:
                return null;
            default:
                return null;
        }
    }
}
