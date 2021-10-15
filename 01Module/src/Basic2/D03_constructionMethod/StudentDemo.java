package Basic2.D03_constructionMethod;

public class StudentDemo {
    public static void main(String[] args) {
//       create the obj and excute the construction method
        Student student1 = new Student("jiba", 30);  // 输出： 构造方法， 但无参数
        Student student2 = new Student();
        student2.setName("Dan");
        student2.setAge(20);
        student1.show(); // jiba,30
        student2.show(); // Dan,20
    }
}
