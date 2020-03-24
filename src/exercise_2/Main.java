package exercise_2;

import exercise_1.Stuff;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positive integer:");
        int threads = input.nextInt();

        for (int i = 1; i < 2 ; i++) { //2 skal være threads
            Thread t1  = new Thread(new Runner(threads));

            t1.start();

        }
    }
}
