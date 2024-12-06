 /**
 * @author Alex Pisoni
 * @version December 6, 2024
 * Class: AP Computer Science A
 * Assignment: 04.03 Reading Text Files / Family
 * Purpose: Calculate percentage of family members
 */
 /**
 * PMR
 *<+s>: 
 *<-s>: Had file linked wrong
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Family {
    public static void main(String[] args) {
        // File name (update the file path if necessary)
        String fileName = "familyMembers.txt";
        
        // Initialize counters for family types
        int twoBoys = 0;
        int twoGirls = 0;
        int oneBoyOneGirl = 0;
        int totalFamilies = 0;

        try {
            // Open the file
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            // Process each line in the file
            while (scanner.hasNextLine()) {
                String family = scanner.nextLine().trim();

                // Count family combinations
                switch (family) {
                    case "BB":
                        twoBoys++;
                        break;
                    case "GG":
                        twoGirls++;
                        break;
                    case "BG":
                    case "GB":
                        oneBoyOneGirl++;
                        break;
                }
            }
            scanner.close();

            // Calculate total families
            totalFamilies = twoBoys + twoGirls + oneBoyOneGirl;

            // Calculate percentages
            double percentTwoBoys = (double) twoBoys / totalFamilies * 100;
            double percentTwoGirls = (double) twoGirls / totalFamilies * 100;
            double percentOneBoyOneGirl = (double) oneBoyOneGirl / totalFamilies * 100;

            // Print results
            System.out.println("Composition statistics for families with two children.\n");
            System.out.printf("Total number of families: %d\n\n", totalFamilies);
            System.out.printf("Number of families with 2 boys: %d represents %.2f%%\n", twoBoys, percentTwoBoys);
            System.out.printf("Number of families with 2 girls: %d represents %.2f%%\n", twoGirls, percentTwoGirls);
            System.out.printf("Number of families with 1 boy and 1 girl: %d represents %.2f%%\n", oneBoyOneGirl, percentOneBoyOneGirl);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (ArithmeticException e) {
            System.out.println("Error: No families found in the file.");
        }
    }
}
