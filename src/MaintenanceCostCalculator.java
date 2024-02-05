public class MaintenanceCostCalculator {
    public static void main(String[] args) {
        // Seasonal maintenance costs
        double springCost = 500.00;
        double summerCost = 700.00;
        double autumnCost = 600.00;
        double winterCost = 800.00;

        // Compute total yearly maintenance cost
        double totalYearlyCost = springCost + summerCost + autumnCost + winterCost;

        // Output statements
        System.out.println("Spring maintenance cost: $" + springCost);
        System.out.println("Summer maintenance cost: $" + summerCost);
        System.out.println("Autumn maintenance cost: $" + autumnCost);
        System.out.println("Winter maintenance cost: $" + winterCost);
        System.out.println("----------------------------------");
        System.out.println("Total yearly maintenance cost: $" + totalYearlyCost);
    }
}

