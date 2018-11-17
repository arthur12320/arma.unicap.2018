/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builders;

import arma.Sight;

/**
 *
 * @author tulioaoki
 */
public class SightBuilder extends Builder{
    private String name;
    private int modPrecission;
    private float weight;
    private int id;
    
    public SightBuilder(int id){
        name = "default";
        this.id = id;
    }

    public SightBuilder setModPrecission(int modPrecission) {
        this.modPrecission = modPrecission;
        return this;
    }

    public SightBuilder setWeight(float weight) {
        this.weight = weight;
        return this;
    }
    
    public SightBuilder setName(String name) {
        this.name = name;
        return this;
    }
    
    @Override
    public Sight build(){
        return new Sight(name,modPrecission,weight,id);
    }
}
