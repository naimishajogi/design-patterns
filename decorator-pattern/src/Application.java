import decoratoritems.BlueberryCheeseCake;
import decoratoritems.CheeseBalls;
import decoratoritems.Cola;
import decoratoritems.GarlicBread;
import fooditems.MargheritaPizza;
import order.Order;

public class Application {

    public static void main(String[] args) {
        Order order = new MargheritaPizza();
        order = new Cola(order);
        order = new CheeseBalls(order);
        order = new BlueberryCheeseCake(order);
        order = new GarlicBread(order);

        System.out.println("Your order is "+order.getDescription());
        System.out.println("Total price: "+order.getCost());
    }
}
