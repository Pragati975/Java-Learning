import java.util.Scanner;


class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to unit converter");
        System.out.println("Enter the TEMPERATURE value in fahrenheit:");
        double F = input.nextDouble();

        double celsius = ((F-32)*5)/9;
        System.out.println("the temperature in celsius is:" + celsius);
        input.close();
    }
    
}
