package com.bridgelabz;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int i, Number, Sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Please Enter any Number: ");
        Number = scanner.nextInt();

        for (i = 1; i < Number; i++) {
            if (Number % i == 0) {
                Sum += i;
            }
        }
        if (Sum == Number) {
            System.out.format("\n% d is a Perfect Number", Number);
        } else {
            System.out.format("\n% d is NOT a Perfect Number", Number);
        }
    }
}
