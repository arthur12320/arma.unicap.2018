/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builders;

import arma.Barrel;

/**
 *
 * @author tulioaoki
 */
public class BarrelBuilder extends Builder{
    private String name;
    private int modSound;
    private int modRange;
    private float weight;
    private int id;
    
    public BarrelBuilder(int id){
        name = "default";
        this.id = id;
    }

    public BarrelBuilder setModRange(int modRange) {
        this.modRange = modRange;
        return this;
    }

    public BarrelBuilder setWeight(float weight) {
        this.weight = weight;
        return this;
    }
    
    public BarrelBuilder setmodSound(int mod) {
        this.modSound = mod;
        return this;
    }
    
    public BarrelBuilder setName(String name) {
        this.name = name;
        return this;
    }
    
    @Override
    public Barrel build(){
        return new Barrel(name,modSound,modRange,weight,id);
    }
}
