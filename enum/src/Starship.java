public class Starship {
    private Planets actualPlace = Planets.EARTH;

    public void travelTo(Planets planet) {

        System.out.println(String.format("We're going to: %s. We are on %s.",
                planet.name(),
                actualPlace));

        actualPlace = planet;
    }
}
