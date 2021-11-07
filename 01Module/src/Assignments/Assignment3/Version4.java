package Assignments.Assignment3;

import java.util.Scanner;

public class Version4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // useing this ADT
        RandomGenerator generator1 = new RandomGeneratorImp();
        RandomGenerator generator2 = new RandomGeneratorImp();
        int startNr1 = 120;
        int startNr2 = 222;
        loop:
        while(true) {
            System.out.println("Random seed the generator (y/n)?");
            String answer = sc.next();
            if(answer.equals("y")) {
                startNr1 = generator1.generator(startNr1);
                startNr2 = generator1.generator(startNr2);
            } else {
                break loop;
            }
        }
    }
}


class RandomGeneratorImp implements RandomGenerator {
    @Override
    public int generator(int Start) {
        int y = Start;
        int M = ((623 * y + 525) % 1000);
        y = M;
        System.out.println(M);
        return M;
    }
}


interface RandomGenerator {
    int generator(int Start);
}
