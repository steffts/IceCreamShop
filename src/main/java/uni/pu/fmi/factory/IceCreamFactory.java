package uni.pu.fmi.factory;

public class IceCreamFactory {
    public IceCream createIceCream(String type) {
        return switch (type.toLowerCase()){
            case "шоколад" -> new ChocolateIceCream();
            case "ванилия" -> new VanillaIceCream();
            case "ягода" -> new StrawberryIceCream();
            default -> throw new IllegalArgumentException("Няма такъв сладолед");

        };
    }
}