public class ToppingMaker implements PizzaMaker{

    protected final PizzaMaker pizza;

   ToppingMaker(PizzaMaker pizza) {
        this.pizza = pizza;
    }

    public int cost()
    {
        return pizza.cost();
    }

    public String getDesc()
    {
        return pizza.getDesc();
    }

}
