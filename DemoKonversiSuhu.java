package suhu;

public class DemoKonversiSuhu {
     public static void main(String[] args) {
        // Create instances of both classes
        KonversiSuhu konversi1 = new KonversiSuhu();
        KonversiSuhu2 konversi2 = new KonversiSuhu2();
        
        // Example Celsius value
        double celcius = 100;
        // Convert and display using methods from KonversiSuhu
        System.out.println("Celsius to Fahrenheit: " + konversi1.celciusToFahrenheit(celcius));
        System.out.println("Celsius to Reamur: " + konversi1.celciusToReamur(celcius));

        // Example Fahrenheit value
        double fahrenheit = 212;
        // Convert and display using method from KonversiSuhu2
        System.out.println("Fahrenheit to Reamur: " + konversi2.fahrenheitToReamur(fahrenheit));
    }
}