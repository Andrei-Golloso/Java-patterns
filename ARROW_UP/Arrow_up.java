package ARROW_UP;

import java.util.Scanner;

public class Arrow_up {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= n / 2) {
                    if (j >= n / 2 - i && j <= n / 2 + i)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                } else {
                    if (j >= n / 2 - n / 4 && j <= n / 2 + n / 4)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}