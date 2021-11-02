/*
* Object 里面的toString方法。
*
* Student 可以掉哟个toString 方法。
*
* 因为 toString 给的是 地址值。
* 所以一般会对toString 进行重写。
*
*
* Object.equals 比较的是地址值， 因此需要override
* override之后， 比较的就是内容了。
*
* */

package Basic4_API.api1.api_Objects;

class Student {
    private int age;
    private String Name;

    public Student() {
    }

    public Student(int age, String name) {
        this.age = age;
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return Name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        Name = name;
    }

    // 重写 toString 方法
    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", Name='" + Name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        // 开始比较属性值
        if (age != student.age) return false;
        if (Name != null ? !Name.equals(student.Name) : student.Name != null) return false;

        return true;
    }

}
