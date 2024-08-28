/**
 * @author Timo Fauxnam
 * @version August 27, 2024
 * Class: AP Computer Science A
 * Assignment: 01.09 Primitive Data Type: doubles / CalculationsV6
 * Purpose: Perform calculations on integers and decimals
 */
public class CalculationsV6
{
    public static void main(String[] args)
    {
        // Integer variables
        int iNum1 = 25;
        int iNum2 = 9;
        int iNum3 = 11;
        
        // Double variables
        double dNum1 = 3.14;
        double dNum2 = 10.4;
        double dNum3 = 43.21;

        // Addition
        System.out.println("Addition");
        System.out.println(iNum1 + " plus " + iNum2 + " equals " + (iNum1 + iNum2));
        System.out.println(dNum3 + " plus " + dNum1 + " equals " + (dNum3 + dNum1));
        System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.println(iNum3 + " minus " + iNum2 + " minus " + iNum1 + " equals " + (iNum3 - iNum2 - iNum1));
        System.out.println(dNum1 + " minus " + dNum2 + " equals " + (dNum1 - dNum2));
        System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println(iNum1 + " times " + iNum2 + " equals " + (iNum1 * iNum2));
        System.out.println(dNum1 + " times " + dNum2 + " times " + dNum2 + " equals " + (dNum1 * dNum2 * dNum2));
        System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println(iNum2 + " divided by " + iNum1 + " equals " + (iNum2 / iNum1));
        System.out.println(dNum3 + " divided by " + dNum2 + " equals " + (dNum3 / dNum2));
        System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.println(iNum3 + " % " + iNum2 + " equals " + (iNum3 % iNum2));
        System.out.println(dNum2 + " % " + dNum1 + " equals " + (dNum2 % dNum1));
        System.out.println();
        
        // Additional double Equations
        double dNum6 = 50.5;
        double dNum7 = 15.25;
        double dNum8 = 20.75;

        System.out.println("Additional Expressions");
        System.out.println(dNum6 + " minus " + dNum7 + " plus " + dNum8 + " equals " + (dNum6 - dNum7 + dNum8));
        System.out.println(dNum7 + " times " + dNum8 + " divided by " + dNum1 + " equals " + ((dNum7 * dNum8) / dNum1));
        System.out.println(dNum8 + " modulo " + dNum7 + " plus " + dNum6 + " equals " + ((dNum8 % dNum7) + dNum6));
    }
}
