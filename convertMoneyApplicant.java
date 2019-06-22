package Day1;

import java.util.Scanner;

public class convertMoneyApplicant {
    public static void main(String[] args) {
        System.out.println(ConverMoney());
    }
    public static double ConverMoney(){
        Scanner scanner = new Scanner(System.in);
        int VND ;
        System.out.println("enter USD");
        int USD = scanner.nextInt();

        VND = 23000* USD;
        return VND;
    }
}
