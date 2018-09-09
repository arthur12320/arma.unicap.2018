
package arma;

import java.util.ArrayList;

/**
 *
 * @author arthur
 */
public class Magazine extends Item{
    private String name;
    private int capacity;
    private ArrayList<Item> compatibility;
    private Bullet ammo;

    public Magazine(String name, int capacity,int id) {
        super(id);
        this.name = name;
        this.capacity = capacity;
        this.compatibility = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    public void addCompatibility(Item i){
        this.compatibility.add(i);
    }
    
    public void load(Bullet b){
        if(b.compatible(this.compatibility)){ 
            this.ammo = b;
        }
        
    }
    
    public void unload(){
       this.ammo = null;
    }
    
    @Override
    public String toString(){
        String ammot = (this.ammo == null)?"null":this.ammo.getName();
        
        return "name: " + this.name + "\nID: "+ this.getId() + "\ncapacity: " + this.capacity + "\nBullet: " + ammot; 
    }
    
    
}
