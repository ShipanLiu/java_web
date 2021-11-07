package Basic5_Collection_Tree.test3_set;

public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
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


    @Override
    public int compareTo(Student o) {
        // 按照对象的年龄进行 排序。
        int resultAge = this.age - o.age;
        int resultName = this.name.compareTo(o.getName());
        int result = resultAge == 0 ? resultName : resultAge;
        return result;
    }
}
