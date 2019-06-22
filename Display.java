package Day1;

import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        print();
    }

    public static void print() {
        System.out.println("please choose a Number");
        System.out.println("1.print Retangle");
        System.out.println("2.print the Square triangle");
        System.out.println("3.Print the isosceles triangle");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                for (int i = 0; i < 3; i++) {
                    System.out.print("\n");
                    for (int j = 0; j < 6; j++) {
                        System.out.print("* ");
                    }
                    break;
                }
            case 2:
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    break;

                }
            case 3:
                for (int i = 7; i >= 1; i--) {

                    for (int j = 0; j <= i; j++) {
                        System.out.print("*");
                    }
                }
        }
    }
}
