/*
*    convert int[] = {1, 2, 3}  to [1, 2, 3]
*    and
*       converse a string
*
* */

package Basic2.D04_API.StringBuilder;

public class Example {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(convert(arr1));
        System.out.println(converse("jiba")); // abij
    }

    public static String convert(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < array.length; i++) {
            if(i < array.length - 1){
                sb.append(array[i]).append(",").append(" ");
            }else {
                sb.append(array[i]);
                sb.append("]");
                break;
            }
        }

        return sb.toString();  // [1, 2, 3, 4, 5, 6, 7]
    }


    public static String converse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return(sb.reverse().toString());

    }
}
