/**
 * @author Timo Fauxnam
 * @version November 4, 2024
 * Class: AP Computer Science A
 * Assignment: 02.09 Calling Methods in Java / MakingMethodCalls
 * Purpose: Calculate the hypotenuse of two triangles
 */
 /**
 * PMR
 *<+s>: Just took a couple mintues
 *<-s>: Java compiler kept giving me an error, fixed by moving folders.
 */
public class MakingMethodCalls
{
    public static void addTheseTwo()
    {
        System.out.println("Ten plus five equals " + (10 + 5));
    }  
   
    public static void multiplyTheseTwo(int a, int b)
    {
        System.out.println("Ten times five equals " + (a * b));
    }  
   
    public static int divideTheseTwo(int a, int b)
    {
        return (a / b);
    }    
   
    public static void main(String[] args)
    {
        int x = 10;
        int y = 5;
       
        /**
         * Insert code here that calls one of the above methods that results in.
         * computer printing out "Ten plus five equals 15"
         */
        addTheseTwo();
       
        /**
         * Insert code here that calls one of the above methods that results in.
         * computer printing out "Ten times five equals 50"
         */
        multiplyTheseTwo(x, y);
       
       
        /**
         * Insert code here that calls one of the above methods that results in.
         * computer printing out "Ten divided by five equals 2"
         */
        int result = divideTheseTwo(x, y);
        System.out.println("Ten divided by five equals " + result);
       
    }//end of main method
}//end of class