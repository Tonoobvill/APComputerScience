/**
 * @author Timo Fauxnam
 * @version March 7, 2025
 * Class: AP Computer Science A
 * Assignment: 06.02 Formatting Output / CityWeatherV2.java
 * Purpose: Create a class that stores weather data for a city and can convert the data to different units
 */
/**
 * PMR
 * <+s>: Easy to understand, organized and the methods are well named.
 * <-s>: Struggled with the conversion of the units.
 */
import java.util.Scanner;

public class CityWeatherTesterV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Choose the temperature scale (F = Fahrenheit, C = Celsius): ");
        char tempScale = scanner.next().toLowerCase().charAt(0);
        
        System.out.print("Choose the precipitation scale (i = inches, c = centimeters): ");
        char precipScale = scanner.next().toLowerCase().charAt(0);
        
        String[] months = {"Jan.", "Feb.", "Mar.", "Apr.", "May", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec."};
        double[] temperatures = {51.8, 54.8, 61.1, 66.4, 73.4, 80.4, 82.4, 82.1, 78.2, 69.6, 60.4, 53.7};
        double[] precipitation = {13.7, 11.7, 11.1, 9.1, 8.9, 17.3, 18.5, 17.8, 15.0, 9.3, 9.6, 10.4};
        
        CityWeatherV2 weather = new CityWeatherV2(months, temperatures, precipitation);
        
        if (tempScale == 'c') {
            weather.convertToCelsius();
        }
        if (precipScale == 'i') {
            weather.convertToInches();
        }
        
        weather.printWeatherData(tempScale, precipScale);
        
        scanner.close();
    }
}