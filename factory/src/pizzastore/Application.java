package pizzastore;

import pizzastore.fooditems.FoodItemInterface;

public class Application {

    public static void main(String[] args) {
        FoodItemInterface margheritaPizza = FoodFactory.getFoodItem(FoodType.MARGHERITA_PIIZA);
        FoodItemInterface vegExtravangzaPizza = FoodFactory.getFoodItem(FoodType.VEG_EXTRAVANZA_PIZZA);

        System.out.println(String.format("Pizza: %s, pirce : %s rs",vegExtravangzaPizza.getName(), vegExtravangzaPizza.getPrice()));
        System.out.println(String.format("Pizza: %s, pirce : %s rs",margheritaPizza.getName(), margheritaPizza.getPrice()));
    }
}
