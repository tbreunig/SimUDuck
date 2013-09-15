
package simuduck;
/**
 *
 * @author Tyler
 */
public class SimUDuck {

    public static void main(String[] args) {
    
     Duck mallard = new MallardDuck();
     mallard.performQuack();
     mallard.performFly();
    
    Duck model = new ModelDuck();
    model.performFly();
    model.setFlyBehavior(new FlyRocketPowered());
    model.performFly();
    }   
}
