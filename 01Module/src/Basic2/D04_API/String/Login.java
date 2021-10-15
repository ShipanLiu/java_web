package Basic2.D04_API.String;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        int tryTimes = 0;
        String userName = "jiba";
        String password = "dan";
        Scanner sc = new Scanner(System.in);

        while(tryTimes < 3) {
            System.out.println("please input the userName");
            String nameInput = sc.nextLine();
            System.out.println("please input the pwd");
            String pwdInput = sc.nextLine();
            if (nameInput.equals(userName) && pwdInput.equals(password)) {
                System.out.println("login success");
                break;
            } else  {
                System.out.println("pwd or userName wrong");
                tryTimes++;
                System.out.println(tryTimes == 3 ?"次数用完" :"you still have" + (3-tryTimes) + "try times");
            }
        }

        System.out.println("fuck you ");

    }
}
