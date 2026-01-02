package LW_03;

import java.util.Scanner;

class Temperature {
    private double celsius;


    public Temperature() {
        this.celsius = 0;
    }


    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }


    public double getFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }


    public void setFahrenheit(double fahrenheit) {
        this.celsius = (fahrenheit - 32) * 5 / 9;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Temperature temp = new Temperature();

        System.out.print("Enter temperature in Celsius: ");
        double c = scanner.nextDouble();

        temp.setCelsius(c);
        System.out.println("Temperature in Fahrenheit: " + temp.getFahrenheit());
    }
}