public class Mushrooms extends ToppingMaker{


    Mushrooms(PizzaMaker pizza) {
        super(pizza);
    }

    @Override
    public int cost() {
        return super.cost()+2;
    }

    @Override
    public String getDesc() {
        return " Added Mushrooms!";
    }
}
