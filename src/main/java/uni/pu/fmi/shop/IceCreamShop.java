package uni.pu.fmi.shop;

public class IceCreamShop {
    private static IceCreamShop instance;

    private IceCreamShop() {
        System.out.println("Добре дошли!");
    }

    public static IceCreamShop getInstance() {
        if (instance == null) {
            instance = new IceCreamShop();
        }
        return instance;
    }

    public void serveClient(String clientName) {
        System.out.println(clientName + " беше обслужен.");
    }
}