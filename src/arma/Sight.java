
package arma;


/**
 *
 * @author arthur
 */
public class Sight extends Item implements Camo {
    
    private String name;
    private int modPrecission;
    private float weight;
    private String camo;
    
    public Sight(String name, int modPrecission, float weight, int id) {
        super(id);
        this.name = name;
        this.modPrecission = modPrecission;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModPrecission() {
        return modPrecission;
    }

    public void setModPrecission(int modPrecission) {
        this.modPrecission = modPrecission;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    public void putStyle(String type){
        
        this.camo = type;
        
    }
    
    public void removeStyle(){
        
        if(this.camo != null){
            
            this.camo = null;
        
        }else{
            
            System.out.println("this sight has no camouflage ");
        }
    }
    
    public String getStyle(){
       
        return this.camo;
    }   
   
    
    @Override
    public String toString(){
      StringBuilder tstring = new StringBuilder();
      tstring.append("name: ").append(this.name).append(" ID: ").append(this.getId()).append(" precision modifier: ").append(this.modPrecission).append(" weight: ").append(this.weight);
      return tstring.toString();
    }
    
}
