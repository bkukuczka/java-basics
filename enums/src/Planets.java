public enum Planets {
    MERCURY(330.2),
    VENUS(4686.5),
    EARTH(5974.3),
    MARS(641.9),
    JUPITER(1898600.8),
    SATURN(568516.8),
    URANUS(86841),
    NEPTUNE(102439.6);

    private double mass;

    Planets(double mass) {
        this.mass = mass;
    }

    public double getMass(){
        return mass;
    }
}
