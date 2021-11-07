package Assignments.Assignment3;


import java.util.Scanner;

public class Version1 {
    public static void main(String[] args) {
        double X = 157;
        Scanner sc = new Scanner(System.in);
        System.out.println("Random seed the generator (y/n)?");
        String answer1 = sc.next();
        if (answer1.equals("y")) {
            double M = ((623 * X + 525) % 1000);
            X = M;
            System.out.println((int)M);
        }
    }
}
