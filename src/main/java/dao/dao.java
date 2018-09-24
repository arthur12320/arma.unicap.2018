/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import arma.Barrel;
import arma.Bullet;
import arma.ButtStock;
import arma.Gun;
import arma.Magazine;
import arma.Sight;
import java.util.ArrayList;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author tulioaoki
 */
@ApplicationScoped
public class dao {
    private static dao mInstance;
    private final ArrayList<Sight> sights;
    private final ArrayList<Barrel> barrels;    
    private final ArrayList<Bullet> bullets;
    private final ArrayList<ButtStock> buttstocks;    
    private final ArrayList<Magazine> magazines;
    private final ArrayList<Gun> guns;
    
    public static dao getInstance() {
        if(mInstance == null) mInstance = new dao();
        return mInstance;
    }
    
    private dao() {
        sights = new ArrayList();
        barrels = new ArrayList();
        bullets = new ArrayList();
        buttstocks = new ArrayList();
        magazines = new ArrayList();
        guns = new ArrayList();
    }
    
    public ArrayList getSights(){
        return this.sights;
    }
    
    public void insertSight(Sight s){
        sights.add(s);
    }
    
    public boolean SightIsIn(int id){
        return this.getSight(id) != null;
    }
    
    public Sight getSight(int id){
        for(Sight s: sights){
            if(s.getId() == id){
                return s;
            }
        }
        return null;
    }
    
    public void deleteSight(int id){
        Sight sig = this.getSight(id);
        sights.remove(sig);
    }
    
    public void replaceSight(Sight newSight, int id){
        Sight oldSight = this.getSight(id);
        int index = sights.indexOf(oldSight);
        sights.set(index, newSight);
    }
    
    public ArrayList getMagazines(){
        return this.magazines;
    }
    
    public void insertMagazines(Magazine m){
        magazines.add(m);
    }
    
}
