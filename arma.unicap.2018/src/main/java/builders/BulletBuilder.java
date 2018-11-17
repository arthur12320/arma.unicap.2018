/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builders;

import arma.Bullet;

/**
 *
 * @author tulioaoki
 */
public class BulletBuilder extends Builder{
    private String name;
    private int modSound;
    private int modDamage;
    private float weight;
    private int id;
    
    public BulletBuilder(int id){
        name = "default";
        this.id = id;
    }

    public BulletBuilder setModRange(int modDamage) {
        this.modDamage = modDamage;
        return this;
    }

    public BulletBuilder setWeight(float weight) {
        this.weight = weight;
        return this;
    }
    
    public BulletBuilder setmodSound(int mod) {
        this.modSound = mod;
        return this;
    }
    
    public BulletBuilder setName(String name) {
        this.name = name;
        return this;
    }
    
    @Override
    public Bullet build(){
        return new Bullet(name,modDamage,modSound,weight,id);
    }
}
