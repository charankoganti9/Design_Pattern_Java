public class ThirdPartyAPIShipping implements ShippingStrategy{

    private final double baseFee;
    private final double percentageFee;

    public ThirdPartyAPIShipping(double baseFee, double percentageFee) {
        this.baseFee = baseFee;
        this.percentageFee = percentageFee;
    }

    @Override
    public double calculateCost(Order order) {
        System.out.println("Calculating the Third Part API Strategy.");
        return baseFee + (order.getOrderValue()*percentageFee);
    }
}
