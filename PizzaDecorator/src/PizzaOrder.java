import java.util.List;

public class PizzaOrder {
    public static PizzaMaker buildPizza(List<String> toppings) {
        PizzaMaker pizza = new PlainPizza();
        for (String topping : toppings) {
            switch (topping.toLowerCase()) {
                case "cheese" -> pizza = new Cheese(pizza);
                case "olives" -> pizza = new Olives(pizza);
                case "mushrooms" -> pizza = new Mushrooms(pizza);
            }
        }
        return pizza;
    }
    public static void main(String[] args) {
        PizzaMaker pizza1 = buildPizza(List.of("cheese", "olives"));
        PizzaMaker pizza2 = buildPizza(List.of("mushrooms", "pepperoni"));
        PizzaMaker pizza3 = buildPizza(List.of());

        System.out.println("Pizza 1: " + pizza1.getDesc() + " | $" + pizza1.cost());
        System.out.println("Pizza 2: " + pizza2.getDesc() + " | $" + pizza2.cost());
        System.out.println("Pizza 3: " + pizza3.getDesc() + " | $" + pizza3.cost());
    }
}