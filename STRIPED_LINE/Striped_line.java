package STRIPED_LINE;

import java.util.Scanner;

public class Striped_line {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
             System.out.print("*");   
            } else {
                System.out.print("_");
            }
        }
        sc.close();
    }
}