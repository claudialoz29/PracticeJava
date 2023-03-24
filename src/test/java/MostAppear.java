import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MostAppear {
    public static void main(String[] args){
        System.out.println(getMostAppearLetter("hello"));
    }
    public static char getMostAppearLetter(String str){
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : str.toCharArray()){
            if(map.containsKey(ch)){
                int oldcount = map.get(ch);
                map.put(ch, oldcount + 1);
            } else {
                map.put(ch, 1);
            }
        }
        int max =0;
        char  each = 0;
        for(char m : map.keySet()){
            if( max < map.get(m)){
                max = map.get(m);
                each = m;
            }
        }
        return  each;
    }
}
