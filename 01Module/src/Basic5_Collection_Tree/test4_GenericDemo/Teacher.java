package Basic5_Collection_Tree.test4_GenericDemo;

public class Teacher {
    private String name;
    private int age;

    public Teacher() {
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


//    @Override
//    public int compareTo(Teacher o) {
//        // 按照对象的年龄进行 排序。
//        int resultAge = this.age - o.age;
//        int resultName = this.name.compareTo(o.getName());
//        int result = resultAge == 0 ? resultName : resultAge;
//        return result;
//    }
}
