/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simuduck;

/**
 *
 * @author Tyler
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard Duck!");
    }
}
