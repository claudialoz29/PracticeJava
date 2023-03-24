import java.util.LinkedHashMap;
import java.util.Map;

public class MapCoutLetter {
    public static void main(String[] args){
        System.out.println(countLetters("hello"));

    }
    public static  String countLetters(String str){
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(char l : str.toCharArray()){
            if(str.equals(l)){
                int oldount = map.get(l);
                map.put(l, oldount + 1);
            } else {
                map.put(l, 1);
            }
        } //convert to STring
        StringBuilder sb = new StringBuilder();
        for(char n: map.keySet()){
                sb.append(n).append(map.get(n));
        }
        return sb.toString();
    }
}
