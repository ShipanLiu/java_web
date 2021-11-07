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
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // the first List
        StudentList stuList1 = new StudentList();
        // the second List
        StudentList stuList2 = new StudentList(stuList1);
//        System.out.println(stuList2.get(0));
        // change some students in stuList2
        start(stuList2);
    }

    // main test method entry
    public static void start(StudentList list) {
        studentloop:
        while (true) {
            System.out.println("\n\n\n");
            System.out.println("-------Welcome--------");
            System.out.println("choose one:\n1.addStudents,\n2.removeStudentById," +
                    "\n3.removeStudentByPos,\n4.getStudentByPos,\n5.getAllStudents," +
                    "\n6.sort,\n7-find firstname\n0.exit");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    System.out.println("you choosed Nr 1 add students");
                    addStudent(list);
                    break;
                case "2":
                    System.out.println("you choosed Nr 2 remove students by id");
                    deleteStudentById(list);
                    break;
                case "3":
                    System.out.println("you choosed Nr 3 remove students by pos");
                    removeStudentByPosition(list);
                    break;
                case "4":
                    System.out.println("you choosed Nr 4 get students by pos");
                    getStudentByPosition(list);
                    break;
                case "5":
                    System.out.println("you choosed Nr 5 get all students");
                    getAllStudents(list);
                    break;
                case "6":
                    System.out.println("you choosed Nr 6 sort students");
                    sortStudents(list);
                    break;
                case "7":
                    System.out.println("you choosed Nr 7 find students by first name");
                    findStudentFirstName(list);
                    break;
                case "0":
                    System.out.println("you choosed Nr 0 exit");
                    break studentloop;
                default:
                    System.out.println("wrong input");
                    break;
            }
        }
    }

    public static void addStudent(StudentList list) {
        System.out.println("please input firstname");
        String firstname = sc.next();
        System.out.println("please input lastname");
        String lastname = sc.next();
        System.out.println("please input studentId");
        long studentId = sc.nextLong();
        System.out.println("please input weight");
        double weight = sc.nextDouble();
        System.out.println("please input year of birth");
        int year = sc.nextInt();
        System.out.println("please input month of birth");
        int month = sc.nextInt();
        System.out.println("please input day of birth");
        int day = sc.nextInt();
        Date birthday = new Date(year, month, day);
        // create a new Student object
        Student newStudent = new Student(firstname, lastname, studentId, weight, birthday);
        boolean added = list.add(newStudent);
        if (added) {
            System.out.println("new student added with success");
            System.out.println();
        } else {
            System.out.println("!!!!!add student failed, beacuse the student id exists!!!!!");
            System.out.println();
        }
    }

    public static void deleteStudentById(StudentList list) {
        System.out.println("please input the id of student who you want delete from the system ");
        long deletedId = sc.nextLong();
        boolean deleted = list.removeStudentById(deletedId);
        if (deleted) {
            System.out.println("delete with success");
            System.out.println();
        } else {
            System.out.println("id does not exist");
            System.out.println();
        }
    }

    public static void removeStudentByPosition(StudentList list) {
        System.out.println("please input the pos that should be removed");
        int pos = sc.nextInt();
        Student removedStudent = list.removeStudentByPos(pos);
        if (removedStudent != null) {
            System.out.println("delete with success and the deleted student:");
            System.out.println(removedStudent);
            System.out.println();
        } else {
            System.out.println("delete failed, wrong position inputed");
            System.out.println();
        }
    }

    public static void getStudentByPosition(StudentList list) {
        System.out.println("please input the number of ");
        int num = sc.nextInt();
        System.out.printf("the student at position %d is:\n", num);
        System.out.println("firstname\t" + "lastname\t\t" + "id\t\t\t" + "weight\t\t\t\t\t" + "birthday");
        // convert to stringa and sout;
        System.out.println(list.getStudentByPos(num).toString());
    }

    public static void getAllStudents(StudentList list) {
       String allStudentsString = list.toString();
        System.out.println(allStudentsString);
    }
   // sort the student
    public static void sortStudents(StudentList list) {
        System.out.println("please choose one Element to sort:\n1-FIRSTNAME,\n2-LASTNAME,\n3-STUDENT_ID,\n4-WEISGT,\n5-BIRTHDAY");
        int num = sc.nextInt();
        switch(num) {
            case 1:
                list.sort(Student.SortKey.FIRSTNAME);
                String allSortedStudentsString = list.toString();
                System.out.println(allSortedStudentsString);
                break;
            case 2:
                list.sort(Student.SortKey.LASTNAME);
                System.out.println(list.toString());
                break;
            case 3:
                list.sort(Student.SortKey.STUDENT_ID);
                System.out.println(list.toString());
                break;
            case 4:
                list.sort(Student.SortKey.WEIGHT);
                System.out.println(list.toString());
                break;
            case 5:
                list.sort(Student.SortKey.BIRTHDAY);
                System.out.println(list.toString());
                break;
            default:
                System.out.println("wrong input");
                break;
        }
    }

    public static void findStudentFirstName(StudentList list) {
        System.out.println("please input the firtname of the student");
        String fN = sc.next();
        ArrayList<Integer> foundStuList = list.findFirstname(fN);
        if(foundStuList.size() == 0) {
            System.out.println("no one matchs");
        } else {
            System.out.println("the position of the studnets:");
            System.out.println(foundStuList);
        }
    }
}
