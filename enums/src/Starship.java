public class Starship {
    private Planets actualPlace = Planets.EARTH;

    public void travelTo(Planets planet) {

        System.out.println(String.format("We are on %s. We're going to: %s.",
                actualPlace,
                planet.name()));

        actualPlace = planet;
    }
}
