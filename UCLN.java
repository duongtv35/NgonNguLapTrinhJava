package Day1;

import javax.swing.*;
import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {

    }
    public static void UCLN(){
        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENter a");
        a = scanner.nextInt();
        System.out.println("Enter b");
        b=scanner.nextInt();
        a = Math.abs(a);
        b=Math.abs(b);
        if(a==0 || b==0){
            System.out.println("no great common");
        }
    }

}
