import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MostUseWords {
    public static void main (String[] args){

    System.out.println(mostUseWords("hello hello apple"));
        System.out.println(mostUseWords("hello hola hola"));

    }
    public static String mostUseWords(String str){

        Map<String, Integer> map = new LinkedHashMap<>();

        for(String word : str.split(" ")){
            if(map.containsKey(word)){
                int old = map.get(word);
                map.put(word, old + 1);
            } else {
                map.put(word, 1);
            }

        }
        int max =0;
        String most = null;

        for(String n : map.keySet()){
            if(max <  map.get(n));
                max = map.get(n);
                most = n;
        }
        return most;
    }
}
