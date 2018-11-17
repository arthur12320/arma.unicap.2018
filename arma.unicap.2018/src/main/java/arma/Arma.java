
package arma;

import memento.Memento;



public class Arma {
    
    
    public static void main(String[] args) {
       Memento.load();
       Memento.save();
       
       System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"+Memento.getState());
    }
    
    
}
