package pizzastore.fooditems;

public class MexicanGreenWavePizza implements FoodItemInterface{

    @Override
    public String getName() {
        return "Mexican Green Wave Pizza";
    }

    @Override
    public double getPrice() {
        return 180.00;
    }
}
