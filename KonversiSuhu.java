package suhu;

public class KonversiSuhu {
    // Method to convert Celsius to Fahrenheit
    public double celciusToFahrenheit(double celcius) {
        return (celcius * 9/5) + 32;
    }

    // Method to convert Celsius to Reamur
    public double celciusToReamur(double celcius) {
        return celcius * 4/5;
    }
}