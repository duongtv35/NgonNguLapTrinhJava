package Day1;

import java.util.Scanner;

public class SNT {
    public static void main(String[] args) {
        Display();
    }

    public static boolean check(int Number) {

        for (int i = 2; i <= Math.sqrt(Number); i++) {
            if (Number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void Display() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter The Limit Number");
        int count = 0;
        int N = scanner.nextInt();
        for (int i = 2; i < N; i++) {
            if (check(i)) {
                if (count < 10) {
                    System.out.println(i);
                    count++;
                }
            }
        }
    }
}
