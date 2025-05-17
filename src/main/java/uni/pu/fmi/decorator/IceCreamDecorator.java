package uni.pu.fmi.decorator;


import uni.pu.fmi.factory.IceCream;

public abstract class IceCreamDecorator extends IceCream {
    protected IceCream tempIceCream;

    public IceCreamDecorator(IceCream iceCream) {
        this.tempIceCream = iceCream;
    }

    public String getDescription() {
        return tempIceCream.getDescription();
    }

    public Double getPrice() {
        return tempIceCream.getPrice();
    }
}