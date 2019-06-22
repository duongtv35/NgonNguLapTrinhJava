package Day1;

import java.util.Scanner;

public class tinh_tien_lai {
    public static void main(String[] args) {
        CaculateMoney();

    }
    public static void CaculateMoney( ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter Money");
        double Money = scanner.nextDouble();
        System.out.println("enter interest");
        double Interest = scanner.nextDouble();
        System.out.println("Enter month");
        int month = scanner.nextInt();
        for(int i=0;i<month;i++) {
            double balanceMoney = (Interest * Money) / 12;
            Money += balanceMoney;
            System.out.println("the money after " +i+"month is " +Money);
        }


    }
}
