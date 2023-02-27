import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("hello"));  // helo
        System.out.println(removeDuplicates("apple"));  // aple
        System.out.println(removeDuplicates("aaaaa"));  // a
        System.out.println(removeDuplicates("hihihi")); // hi
    }

    public static String removeDuplicates(String str) {
        Set<Character> n = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();
        for(char m : str.toCharArray()) {
            if(!n.contains(m)) {
                sb.append(m);
                n.add(m);
            }

        }
      return sb.toString();
    }
}
