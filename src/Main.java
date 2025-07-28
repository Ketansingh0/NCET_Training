import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static double FahrenheitToCelsius(double f){
        return (f - 32) * 5/9;
    }
    static double FahrenheitToKelvin(double f){
        double celsius = (f - 32) * 5/9;
        return (celsius + 273.15);
    }
    static double CelsiusToFahrenheit(double c){
        return (c * 9/5) + 32;
    }
    static double CelsiusToKelvin(double c){
        return (c + 273.15);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Temperature Conversion Menu:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Fahrenheit to Kelvin");
        System.out.println("3. Celsius to Fahrenheit");
        System.out.println("4. Celsius to Kelvin");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter temperature value: ");
        double temp = sc.nextDouble();

        switch (choice) {
            case 1:
                System.out.printf("Result: %.2f °C\n", FahrenheitToCelsius(temp));
                break;
            case 2:
                System.out.printf("Result: %.2f K\n", FahrenheitToKelvin(temp));
                break;
            case 3:
                System.out.printf("Result: %.2f °F\n", CelsiusToFahrenheit(temp));
                break;
            case 4:
                System.out.printf("Result: %.2f K\n", CelsiusToKelvin(temp));
                break;
            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}