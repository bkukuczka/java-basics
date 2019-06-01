package transportation;

public class Car {
    private int priceForHundredKilometers = 50;

    public int calculatePrice(int distance) {
        return distance * priceForHundredKilometers / 100;
    }
}
