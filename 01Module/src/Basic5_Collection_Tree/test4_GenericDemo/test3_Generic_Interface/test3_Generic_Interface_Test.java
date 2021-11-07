package Basic5_Collection_Tree.test4_GenericDemo.test3_Generic_Interface;

public class test3_Generic_Interface_Test {
    public static void main(String[] args) {
        GenericImpl<String> imp = new GenericImpl<String>();
        GenericImpl<Integer> imp2 = new GenericImpl<Integer>();

        imp.show("jier");
        imp2.show(30);
    }
}
