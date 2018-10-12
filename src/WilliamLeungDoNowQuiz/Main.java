package WilliamLeungDoNowQuiz;


import java.util.Scanner;

public class Main {

    public static void main(String[]args){
	// write your code here
        Scanner input= new Scanner(System.in);
        System.out.println("What is your number?");
        int number = input.nextInt();
        int sum = 0;
        for (int x = 0; x <= number; x++) {
            sum = sum + x;
        }
        System.out.println("All the numbers that add up to yur number is "+sum);
    }
}