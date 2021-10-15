/*
* through the set and get method we could get access to the private
* decriated variables
*
* this keyworld
*
*
* */



package Basic2.D02_privateKeyword;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();

        s.setAge(200);
        System.out.println(s.getAge()); // you have to input a valid age

    }
}
