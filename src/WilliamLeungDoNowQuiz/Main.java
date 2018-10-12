package WilliamLeungDoNowQuiz;


import java.util.Scanner;

public class Main {

    public static void main(String[]args){
	// write your code here
        Scanner input= new Scanner(System.in);
        System.out.println("Enter an integer n");
        int number = input.nextInt();
        int sum = 0;
        for (int x = 0; x <= number; x++) {
            sum = sum + x;
        }
        System.out.println("The sum from 1 to n is "+sum);
    }
}
