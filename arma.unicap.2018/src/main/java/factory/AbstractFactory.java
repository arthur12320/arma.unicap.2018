package factory;

/**
 *
 * @author tulioaoki
 */
public abstract class AbstractFactory {

    public AbstractFactory(){
    }
    
    public static Factory getFactory(String tipo){
        switch(tipo){
            case("barrel"):
                return new BarrelDaoFactory();
            case("bullet"):
                return new BulletDaoFactory();
            case("buttstock"):
                return new ButtStockDaoFactory();
            case("gun"):
                return new GunDaoFactory();
            case("magazine"):
                return new MagazineDaoFactory();
            case("sight"):
                return new SightDaoFactory();
            default:
                return null;
        }
    }
    
}
