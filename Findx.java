package src;

import java.util.Scanner;

public class Findx {

	public static void main(String[] args) {
		
   // Q= Take an Array as input from the user .search for a given number x and print the index at which it occurs

		System.out.print("Enter Size =");

        Scanner sc=new Scanner(System.in);
       int size=sc.nextInt();
       int number []=new int[size];
       for (int i=0;i<size;i++){
           number[i]= sc.nextInt();
       }
        System.out.print("enter X=");
       int x=sc.nextInt();

       //output
        for (int i=0; i<number.length; i++){
            if(number[i] == x){
                System.out.println(" X found at index:"+ i);
            }
        }
        


	}

}
