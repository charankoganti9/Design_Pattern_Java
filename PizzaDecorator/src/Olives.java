public class Olives extends ToppingMaker{

    Olives(PizzaMaker pizza)
    {
        super(pizza);
    }

    @Override
    public int cost() {
        return super.cost()+2;
    }

    @Override
    public String getDesc() {
        return " Added Olives";
    }
}
