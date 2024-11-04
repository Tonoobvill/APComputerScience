 /**
 * @author Timo Fauxnam
 * @version November 4, 2024
 * Class: AP Computer Science A
 * Assignment: 02.10 Challenge Program / BuyMovieTickets
 * Purpose: Purchase movie tickets
 */
 /**
 * PMR
 *<+s>: Used new elements than before
 *<-s>: Took forever to find out how to separate name.
 */
import java.util.Scanner;

public class BuyMovieTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for user information
        System.out.print("Good Evening.\nPlease enter your first and last name: ");
        String fullName = scanner.nextLine();
        String[] nameParts = fullName.split(" ");
        String firstName = nameParts[0];
        String lastName = nameParts[1];

        System.out.print("Enter today's date (mm/dd/yyyy): ");
        String todayDate = scanner.nextLine();

        System.out.print("What movie would you like to see? ");
        String movieTitle = scanner.nextLine();

        System.out.print("How many tickets? ");
        int numTickets = Integer.parseInt(scanner.nextLine());

        System.out.print("What is the ticket price? $");
        double ticketPrice = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter your debit card number (####-####-####): ");
        String debitCardNumber = scanner.nextLine();

        System.out.print("Enter your PIN (####): ");
        String debitCardPIN = scanner.nextLine();

        // Calculate the total cost
        double totalCost = numTickets * ticketPrice;

        // Generate the order number
        String orderNumber = lastName.substring(0, 3).toUpperCase() + debitCardPIN.substring(2,4);

        // Generate the receipt
        System.out.println("*****************************");
        System.out.println("Your e-Receipt\n");

        System.out.printf("Date: %s\n", todayDate.replaceAll("/", "-"));
        System.out.printf("Order number: %s\n\n", orderNumber);

        System.out.printf("%c. %s\n", firstName.charAt(0), lastName);
        System.out.printf("Account: ####-####-%s\n", debitCardNumber.substring(10));
        System.out.printf("Movie: %s\n", movieTitle);
        System.out.printf("Number of Tickets: %d\n", numTickets);
        System.out.printf("Ticket Price: $%.2f\n\n", ticketPrice);

        System.out.printf("$%.2f will be debited to your account.\n\n", totalCost);

        System.out.println("Thank you. Enjoy your movie tonight.");
        System.out.println("*****************************");

        scanner.close();
    }
}