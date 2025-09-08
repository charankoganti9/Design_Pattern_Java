public class WeightBasedShipping implements  ShippingStrategy{

    private final double ratePerKG;

    public WeightBasedShipping(double ratePerKG)
    {
        this.ratePerKG = ratePerKG;
    }
    @Override
    public double calculateCost(Order order) {
        System.out.println("Calculating with Weight-Based strategy ($" + ratePerKG + "/kg)");
        return order.getTotalWeight() * ratePerKG;
    }
}
