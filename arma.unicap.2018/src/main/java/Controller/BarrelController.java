/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.DaoBridge;
import arma.Barrel;
import factory.BarrelDaoFactory;
import java.util.ArrayList;


/**
 *
 * @author zearthur99
 */
public class BarrelController {
    private DaoBridge<Barrel> dao = (new BarrelDaoFactory()).getDao(1);

    public BarrelController() {
    }
    
    public Barrel createBarrel(Barrel s){
        if(dao.idExists(s.getId()) == false){
            dao.insertItem(s);
        return s;
        }
        return null;
    }

    public Barrel updateBarrel(Barrel s){
        dao.replaceItem(s, s.getId());
        return s;
    }

    public ArrayList<Barrel> getBarrels(){
        return dao.getList();
    }

    public void removeBarrel(String id){
        int i;
        try{
            i = Integer.parseInt(id);
            dao.remove(i);
        }catch(NumberFormatException e){
        }
    }

    public Barrel getById(String id) {
        int i;
        try{
            i = Integer.parseInt(id);
            return dao.getById(i);
        }catch(NumberFormatException e){
            return null;
        }

    }
}
