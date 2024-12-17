 /**
 * @author Timo Fauxnam
 * @version December 17, 2024
 * Class: AP Computer Science A
 * Assignment: 05.02 Defining Static Methods Part 2 / PlanetGravity
 * Purpose: Calculate planets gravity based off mass and radius
 */
/**
 * PMR
 * <+s>: Made surface gravity calculation for planets
 * <-s>: Jupiter and Saturn had formatting issues
 */
public class PlanetGravity {

    // Gravitational Constant
    public static final double G = 6.67430e-11;

    public static void main(String[] args) {
        // Planetary data: Names, diameters (km), and masses (kg)
        String[] planetNames = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        double[] diametersKm = {4880, 12103.6, 12756.3, 6794, 142984, 120536, 51118, 49532};
        double[] massesKg = {3.30e23, 4.869e24, 5.972e24, 6.4219e23, 1.900e27, 5.68e26, 8.683e25, 1.0247e26};

        // Display the output header
        displayHeader();

        // Loop through the planets to calculate and display surface gravity
        for (int i = 0; i < planetNames.length; i++) {
            double radiusM = (diametersKm[i] * 1000) / 2; // Convert diameter to radius in meters
            double surfaceGravity = calculateSurfaceGravity(massesKg[i], radiusM);
            displayPlanetData(planetNames[i], diametersKm[i], massesKg[i], surfaceGravity);
        }
    }

    // Method to calculate surface gravity (g)
    public static double calculateSurfaceGravity(double mass, double radius) {
        return (G * mass) / Math.pow(radius, 2);
    }

    // Method to display the header
    public static void displayHeader() {
        System.out.printf("%-10s %-15s %-20s %-10s\n", "Planet", "Diameter (km)", "Mass (kg)", "g (m/s^2)");
        System.out.println("--------------------------------------------------------------");
    }

    // Method to display planet data
    public static void displayPlanetData(String name, double diameter, double mass, double gravity) {
        System.out.printf("%-10s %-15.1f %-20.3e %-10.2f\n", name, diameter, mass, gravity);
    }
}
