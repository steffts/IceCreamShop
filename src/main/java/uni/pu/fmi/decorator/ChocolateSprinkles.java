package uni.pu.fmi.decorator;

import uni.pu.fmi.factory.IceCream;

public class ChocolateSprinkles extends IceCreamDecorator{
    public ChocolateSprinkles(IceCream iceCream) {
        super(iceCream);
    }

    public String getDescription() {
        return tempIceCream.getDescription() + " с шоколадови пръчици";
    }

    public Double getPrice() {
        return tempIceCream.getPrice() + 0.70;
    }
}