/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simuduck;

/**
 *
 * @author Tyler
 */
public class Quack implements QuackBehavior{
    @Override
    public void quack(){
        System.out.println("Quack!");
    }
}
