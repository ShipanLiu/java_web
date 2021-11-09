package Basic5_Collection_Tree.test7_TreeSet_Exercise;

public class Student implements Comparable<Student>{
    private String name;
    private int english;
    private int chinese;
    private int math;

    public Student() {
    }

    public Student(String name, int english, int chinese, int math) {
        this.name = name;
        this.english = english;
        this.chinese = chinese;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public int getEnglish() {
        return english;
    }

    public int getChinese() {
        return chinese;
    }

    public int getMath() {
        return math;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public void setMath(int math) {
        this.math = math;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", english=" + english +
                ", chinese=" + chinese +
                ", math=" + math +
                ", sum=" + sum() +
                '}';
    }

    public int sum() {
        return chinese + math + english;
    }

    @Override
    public int compareTo(Student o) {
        // 这里的o代表已经添加到 红黑树 里面的节点
        int result =  this.sum() - o.sum();
        // 总分一样看语文
        result = result == 0 ? this.getChinese() - o.getChinese() : result;
        // 语文一样看数学
        result = result == 0 ? this.getMath() - o.getMath() : result;
        // 数学一样看 英语
        result = result == 0 ? this.getEnglish() - o.getEnglish() : result;
        //  成绩都一样， 看姓名。
        result = result == 0 ? this.getName().compareTo(o.getName()) : result;
        return result;
    }
}
