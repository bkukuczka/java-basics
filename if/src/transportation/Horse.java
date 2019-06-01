package transportation;

public class Horse {
    private int priceForHundredKilometers = 10;

    public int calculatePrice(int distance){
        return distance * priceForHundredKilometers / 100;
    }
}
