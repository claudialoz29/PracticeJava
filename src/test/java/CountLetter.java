import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountLetter {
    public static void main(String[] args){
        //write a method that accept String as argument
        // and return map with a key as each char and value as count
        System.out.println(countLetter1("hellooo"));
        System.out.println(countLetter1("applee"));

    }

    public static Map<Character, Integer> countLetter1(String str){

        Map<Character, Integer>  map = new LinkedHashMap<>();
        for(char ch : str.toCharArray()){
            if(map.containsKey(ch)){
                int value = map.get(ch);
                map.put(ch, value + 1) ;
            } else {
                map.put(ch, 1);
            }
        }
        return map;
    }
}
