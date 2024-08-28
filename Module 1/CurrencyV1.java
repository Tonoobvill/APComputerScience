/**
 * Name: Timo Fauxnam
 * Date: August 28, 2024
 * Class: AP Computer Science A
 * Assignment: 01.13 Challenge Program / CurrencyV1
 * Purpose: Convert currencies using exchange rates.
 */
 /**
 * PMR
 *<+s>: IT'S WORKING I GOT IT WORKING.
 *<-s>: I used two sheets of paper trying to figure this out...
 */
public class CurrencyV1 {
    public static void main(String[] args) {
        // Declare and initialize local variables
        double startingUsDollars = 6500.00;   // Starting US Dollars

        // Mexico
        double pesosSpent = 7210.25;          // Mexican Pesos spent
        double pesoExchangeRate = 18.62;      // 1 US dollar = 18.62 Pesos
        double dollarsSpentInMexico;          // US dollars spent in Mexico
        double dollarsAfterMexico;            // US dollars remaining after Mexico

        // Japan
        double yenSpent = 50000;              // Japanese Yen spent
        double yenExchangeRate = 136.99;      // 1 US dollar = 136.99 Yen
        double dollarsSpentInJapan;           // US dollars spent in Japan
        double dollarsAfterJapan;             // US dollars remaining after Japan

        // Germany
        double euroSpent = 350.75;            // Euros spent
        double euroExchangeRate = 0.85;       // 1 US dollar = 0.85 Euros
        double dollarsSpentInGermany;         // US dollars spent in Germany
        double dollarsAfterGermany;           // US dollars remaining after Germany

        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        
        // Conversion for Mexico
        dollarsSpentInMexico = pesosSpent / pesoExchangeRate; // Convert pesos to USD
        dollarsAfterMexico = startingUsDollars - dollarsSpentInMexico; // Remaining USD after Mexico
        System.out.println("Mexico:");
        System.out.println("  Spent " + pesosSpent + " Pesos (" + String.format("%.2f", dollarsSpentInMexico) + " USD)");
        System.out.println("  Remaining budget: $" + String.format("%.2f", dollarsAfterMexico) + "\n");

        // Conversion for Japan
        dollarsSpentInJapan = yenSpent / yenExchangeRate; // Convert yen to USD
        dollarsAfterJapan = dollarsAfterMexico - dollarsSpentInJapan; // Remaining USD after Japan
        System.out.println("Japan:");
        System.out.println("  Spent " + yenSpent + " Yen (" + String.format("%.2f", dollarsSpentInJapan) + " USD)");
        System.out.println("  Remaining budget: $" + String.format("%.2f", dollarsAfterJapan) + "\n");

        // Conversion for Germany
        dollarsSpentInGermany = euroSpent / euroExchangeRate; // Convert euros to USD
        dollarsAfterGermany = dollarsAfterJapan - dollarsSpentInGermany; // Remaining USD after Germany
        System.out.println("Germany:");
        System.out.println("  Spent " + euroSpent + " Euros (" + String.format("%.2f", dollarsSpentInGermany) + " USD)");
        System.out.println("  Remaining budget: $" + String.format("%.2f", dollarsAfterGermany) + "\n");

        // Souvenir Purchases
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Souvenir Purchases");
        System.out.println(" (all values in US Dollars) ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // Calculations for Souvenir #1
        int costItem1 = 12;                        // Cost per item of first souvenir
        int budget1 = 100;                         // Budget for first item
        int totalItems1 = budget1 / costItem1;     // How many items can be purchased
        int fundsRemaining1 = budget1 % costItem1; // How much of the budget is left

        System.out.println("Item 1");
        System.out.println("   Cost per item: $" + costItem1);
        System.out.println("   Budget: $" + budget1);
        System.out.println("   Total items purchased: " + totalItems1);
        System.out.println("   Funds remaining: $" + fundsRemaining1);
        System.out.println();

        // Calculations for Souvenir #2
        double costItem2 = 29.99;                      // Cost per item of second souvenir
        int budget2 = 500;                             // Budget for second item
        int totalItems2 = (int) (budget2 / costItem2); // How many items can be purchased (using casting)
        double fundsRemaining2 = budget2 % costItem2;  // How much of the budget is left (using modulus)

        System.out.println("Item 2");
        System.out.println("   Cost per item: $" + costItem2);
        System.out.println("   Budget: $" + budget2);
        System.out.println("   Total items purchased: " + totalItems2);
        System.out.println("   Funds remaining: $" + String.format("%.2f", fundsRemaining2));
    }
}
