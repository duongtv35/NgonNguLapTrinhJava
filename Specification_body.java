package Day1;

import java.util.Scanner;

public class Specification_body {
    public static void main(String[] args) {
        BMI();

    }

    public static void BMI() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter height");
        double height = scanner.nextDouble();
        System.out.println("enter width");
        double weight = scanner.nextDouble();
        double bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.println("underWeight");

        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("overWeight");
        } else {
            System.out.println("obese");
        }
    }

}
