
package arma;

import builders.BarrelBuilder;
import builders.BulletBuilder;
import builders.ButtStockBuilder;
import builders.GunBuilder;
import builders.MagazineBuilder;
import builders.SightBuilder;
import builders.ArmaBuilder;
import memento.Memento;



public class Arma {
    
    
    public static void main(String[] args) throws CloneNotSupportedException {
       Memento.load();
       Memento.save();
       
       Sight s = new SightBuilder(9).setModPrecission(10).setWeight(10).build();
       Barrel b = new BarrelBuilder(9).setModRange(1).setWeight(1).setmodSound(1).build();
       ButtStock bs = new ButtStockBuilder(9).build();
       Bullet bul = new BulletBuilder(9).build();
       Magazine m = new MagazineBuilder(9).build();
       m.addCompatibility(bul);
       m.load(bul);
       Gun g = new GunBuilder(1)
               .setCapacity(30)
               .setDamage(10)
               .setName("Teste")
               .setRecoil(10)
               .setSound(80)
               .setWeight(10)
               .setRange(900)
               .build();
       
       g = new ArmaBuilder(g).setBarrel(b).setButtstock(bs).setMagazine(m).setSight(s).build();
       Gun nova =(Gun) g.clone();
               
        System.out.println(g+"\n\n\n"+nova+"\n\n\n");
       System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"+Memento.getState());
    }
    
    
}
