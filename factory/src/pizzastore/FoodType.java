package pizzastore;

import java.util.function.Supplier;

import pizzastore.fooditems.FarmHousePizza;
import pizzastore.fooditems.FoodItemInterface;
import pizzastore.fooditems.MargheritaPizza;
import pizzastore.fooditems.MexicanGreenWavePizza;
import pizzastore.fooditems.VegExtravaganzaPizza;

public enum FoodType {
    FARM_HOUSE_PIZZA(FarmHousePizza::new),
    MARGHERITA_PIIZA(MargheritaPizza::new),
    MEXICAN_GREEN_WAVE_PIZZA(MexicanGreenWavePizza::new),
    VEG_EXTRAVANZA_PIZZA(VegExtravaganzaPizza::new);

    private final Supplier<FoodItemInterface> foodItem;

    FoodType(final Supplier<FoodItemInterface> foodItem) {this.foodItem = foodItem;}

    public Supplier<FoodItemInterface> getFoodItem() {
        return foodItem;
    }
}
