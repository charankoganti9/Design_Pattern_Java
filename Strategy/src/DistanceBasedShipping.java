public class DistanceBasedShipping implements ShippingStrategy{

    private double ratePerKM;

    public DistanceBasedShipping(double ratePerKM) {
        this.ratePerKM = ratePerKM;
    }

    @Override
    public double calculateCost(Order order) {
        String zone = order.getDestinationZone();
        if (zone == null){ zone = "default";}
        System.out.println("Calculating with Distance-Based strategy for zone: " + zone);
        return switch(zone){
            case "ZoneA"-> ratePerKM * 5.0;
            case "ZoneB"-> ratePerKM * 7.0;
            default-> ratePerKM * 10.0;
        };
    }
}
