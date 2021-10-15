/*
 * append (any type)  return the object itself
 *
 * reverse()
 *
 * string 和 stringBuilder 相互转换。 因为 string想要用 这两个方法
 *
 *
 * */


package Basic2.D04_API.StringBuilder;

public class StringBuilder01 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("jiba");

        sb.append("jiba").append(true);

        System.out.println(sb);  // jibajibatrue

        sb.reverse();
        System.out.println(sb); // eurtabijabij


//        StringBuilder ===>> string

        StringBuilder sb1 = new StringBuilder("jiba");
        String s1 = sb1.toString();
        System.out.println(s1); // jiba

//        String => StringBuilder

        String s2 = "Hello";
        StringBuilder sb2 = new StringBuilder(s2);
        sb2.reverse();
        System.out.println(sb2); // olleH
    }
}
