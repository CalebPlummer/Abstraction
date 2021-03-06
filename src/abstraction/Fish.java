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
public abstract class Fish extends Animal{
    boolean isSaltWater;

    public Fish(String name, boolean isSaltWater) {
        super(name);
        this.isSaltWater = isSaltWater;
    }
    
    public String getWaterType() {
         if(isSaltWater)
        {
            return "salt water";
        }
        else
        {
            return "fresh water";
        }
    }
    
    @Override
    public String toString() {
        return name;
    }
}
