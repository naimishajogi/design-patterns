package order;

public abstract class Order {
    String description = "Empty Oder";

    public String getDescription(){
        return description;
    }

    public abstract int getCost();
}
