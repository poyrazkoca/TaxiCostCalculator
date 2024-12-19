import java.util.Scanner;  // Import Scanner class for user input

public class TaxiCost {
    public static void main(String[] args) {
        // Create Scanner object for reading input
        Scanner input = new Scanner(System.in);

        // Prompt user for trip title
        System.out.print("Trip title: ");
        String tripTitle = input.nextLine();  // Read trip title

        // Prompt user for number of people
        System.out.print("Number of people trip with: ");
        int numberOfPeople = input.nextInt();  // Read number of people

        // Check for valid number of people (between 1 and 4)
        if (numberOfPeople < 1) {
            System.out.println("Error: No need to trip then.");  // Error for less than 1 person
            return;  // Exit program
        } else if (numberOfPeople > 4) {
            System.out.println("Error: Too much person for a taxi.");  // Error for more than 4 people
            return;  // Exit program
        }

        // Prompt user for trip distance
        System.out.print("Distance of the trip (km): ");
        int distance = input.nextInt();  // Read trip distance

        // Define constants for taxi pricing
        final double OPENING_FARE = 35.0;  // Opening fare for taxi
        final double PRICE_PER_KM = 25.0;  // Price per kilometer
        final double MINIMUM_FARE = 100.0; // indi-bindi

        // Calculate total taxi fare
        double totalFare = OPENING_FARE + (distance * PRICE_PER_KM);  // Total fare calculation

        // Ensure the fare is at least the minimum fare
        if (totalFare < MINIMUM_FARE) {
            totalFare = MINIMUM_FARE;  // Round fare to minimum fare if less
        }

        // Calculate cost per person
        double costPerPerson = totalFare / numberOfPeople;

        // Round total fare and cost per person to 2 decimal places
        totalFare = Math.round(totalFare * 100.0) / 100.0;
        costPerPerson = Math.round(costPerPerson * 100.0) / 100.0;

        // Display the results
        System.out.println("Total cost of taxi fare: " + totalFare + " ₺");
        System.out.println("Cost for per person: " + costPerPerson + " ₺");

        // Close the scanner object
        input.close();
    }
}
