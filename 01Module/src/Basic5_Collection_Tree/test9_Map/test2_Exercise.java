package Basic5_Collection_Tree.test9_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class test2_Exercise {
    public static void main(String[] args) {
        HashMap<String, Student> hm = new HashMap<>();

        Student stu1 = new Student("jier1", 1);
        Student stu2 = new Student("jier2", 2);
        Student stu3 = new Student("jier3", 3);
        Student stu4 = new Student("jier4", 4);

        hm.put("001", stu1);
        hm.put("002", stu2);
        hm.put("003", stu3);


        // 开始遍历, 方法1;
        Set<String> keys = hm.keySet();
        for(String key : keys) {
            System.out.println(hm.get(key).getName() + "," + hm.get(key).getAge());
        }


        // 遍历方法2
        Set<Map.Entry<String, Student>> entries = hm.entrySet();
        for(Map.Entry<String, Student> me : entries) {
            String key = me.getKey();
            Student value = me.getValue();
            System.out.println(key + "," + value);
        }
    }
}
