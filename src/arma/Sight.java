
package arma;

/**
 *
 * @author arthur
 */
public class Sight extends Item {
    private String name;
    private int modPrecission;
    private float weight;
    
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
        
    @Override
    public String toString(){
      StringBuilder tstring = new StringBuilder();
      tstring.append("name: ").append(this.name).append(" ID: ").append(this.getId()).append(" precision modifier: ").append(this.modPrecission).append(" weight: ").append(this.weight);
      return tstring.toString();
    }
    
}
