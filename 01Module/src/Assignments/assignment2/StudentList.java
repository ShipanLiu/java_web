/*
Group: AG0701
Timur Plavnik 108020258018
Aiyana Erbe   108020267357
Shipan Liu    108019201553
*/
// Attention!!! write down your own package path
package Assignments.assignment2;


import java.util.ArrayList;
import java.util.Date;

public class StudentList {
    // create list and the type should be Student type.
    private static ArrayList<Student> list = new ArrayList<>();

//    int[] arr = new int[10];
    

    // static block  add 10 students at the beginning
    static {
        Student stu1 = new Student("N1", "Q1", 3, 79, new Date(1999, 2, 20));
        Student stu2 = new Student("M2", "L2", 5, 75, new Date(1998, 5, 12));
        Student stu3 = new Student("X3", "K3", 2, 76, new Date(1997, 6, 10));
        Student stu4 = new Student("F4", "J4", 10, 74, new Date(1996, 8, 23));
        Student stu5 = new Student("L5", "H5", 90, 71, new Date(1995, 1, 4));
        Student stu6 = new Student("I6", "G6", 57, 72, new Date(1994, 4, 9));
        Student stu7 = new Student("R7", "A7", 21, 73, new Date(1993, 6, 10));
        Student stu8 = new Student("B8", "F8", 44, 77, new Date(1992, 2, 1));
        Student stu9 = new Student("D9", "D9", 22, 80, new Date(1991, 7, 30));
        Student stu10 = new Student("A10", "S10", 1, 67, new Date(1990, 12, 15));
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        list.add(stu5);
        list.add(stu6);
        list.add(stu7);
        list.add(stu8);
        list.add(stu9);
        list.add(stu10);
    }

    public StudentList() {
    }

    public StudentList(StudentList studentList) {
        this.list = studentList.list;
    }


    public boolean add(Student student) {
        // 1. check if the id already exists or not
        // 2. if the id does not exist, then add the student
        long studentId = student.getStudentId();
        if (!containsId(studentId)) {
            list.add(student);
            return true;
        } else {
//            System.out.println("The student id already exists");
            return false;
        }
    }

    public boolean removeStudentById(long studentId) {
        int index = getIndex(studentId);
        if (index != -1) {
            // this means the student did exist in the list
            list.remove(index);
            return true;
        } else {
//            System.out.println("the student id does not exist");
            return false;
        }
    }

    public Student removeStudentByPos(int pos) {
        // check the if the pos is proper or not
        if (checkPosProper(pos)) {
            Student removedStu = list.get(pos);
            list.remove(pos);
            return removedStu;
        } else {
            return null;
        }
    }

    public Student getStudentByPos(int pos) {
        if (checkPosProper(pos)) {
            Student gotStu = list.get(pos);
            return gotStu;
        } else {
            return null;
        }
    }

    public ArrayList<Integer> findLastname(String lastname) {
        ArrayList<Integer> positionList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stu.getLastname().equals(lastname)) {
                positionList.add(i);
            }
        }
        return positionList;
    }

    public ArrayList<Integer> findFirstname(String firstname) {
        ArrayList<Integer> positionList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stu.getFirstname().equals(firstname)) {
                positionList.add(i);
            }
        }
        return positionList;
    }

    public int findStudentId(long studentId) {
        return getIndex(studentId);
    }

    public int size() {
        return list.size();
    }

    private boolean containsId(final long id) {
        boolean isExist = false;
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stu.getStudentId() == id) {
                isExist = true;
                break;
            }
        }
        return isExist;
    }

    @Override
    public String toString() {
        System.out.println("firstname\t" + "lastname\t\t" + "id\t\t\t" + "weight\t\t\t\t\t" + "birthday");
        String allStudentString = "";
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            String oneStudentString = stu.toString() + "\n";
            allStudentString += oneStudentString;
        }
        return allStudentString;
    }

    // test sort main entry method
    public ArrayList<Student> sort(Student.SortKey key) {
//        ArrayList<Student> sortedList = new ArrayList<>();
        switch (key) {
            case FIRSTNAME:
                sortByFirstname();
                break;
            case LASTNAME:
                sortByLastname();
                break;
            case STUDENT_ID:
                sortByNumber("id");
                break;
            case WEIGHT:
                sortByNumber("weight");
                break;
            case BIRTHDAY:
                sortByBirthday();
                break;
            default:
                break;
        }
        return list;
    }

    // change the order of list, so there is no return
    public void sortByFirstname() {
        ArrayList<String> firstLetterList = getFirstLetterList("f");
        // System.out.println(firstLetterList);  [N, M, X, F, L, I, R, B, D, A]
        // now to sort the list from A to Z
        for (int i = 0; i < firstLetterList.size() - 1; i++) {
            for (int j = 0; j < firstLetterList.size() - i - 1; j++) {
                int result = firstLetterList.get(j).compareTo(firstLetterList.get(j + 1));
//                System.out.println(result);
                if (result > 0) {
                    // 1. sort the firstLetterList
                    String temStr = firstLetterList.get(j);
                    firstLetterList.set(j, firstLetterList.get(j + 1));
                    firstLetterList.set(j + 1, temStr);

                    // 2. sort the list
                    Student temStu = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temStu);
                }
            }
        }
    }

    // sort the list by lastname
    public void sortByLastname() {
        ArrayList<String> firstLetterList = getFirstLetterList("l");
        // System.out.println(firstLetterList);  [N, M, X, F, L, I, R, B, D, A]
        // now to sort the list from A to Z
        for (int i = 0; i < firstLetterList.size() - 1; i++) {
            for (int j = 0; j < firstLetterList.size() - i - 1; j++) {
                int result = firstLetterList.get(j).compareTo(firstLetterList.get(j + 1));
//                System.out.println(result);
                if (result > 0) {
                    // 1. sort the firstLetterList
                    String temStr = firstLetterList.get(j);
                    firstLetterList.set(j, firstLetterList.get(j + 1));
                    firstLetterList.set(j + 1, temStr);

                    // 2. sort the list
                    Student temStu = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temStu);
                }
            }
        }
    }

    // method for sorting by weight OR student id
    public void sortByNumber(String str) {
        ArrayList<Long> listLong = new ArrayList<>();
        ArrayList<Double> listDouble = new ArrayList<>();
        if (str.equals("id")) {
            listLong = getNumberList(str);
        } else {
            listDouble = getNumberList(str);
        }
        int size = listDouble.size() | listLong.size();
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (str.equals("weight")) {
                    if (listDouble.get(j) > listDouble.get(j + 1)) {
                        System.out.println("jier");
                        // 1. sort the list of number
                        Double tem = listDouble.get(j);
                        listDouble.set(j, listDouble.get(j + 1));
                        listDouble.set(j + 1, tem);

                        // 2. sort the list
                        Student temStu = list.get(j);
                        list.set(j, list.get(j + 1));
                        list.set(j + 1, temStu);
                    }
                } else {
                    System.out.println("enter long");
                    if (listLong.get(j) > listLong.get(j + 1)) {
                        Long tem = listLong.get(j);
                        listLong.set(j, listLong.get(j + 1));
                        listLong.set(j + 1, tem);

                        // 2. sort the list
                        Student temStu = list.get(j);
                        list.set(j, list.get(j + 1));
                        list.set(j + 1, temStu);
                    }
                }
            }
        }
        System.out.println(listLong);
        System.out.println(listDouble);
    }

    // sort by Birthday
    public void sortByBirthday() {
        ArrayList<Date> DateList = getDateList();
        for (int i = 0; i < DateList.size() - 1; i++) {
            for (int j = 0; j < DateList.size() - i - 1; j++) {
                boolean result = (DateList.get(j).after(DateList.get(j + 1)));
                if (result == true) {
                    // 1. sort the DateList
                    Date temStr = DateList.get(j);
                    DateList.set(j, DateList.get(j + 1));
                    DateList.set(j + 1, temStr);

                    // 2. sort the list
                    Student temStu = (Student) list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temStu);

                }
            }
        }

    }

    // get the Date list
    public ArrayList<Date> getDateList() {
        ArrayList<Date> DateList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            DateList.add(stu.getBirthday());
        }
        return DateList;
    }

    // method for getting the list of studentId OR weight
    public ArrayList getNumberList(String str) {
        ArrayList<Long> numListLong = new ArrayList<Long>();
        ArrayList<Double> numListDouble = new ArrayList<Double>();
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (str.equals("id")) {
                long id = stu.getStudentId();
                numListLong.add(id);
            } else {
                double weight = stu.getWeight();
                numListDouble.add(weight);
            }
        }
        if (str.equals("id")) {
            return numListLong;
        } else {
            return numListDouble;
        }
    }

    // get the first letter  for exampe "Gery" --> "G"
    public String getFirstLetter(String str) {
        return str.substring(0, 1).toUpperCase();
    }

    // get the list of first letter like [N, M, X, F, L, I, R, B, D, A]
    public ArrayList<String> getFirstLetterList(String str) {
        ArrayList<String> firstLetterList = new ArrayList<>();
        // first put the firstLetter of firstName into a list
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            String firstLetter = getFirstLetter(str.equals("f") ? stu.getFirstname() : stu.getLastname());
            firstLetterList.add(firstLetter);
        }
        return firstLetterList;
    }

    private int getIndex(long studentId) {
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stu.getStudentId() == studentId) {
                // fund the index
                index = i;
                break;
            }
        }
        // it could be the index or -1
        return index;
    }

    private boolean checkPosProper(int pos) {
        if (pos >= 0 && pos < list.size()) {
            return true;
        } else {
            return false;
        }
    }
}
