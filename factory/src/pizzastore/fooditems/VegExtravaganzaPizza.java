package pizzastore.fooditems;

public class VegExtravaganzaPizza implements FoodItemInterface{

    @Override
    public String getName() {
        return "Veg Extravaganza Pizza";
    }

    @Override
    public double getPrice() {
        return 200.00;
    }
}
