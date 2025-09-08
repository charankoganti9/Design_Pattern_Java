# Strategy Pattern – Shipping Cost Calculator

## Overview
This project demonstrates the **Strategy Design Pattern** using a shipping cost calculator example.  
The Strategy Pattern allows selecting an algorithm's behavior at runtime, making it easy to switch between different shipping calculation strategies without modifying the service logic.

---

## Project Structure

### Classes

- **Order**  
  Represents an order with the following properties:
    - `totalWeight` (double)
    - `destinationZone` (String)
    - `orderValue` (double)

- **ShippingStrategy (Interface)**  
  Declares the method `double calculateCost(Order order)` that all concrete strategies implement.

- **FlatRateShipping**  
  Calculates shipping as a flat fee regardless of weight, zone, or order value.

- **WeightBasedShipping**  
  Calculates shipping cost based on the total weight of the order.  
  Formula: `totalWeight × ratePerKG`.

- **DistanceBasedShipping**  
  Calculates shipping cost based on the destination zone.
    - ZoneA → multiplier 5
    - ZoneB → multiplier 7
    - Default → multiplier 10  
      Formula: `ratePerKM × multiplier`.

- **ThirdPartyAPIShipping**  
  Simulates a third-party API calculation.  
  Formula: `baseFee + (orderValue × percentageFee)`.

- **ShippingCostService**  
  Acts as a context that uses a `ShippingStrategy` object to calculate shipping.
    - `setStrategy()` allows switching strategies at runtime.
    - `calculateShippingCost(Order order)` calculates shipping using the currently set strategy.

- **Main**  
  Demonstrates creating an order and applying different shipping strategies.

---

## How to Run

1. Compile all Java files:
   ```bash
   javac *.java
   
2. Run the Main class:

 ```bash
    java Main
