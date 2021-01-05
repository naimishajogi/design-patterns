package pizzastore;

import pizzastore.fooditems.FoodItemInterface;

public class FoodFactory {
    public static FoodItemInterface getFoodItem(FoodType foodType) {
        return foodType.getFoodItem().get();
    }
}
