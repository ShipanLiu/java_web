/*
* 输入 数字   必须在 18-25之间，  一直到录入对的为止。
*
* */

package Basic4_API.api1.api_Exception;

import java.util.Scanner;

public class Test2_Exercise {
    public static void main(String[] args) {
        Student stu = new Student();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("input name");
            String nameStr = sc.nextLine();
            stu.setName(nameStr);
            System.out.println("input age");
            String ageStr = sc.nextLine();
            try {
                int age = Integer.parseInt(ageStr);
                stu.setAge(age);
                // 赋值成功， 完事
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入age格式错误， 需要输入数字");
                continue;
            } catch(AgeOutOfBoundsException r) {
                System.out.println("输入age 的大小错误");
                System.out.println(r.toString());
                continue;
            }
        }
    }
}
