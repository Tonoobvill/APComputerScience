/**
 * @author Alex Pisoni
 * @version March 7, 2025
 * Class: AP Computer Science A
 * Assignment: 06.02 Formatting Output / CityWeatherV2.java
 */
class CityWeatherV2 {
    private String[] months;
    private double[] temperatures;
    private double[] precipitation;
    
    public CityWeatherV2(String[] months, double[] temperatures, double[] precipitation) {
        this.months = months;
        this.temperatures = temperatures;
        this.precipitation = precipitation;
    }
    
    public void convertToCelsius() {
        for (int i = 0; i < temperatures.length; i++) {
            temperatures[i] = (temperatures[i] - 32) * 5.0 / 9;
        }
    }
    
    public void convertToInches() {
        for (int i = 0; i < precipitation.length; i++) {
            precipitation[i] = precipitation[i] / 2.54;
        }
    }    
    
    public void printWeatherData(char tempScale, char precipScale) {
        String tempUnit = (tempScale == 'c') ? "(C)" : "(F)";
        String precipUnit = (precipScale == 'c') ? "(cm)" : "(in)";
        
        System.out.printf("%n%-10s %15s %20s%n", "Month", "Temperature " + tempUnit, "Precipitation " + precipUnit);
        System.out.println("********************************************************");
        
        double totalTemp = 0;
        double totalPrecip = 0;
        
        for (int i = 0; i < months.length; i++) {
            System.out.printf("%-10s %15.1f %20.1f%n", months[i], temperatures[i], precipitation[i]);
            totalTemp += temperatures[i];
            totalPrecip += precipitation[i];
        }
        
        double avgTemp = totalTemp / months.length;
        
        System.out.println("********************************************************");
        System.out.printf("%-10s %15.1f %20.1f%n", "Average:", avgTemp, totalPrecip);
    }
}
