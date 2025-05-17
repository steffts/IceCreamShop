package uni.pu.fmi;

import uni.pu.fmi.decorator.ChocolateGlaze;
import uni.pu.fmi.decorator.ChocolateSprinkles;
import uni.pu.fmi.factory.IceCream;
import uni.pu.fmi.factory.IceCreamFactory;
import uni.pu.fmi.shop.IceCreamShop;


public class Main {
    public static void main(String[] args) {

        IceCreamShop shop = IceCreamShop.getInstance();

        IceCreamFactory factory = new IceCreamFactory();

        IceCream iceCream1 = factory.createIceCream("шоколад");
        iceCream1 = new ChocolateGlaze(iceCream1);

        IceCream iceCream2 = factory.createIceCream("ванилия");
        iceCream2 = new ChocolateSprinkles(iceCream2);

        IceCream iceCream3 = factory.createIceCream("ягода");
        iceCream3 = new ChocolateGlaze(new ChocolateSprinkles(iceCream3));

        System.out.println(iceCream1.getDescription() + " - " + iceCream1.getPrice() + " лв.");
        System.out.println(iceCream2.getDescription() + " - " + iceCream2.getPrice() + " лв.");
        System.out.println(iceCream3.getDescription() + " - " + iceCream3.getPrice() + " лв.");

        shop.serveClient("Иван");
        shop.serveClient("Мария");

    }
}
