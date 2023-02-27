import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoStringAnagram {
    public static void main(String[] args){

        System.out.println(isAnagram("listen", "silent"));
    }
    public static boolean isAnagram(String str, String str1) {
      str = str.toLowerCase();
      str1 = str.toLowerCase();
      // if yhe length both string is not the same it cannot be anagram
        if(str.length() != str1.length()){
            return false;
        }
        //convert both string in arrays of character and sort them

        char[] strArray = str.toCharArray();
        char[] str1Array = str1.toCharArray();
        Arrays.sort(strArray);
        Arrays.sort(str1Array);
        //compare the sort arrays
        return Arrays.equals(strArray, str1Array);
    }
}



