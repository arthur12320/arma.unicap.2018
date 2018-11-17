package builders;

import arma.Barrel;
import arma.ButtStock;
import arma.Gun;
import arma.Item;
import arma.Magazine;
import arma.Sight;
import java.util.ArrayList;

public class ArmaBuilder extends Builder{
    private String name;
    private Gun arma;
    private Sight sight;
    private Magazine magazine;
    private ButtStock buttstock;
    private Barrel barrel;
    
    
    
    public ArmaBuilder(Gun arma){
        this.arma = arma;
    }

    public ArmaBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ArmaBuilder setSight(Sight sight) {
        this.sight = sight;
        return this;
    }

    public ArmaBuilder setMagazine(Magazine magazine) {
        this.magazine = magazine;
        return this;
    }

    public ArmaBuilder setButtstock(ButtStock buttstock) {
        this.buttstock = buttstock;
        return this;
    }

    public ArmaBuilder setBarrel(Barrel barrel) {
        this.barrel = barrel;
        return this;
    }
    
    @Override
    public Gun build(){
        arma.addCompatibility(barrel);
        arma.addCompatibility(buttstock);
        arma.addCompatibility(magazine);
        arma.addCompatibility(sight);
        return arma.setBarrel(barrel).setButtstock(buttstock).setMagazine(magazine).setSight(sight);
    }
    
}
