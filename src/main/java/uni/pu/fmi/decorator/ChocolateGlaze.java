package uni.pu.fmi.decorator;

import uni.pu.fmi.factory.IceCream;

public class ChocolateGlaze extends IceCreamDecorator {
    public ChocolateGlaze(IceCream iceCream) {
        super(iceCream);
    }
     public String getDescription() {
        return tempIceCream.getDescription() + " с шоколадова глазура";
     }

     public Double getPrice() {
        return tempIceCream.getPrice() + 0.5;
     }
}