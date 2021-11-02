package Basic4_API.api1.api_Objects;

import java.util.Objects;

public class ObjectsDemo {
    public static void main(String[] args) {
        Student s1 = new Student(20, "Ted");
        Student s2 = null;

        // 调用的就是 Student 里面 的toString
        String result1 = Objects.toString(s1);
        System.out.println(result1); // Student{age=20, Name='Ted'}

        // 对象为空的时候。。
        String result2 = Objects.toString(s2, "随便做点事情");
        System.out.println(result2); // 随便做点事情

        boolean isEmptyResult = Objects.isNull(s2);
        System.out.println(isEmptyResult);  // true
        System.out.println(Objects.nonNull(s2)); // false

    }

}
