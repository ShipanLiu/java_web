package Basic4_API.api1.api_Object;

public class InterviewTest {
    public static void main(String[] args) {
        String s1 = "abc";
        StringBuilder sb = new StringBuilder("abc");
        // 调用String里面的equals 方法， 要保证参数也是 字符窜， 否则 不会比较， 而直接返回false
        System.out.println(s1.equals(sb)); // fasle
        // StringBuilder  里面没有重写 equals 的方法， 用的就是Object 类中的。
        System.out.println(sb.equals(s1)); // false
    }
}
