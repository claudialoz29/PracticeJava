import java.util.Arrays;

public class StarAnagram {
    public static void main(String[] args){
        //create a method that will check two strings
        // are the anagram or not
        //Anagram is when all the char exist in another string

        //isAnagram("listen", "silent) // true
        System.out.println(isAnagram("listen", "silent"));
        System.out.println(isAnagram("abc", "abce"));

    }
    public static boolean isAnagram(String str , String strTwo){
       if(str.length() != strTwo.length()){
           return false;
       }
        char[] arrOne = str.toCharArray();
        char[] arrTwo = strTwo.toCharArray();
        //first sort
        Arrays.sort(arrOne);
        Arrays.sort(arrTwo);

        for(int i =0; i < arrOne.length; i++){
            if(arrOne[i] != arrTwo[i]){
                return false;
            }
        }
        return true;
    }
}
