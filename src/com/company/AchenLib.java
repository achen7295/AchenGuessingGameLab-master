package com.company;
import java.util.Scanner;

public class AchenLib {

    public static void linearSearch() {

        int num = (int) (Math.random() * 100);
        System.out.println("Guess a number from 1 - 100");
        Scanner guess = new Scanner(System.in);
        while ((guess.nextInt() != num)) {
            System.out.print("This is not the correct number");
        }
        System.out.println("This is the correct number!");
    }

    public static void binarySearch() {

        Scanner num = new Scanner(System.in);
        String numString = num.next();
        int Cnum = Integer.parseInt(numString);
        int guess = (int) (Math.random() * 100);
        if (guess != Cnum){
            if(guess )
        }
    }

    public int binarySearch() {

        Scanner num = new Scanner(System.in);
        String numString = num.next();
        int Cnum = Integer.parseInt(numString);
        int start = 0;
        int end = 100;
        while (start <= end) {
            int key = (int) (Math.random() * 100);
            int mid = (start + end) / 2;
            if (key == Cnum) {
                return mid;
            }else {
                
            }
            if (key < Cnum) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}