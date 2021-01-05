package pizzastore.fooditems;

public class MargheritaPizza implements FoodItemInterface {

    @Override
    public String getName() {
        return "Margherita Pizza";
    }

    @Override
    public double getPrice() {
        return 100.00;
    }
}
