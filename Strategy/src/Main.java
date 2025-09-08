//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Order order1  = new Order();
    Order order2 = new Order(12.5, "ZoneA", 200.0);

    ShippingStrategy flatRate = new FlatRateShipping(10.0);
    ShippingStrategy weightBased = new WeightBasedShipping(2.5);
    ShippingStrategy distanceBased = new DistanceBasedShipping(5.0);
    ShippingStrategy thirdParty = new ThirdPartyAPIShipping(5,0.1);

    ShippingCostService shippingService = new ShippingCostService(flatRate);

    System.out.println("--- getTotalWeight 1: Using Flat Rate (initial) ---");
    shippingService.calculateShippingCost(order1);

    System.out.println("\n--- getTotalWeight 1: Changing to Weight-Based ---");
    shippingService.setStrategy(weightBased);
    shippingService.calculateShippingCost(order2);

    System.out.println("\n--- getTotalWeight 1: Changing to Distance-Based ---");
    shippingService.setStrategy(distanceBased);
    shippingService.calculateShippingCost(order2);

    System.out.println("\n--- getTotalWeight 1: Changing to Third-Party API ---");
    shippingService.setStrategy(thirdParty);
    shippingService.calculateShippingCost(order2);
    }
}