package src;

import java.util.Scanner;

public class Maxandmin {

	public static void main(String[] args) {
		//Q Find the maximum & minimum number in an array of integers.

        System.out.print("Enter Size=");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];


        //input
        System.out.print("Enter Numbers=");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) ;
            min = numbers[i];

        }
        System.out.println("Largest number is : " + max);
        System.out.println("Smallest number is :" + min);
    }

	}

