import java.util.LinkedHashMap;
import java.util.Map;

public class Countletter2 {
    public static void main(String[] args){
        System.out.println(countLetters("hellooo"));
        System.out.println(countLetters("applee"));


    }
    public static Map<Character, Integer> countLetters(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(char n : str.toCharArray()){
            if(map.containsKey(n)){
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }

        }
        return map;
    }
}
