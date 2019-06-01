package transportation;

public class Plane {
    private int priceForHundredKilometers = 200;

    public int calculatePrice(int distance){
        return distance * priceForHundredKilometers / 100;
    }
}
