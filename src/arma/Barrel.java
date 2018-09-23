
package arma;

/**
 *
 * @author arthur
 */
public class Barrel extends Item{
    private String name;
    private int modSound;
    private int modRange;
    private float weight;
    private String camo;


    public Barrel(String name, int modSound, int modRange, float weight, int id) {
        super(id);
        this.name = name;
        this.modSound = modSound;
        this.modRange = modRange;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModSound() {
        return modSound;
    }

    public void setModSound(int modSound) {
        this.modSound = modSound;
    }

    public int getModRange() {
        return modRange;
    }

    public void setModRange(int modRange) {
        this.modRange = modRange;
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
        tstring.append("name: ").append(this.name).append(" ID: ").append(this.getId()).append(" sound modifier: ").append(this.modSound).append(" range modifier: ").append(this.modRange).append(" weight: ").append(this.weight);
        return tstring.toString();
                
    }
    
    
}
