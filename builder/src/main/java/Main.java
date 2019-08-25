import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pizza naszaPizza = new Pizza(
                "grube",
                "pomidorowy",
                "permezan",
                Arrays.asList("szynka", "boczek", "pieczarki"));

        new Pizza.PizzaBuilder()
                .dough("grube")
                .sauce("pomidorowy")
                .cheesse("parmezan")
                .addIngredient("pieczarki")
                .addIngredient("kabanosy")
                .bake();
    }
}
