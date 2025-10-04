public class PlainPizza implements PizzaMaker {
    @Override
    public int cost() {
        return 6;
    }

    @Override
    public String getDesc() {
        return "Making the plain pizza";
    }
    }
