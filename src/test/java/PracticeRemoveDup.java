import java.util.LinkedHashSet;
import java.util.Set;

public class PracticeRemoveDup {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("hello"));  // helo
        System.out.println(removeDuplicates("apple"));  // aple
        System.out.println(removeDuplicates("aaaaa"));  // a
        System.out.println(removeDuplicates("hihihi")); // hi
    }

    public static String removeDuplicates(String str) {
            StringBuilder sb = new StringBuilder();
            Set<Character> mp = new LinkedHashSet<>();
            for(char n : str.toCharArray()){
                if(!mp.contains(n)){
                    sb.append(n);
                    mp.add(n);
                }
            }
            return sb.toString();

    }

    }
