/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builders;

import arma.Barrel;
import arma.ButtStock;
import arma.Gun;
import arma.Item;
import arma.Magazine;
import arma.Sight;
import java.util.ArrayList;

/**
 *
 * @author tulioaoki
 */
public class GunBuilder extends Builder{

    
    private String name;
    private int precision;
    private int recoil;
    private int sound;
    private int range;
    private int damage;
    private int capacity;
    private float weight;

    private int id;
    
    public GunBuilder(int id){
        name = "default";
        this.id = id;
    }

    
    public GunBuilder setName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * @param precision the precision to set
     * @return 
     */
    public GunBuilder setPrecision(int precision) {
        this.precision = precision;
        return this;
    }

    /**
     * @param recoil the recoil to set
     * @return 
     */
    public GunBuilder setRecoil(int recoil) {
        this.recoil = recoil;
        return this;
    }

    /**
     * @param sound the sound to set
     * @return 
     */
    public GunBuilder setSound(int sound) {
        this.sound = sound;
        return this;
    }

    /**
     * @param range the range to set
     * @return 
     */
    public GunBuilder setRange(int range) {
        this.range = range;
        return this;
    }

    /**
     * @param damage the damage to set
     * @return 
     */
    public GunBuilder setDamage(int damage) {
        this.damage = damage;
        return this;
    }

    /**
     * @param capacity the capacity to set
     * @return 
     */
    public GunBuilder setCapacity(int capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * @param weight the weight to set
     * @return 
     */
    public GunBuilder setWeight(float weight) {
        this.weight = weight;
        return this;
    }

    
    
    @Override
    public Gun build(){
        return new Gun(name,precision,recoil,sound,range,weight,null,null,null,null,id);
    }
    
}
