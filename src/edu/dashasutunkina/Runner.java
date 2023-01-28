package edu.dashasutunkina;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        System.out.println(max(firstNumber, secondNumber));
    }
    public static int max (int first, int second){
        if (first > second){
            return first;
        } else {
            return second;
        }
    }
}
