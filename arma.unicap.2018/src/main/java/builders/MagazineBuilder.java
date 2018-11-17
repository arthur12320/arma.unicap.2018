/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builders;

import arma.Bullet;
import arma.Item;
import arma.Magazine;
import java.util.ArrayList;

/**
 *
 * @author tulioaoki
 */
public class MagazineBuilder extends Builder{
    private String name;
    private int capacity;
    private final ArrayList<Item> compatibility;
    private final Bullet ammo;
    private final int id;
    
    public MagazineBuilder(int id){
        name = "default";
        this.compatibility = null;
        this.ammo = null;
        this.id = id;
    }
    
    public MagazineBuilder setcapacity(int mod) {
        this.capacity = mod;
        return this;
    }
    
    public MagazineBuilder setName(String name) {
        this.name = name;
        return this;
    }
    
    @Override
    public Magazine build(){
        return new Magazine(name,capacity,id);
    }
}
