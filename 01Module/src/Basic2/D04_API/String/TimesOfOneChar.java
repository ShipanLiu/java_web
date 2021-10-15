/*
* abchibcabhgfdabhoobaababobajab
*
* 判断里面存在 ab的次数。
*
*
* */

package Basic2.D04_API.String;

public class TimesOfOneChar {

    public static void main(String[] args) {
        String line = "abchibcabhgfdabhoobaababobajab";
        String key = "ab";
        String testChar;

        for(int i = 0; i < line.length(); i++) {
            if(i < line.length() - 2) {
                testChar = String.valueOf(line.charAt(i)) + String.valueOf(line.charAt(i + 1)) ;
                System.out.println(testChar);
                if(testChar.equals(key)) {
                    System.out.println("one time");
                }
            } else {
                System.out.println("finished");
            }

        }

    }
}
