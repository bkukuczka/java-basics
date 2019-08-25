import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String dough;
    private String sauce;
    private String cheesse;
    private List<String> ingredients;

    public Pizza(String dough, String sauce, String cheesse, List<String> ingredients) {
        this.dough = dough;
        this.sauce = sauce;
        this.cheesse = cheesse;
        this.ingredients = ingredients;
    }

    public String getDough() {
        return dough;
    }

    public String getSauce() {
        return sauce;
    }

    public String getCheesse() {
        return cheesse;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public static class PizzaBuilder {
        private String dough;
        private String sauce;
        private String cheesse;
        private List<String> ingredients;

        public PizzaBuilder dough(String dough) {
            this.dough = dough;
            return this;
        }

        public PizzaBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public PizzaBuilder cheesse(String cheesse) {
            this.cheesse = cheesse;
            return this;
        }

        public PizzaBuilder addIngredient(String ingredient) {
            if (ingredient == null) {
                ingredients = new ArrayList<String>();
            }

            ingredients.add(ingredient);

            return this;
        }

        public Pizza bake() {
            return new Pizza(this.dough, this.sauce, this.cheesse, this.ingredients);
        }
    }
}
