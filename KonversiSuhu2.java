package suhu;

public class KonversiSuhu2 extends KonversiSuhu {
    // Method to convert Fahrenheit to Reamur
    public double fahrenheitToReamur(double fahrenheit) {
        double celcius = (fahrenheit - 32) * 5/9;
        return celciusToReamur(celcius);
    }
}
