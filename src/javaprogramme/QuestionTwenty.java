package javaprogramme;

public class QuestionTwenty {
    public static void main(String[] args) {
        // Receipt details
        String storeName = "CORNER STORE";
        String dateTime = "2015-03-29 04:38PM";
        double gallons = 10.870;
        double pricePerGallon = 2.089;
        double fuelTotal = gallons * pricePerGallon;

        // Define the width for formatting
        int width = 24; // Total width for the inner content

        // Print the receipt
        System.out.println("+------------------------+");
        System.out.println("|                        |");
        System.out.printf("| %-20s   |\n", storeName);
        System.out.println("|                        |");
        System.out.printf("| %-20s   |\n", dateTime);
        System.out.println("|                        |");
        System.out.printf("| Gallons: %-10.3f    |\n", gallons);
        System.out.printf("| Price/gallon: $ %-5.3f  |\n", pricePerGallon);
        System.out.println("|                        |");
        System.out.printf("| Fuel total: $ %-7.2f  |\n", fuelTotal);
        System.out.println("|                        |");
        System.out.println("+------------------------+");
    }
}
