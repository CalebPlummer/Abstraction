/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraction;

/**
 *
 * @author cplummer
 */
public class Eagle extends Bird implements IFly, ISwim, IWalk, IMakeSound{
    private String name;
    private int Wingspan = 89;

    public Eagle(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println(name + " begins to fly in the air.");
    }

    @Override
    public void swim() {
        System.out.println(name + " swims in the water.");
    }

    @Override
    public void walk() {
        System.out.println(name + " begins to walk forward");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " makes a screech");
    }
    
    String getName() {
        return name;
    }
    
    int getWingspan() {
        return Wingspan;
    }
    
}
