package pizzastore.fooditems;

public class FarmHousePizza implements FoodItemInterface{

    @Override
    public String getName() {
        return "Farm House Pizza";
    }

    @Override
    public double getPrice() {
        return 150.00;
    }
}
