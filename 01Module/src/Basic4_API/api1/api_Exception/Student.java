package Basic4_API.api1.api_Exception;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int  age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int  getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int  age) {
        if(age >= 18 && age <=25) {
            this.age = age;
        }else {
            // RuntimeException 是运行错误， 很大， 应该用自定义错误。
            throw new AgeOutOfBoundsException("输入age 的大小错误");
        }
    }
}
