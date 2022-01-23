package src;

import java.util.Scanner;

public class Arrayofname {

	public static void main(String[] args) {
		//Q Take an array of names as input from the user and print them on the screen.
        System.out.print("Enter Size:-"+" ");

         Scanner scanner=new Scanner(System.in);
         int size = scanner.nextInt();
         String names[]=new String[size];

       //input
       System.out.println("Enter names:="+" ");
       for (int i=0;i<size;i++){
           names[i]= scanner.next();
       }
       //output
       for (int i=0;i<names.length;i++){
           System.out.println("name"+ (i+1) +" is : "+ names[i]);
       }

	}

}
