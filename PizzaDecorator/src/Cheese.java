public class Cheese extends ToppingMaker{

    Cheese(PizzaMaker pizza) {
        super(pizza);
    }

    public int cost()
    {
        return super.cost() + 2;
    }

    @Override
    public String getDesc() {
        return " Added cheese";
    }
}
