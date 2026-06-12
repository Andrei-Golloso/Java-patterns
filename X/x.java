package X;

import java.util.Scanner;

public class x {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - i; j++) {
                if (i == j || j == (n - i - 1)) {
                    System.out.println("*"); 
                } else {
                    System.out.println(" ");
                }
            } 
            System.out.println();
        }
        sc.close();
    }
}