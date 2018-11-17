package builders;

import arma.ButtStock;

/**
 *
 * @author tulioaoki
 */
public class ButtStockBuilder extends Builder{
    private String name;
    private int modRecoil;
    private float weight;
    private int id;
    
    public ButtStockBuilder(int id){
        name = "default";
        this.id = id;
    }

    public ButtStockBuilder setWeight(float weight) {
        this.weight = weight;
        return this;
    }
    
    public ButtStockBuilder setmodRecoil(int mod) {
        this.modRecoil = mod;
        return this;
    }
    
    public ButtStockBuilder setName(String name) {
        this.name = name;
        return this;
    }
    
    @Override
    public ButtStock build(){
        return new ButtStock(modRecoil,name,weight,id);
    }
}
