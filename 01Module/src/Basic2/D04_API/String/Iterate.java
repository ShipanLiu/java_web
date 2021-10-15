/*
* 遍历字符串。
*
* .charAt()
*
* */

package Basic2.D04_API.String;
import java.util.Scanner;

public class Iterate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a string");
        String line = sc.nextLine();

        for(int i = 0; i < line.length(); i++) {
            System.out.println(line.charAt(i));
        }
    }
}
