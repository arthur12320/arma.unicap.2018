package arma;

import java.util.ArrayList;

public class Gun extends Item {

    private String name;
    private int defaultPrecision;
    private int defaultRecoil;
    private int defaultSound;
    private int defaultRange;
    private float defaultWeight;
    private int precision;
    private int recoil;
    private int sound;
    private int range;
    private int damage;
    private int capacity;
    private float weight;
    private Sight sight;
    private Magazine magazine;
    private ButtStock buttstock;
    private Barrel barrel;
    private ArrayList<Item> compatibility;

    public Gun(String name, int precision, int recoil, int sound, int range, int damage, int capacity, float weight, Sight sight, Magazine magazine, ButtStock buttstock, Barrel barrel, int id) {
        super(id);
        this.name = name;
        
        if(sight == null){
            
            System.out.println("O campo sight não foi inicializado");
        }else{
            
            this.sight = sight;
        }
        if(barrel == null){
            
            System.out.println("O campo barrel não foi inicializado");
        }else{
            
            this.barrel = barrel;
        }
        if(magazine == null){
            
            System.out.println("O campo magazine não foi inicializado");
        }else{
            
            this.magazine = magazine;
        }
        if(buttstock == null){
            
            System.out.println("O campo buttstock não foi inicializado");
        }else{
            
            this.buttstock = buttstock;
        }
        this.defaultPrecision = precision;
        this.defaultRecoil = recoil;
        this.defaultSound = sound;
        this.defaultRange = range;
        this.damage = magazine.getAmmo().getModDamage();
        this.capacity = magazine.getCapacity();
        this.defaultWeight = weight;
    }

    public Gun(int id, String name) {

        super(id);
        this.name = name;
    }

    public int getPrecision() {
        return precision;
    }

    public int getRecoil() {
        return recoil;
    }

    public int getSound() {
        return sound;
    }

    public int getRange() {
        return range;
    }

    public int getDamage() {
        return damage;
    }

    public int getCapacity() {
        return capacity;
    }

    public float getWeight() {
        return weight;
    }

    public void setSight(Sight sight) {

        if (sight.compatible(compatibility)) {

            this.sight = sight;
            recalculate();

        } else {

            System.out.println("This buttstock is not capatible to this gun " + this.name);
        }
    }

    public void setMagazine(Magazine magazine) {
        if (magazine.compatible(compatibility)) {

            this.magazine = magazine;
            recalculate();

        } else {

            System.out.println("This magazine is not capatible to this gun " + this.name);
        }
    }

    public void setButtstock(ButtStock buttstock) {

        if (buttstock.compatible(compatibility)) {

            this.buttstock = buttstock;
            recalculate();

        } else {

            System.out.println("This buttstock is not capatible to this gun " + this.name);
        }
    }

    public void setBarrel(Barrel barrel) {

        if (barrel.compatible(compatibility)) {

            this.barrel = barrel;
            recalculate();

        } else {

            System.out.println("This buttstock is not capatible to this gun " + this.name);
        }
    }

    public void addCompatibility(Item i) { // Esse "item" é a bala
        this.compatibility.add(i);
    }

    public void recalculate() {

        this.weight = defaultWeight;
        this.sound = defaultSound;
        this.precision = defaultPrecision;
        this.range = defaultRange;
        this.recoil = defaultRecoil;

        if (this.sight != null) { // Arma tem um sight novo

            weight = weight + this.sight.getWeight();
            precision = precision + this.sight.getModPrecission();
        }
        if (this.barrel != null) { // Arma também tem um barrel novo

            sound = sound + this.barrel.getModSound();
            weight = weight + this.barrel.getWeight();
            range = range + this.barrel.getModRange();
        }
        if (this.magazine != null) { // Arma também tem um maganize novo

            this.capacity = this.magazine.getCapacity();
            weight = weight + (this.magazine.getCapacity() * this.magazine.getAmmo().getWeight());
            this.damage = this.magazine.getAmmo().getModDamage();
            sound = sound + this.magazine.getAmmo().getModSound();
        } else {

            this.capacity = 0;
            this.damage = 0;
        }
        if (this.buttstock != null) { // Arma também tem tem um buttstock novo

            weight = weight + this.buttstock.getWeight();
            recoil = recoil + this.buttstock.getModRecoi();
        }
        
        System.out.println("Precision: " + this.precision + "\nRecoil: " + this.recoil + "\nSound " + this.sound + "\nRange " + this.range + "\nDamage " + this.damage + "\nCapacity: " + this.capacity + "\nWeight " + this.weight);
    }
    
   @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("ID: ")
                .append(this.getId())
                .append("\nNome: ")
                .append(this.name)
                .append("\nPrecision: ")
                .append(this.precision)
                .append("\nRecoil: ")
                .append(this.recoil)
                .append("\nSound: ")
                .append(this.sound)
                .append("\nRange: ")
                .append(this.range)
                .append("\nDamage: ")
                .append(this.damage)
                .append("\nCapacity: ")
                .append(this.capacity)
                .append("Weight: ")
                .append(this.weight);

        return sb.toString();
    }
}
