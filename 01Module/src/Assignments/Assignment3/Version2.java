package Assignments.Assignment3;

import java.util.Scanner;

public class Version2 {
    public static void main(String[] args) {
        int y = 157;
        loop:
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Random seed the generator (y/n)?");
            String answer1 = sc.next();
            if (answer1.equals("y")) {
                int M = ((623 * y + 525) % 1000);
                y = M;
                System.out.println(M);
            } else {
                break loop;
            }
        }
    }
}