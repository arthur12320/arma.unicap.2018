/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import Dao.BulletDao;
import Dao.DaoBridge;
import memento.Memento;

/**
 *
 * @author tulioaoki
 */
public class BulletDaoFactory extends Factory {
    int t = Memento.getState();

    @Override
    public DaoBridge getDao() {
        switch (t) {
            default:
                return BulletDao.getInstance();
            case 2:
                return null;
            case 3:
                return null;
        }
    }
}
