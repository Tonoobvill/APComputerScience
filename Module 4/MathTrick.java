 /**
 * @author Timo Fauxnam
 * @version December 12, 2024
 * Class: AP Computer Science A
 * Assignment: 04.07 Challenge Program / MathTrick
 * Purpose: APRILFOOL from randomly generated numbers
 */
 /**
 * PMR
 *<+s>: Successfully makes random math make APRILFOOL
 *<-s>: Had troubles with first and third digits differ by more than one
 */
public class MathTrick {

    public static void main(String[] args) {
        // Generate a random 3-digit number so that the first and third digits differ by more than one
        int startingNumber = generateRandomNumber();
        System.out.println("The starting number: " + startingNumber);

        // Now reverse the digits to form a second number
        int reversedNumber = reverseNumber(startingNumber);
        System.out.println("The reversed number: " + reversedNumber);

        // Subtract the smaller number from the larger one
        int difference = Math.abs(startingNumber - reversedNumber);
        System.out.println("The difference is: " + difference);

        // Now reverse the digits in the answer you got in step c and add it to that number
        int reversedDifference = reverseNumber(difference);
        int sum = difference + reversedDifference;
        System.out.println("The reversed number added to difference: " + sum);

        // Multiply by one million
        long multiplied = sum * 1000000;
        System.out.println("Number x one million: " + multiplied);

        // Subtract 733,361,573
        long subtracted = multiplied - 733361573;
        System.out.println("Number subtracted and converted to String: " + subtracted);

        // Then, replace each of the digits in your answer, with the letter it corresponds to using the following table
        String replacedString = replaceDigitsWithLetters(String.valueOf(subtracted));
        System.out.println("Replaced string: " + replacedString);

        // Now reverse the letters in the string to read your message backward
        String reversedString = new StringBuilder(replacedString).reverse().toString();
        System.out.println("Reversed string: " + reversedString);
    }

    // Generate a random 3-digit number where the first and third digits differ by more than 1
    public static int generateRandomNumber() {
        int first, third;
        do {
            int number = (int) (Math.random() * 900) + 100; // Random number between 100 and 999
            first = number / 100;
            third = number % 10;
            if (Math.abs(first - third) > 1) {
                return number;
            }
        } while (true);
    }

    // Reverse the digits of a number
    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return reversed;
    }

    // Replace digits with corresponding letters
    public static String replaceDigitsWithLetters(String number) {
        return number.replace('0', 'Y')
                     .replace('1', 'M')
                     .replace('2', 'P')
                     .replace('3', 'L')
                     .replace('4', 'R')
                     .replace('5', 'O')
                     .replace('6', 'F')
                     .replace('7', 'A')
                     .replace('8', 'I')
                     .replace('9', 'B');
    }
}
