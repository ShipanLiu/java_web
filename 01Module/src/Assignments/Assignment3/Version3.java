package Assignments.Assignment3;

import java.util.Random;
import java.util.Scanner;

public class Version3 {
    public static void main(String[] args) {
        Rndm.startInitialize();
        Rndm.startRandom();
    }
}


// abstract data object
class Rndm {
    private static int max;
    private static int factor;
    private static int increment;
    private static int start;

    // access function
    public static void startInitialize() {
        initialize();
    }

    // access function
    public static void startRandom() {
        Random();
    }

    private static void initialize() {
        max = 1000;
        factor = 623;
        increment = 525;
        start = 157;
    }

    private static int randomAlgo(int max, int factor, int increment, int start) {
        return ((factor * start) + increment) % max;
    }

    private static void Random() {
        int initialValue = randomAlgo(max, factor, increment, start);
        loop:
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Random seed the generator (y/n)?");
            String answer1 = sc.next();
            if (answer1.equals("y")) {
                System.out.println(initialValue);
                initialValue = randomAlgo(max, factor, increment, initialValue);
            } else {
                break loop;
            }
        }
    }
}

