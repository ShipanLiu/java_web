package Basic2.D02_privateKeyword;

public class Student {
    // 01-
    private String name;
    private int age;

    public String getName() {
        return name;
    }

//    public void setName(String n) {
//        name = n;
//    }

    // wrong way of setName
//    public void setName(String name) {
//        // the two name are all pointing at the parameters of this method
//        name = name;
//    }

    public void setName(String name)  {
        // 这个this指的就是 成员变量name
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        if(a < 0 || a > 120 ) {
            System.out.println("you have to input a valid age");
        }else {
            age = a;
        }
    }
    // 02-method
    // 注意没有static， 有static一般方法。
    public void show() {
        System.out.println(name + "," + age);
    }



}
