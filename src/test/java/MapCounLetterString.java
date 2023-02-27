import java.util.LinkedHashMap;
import java.util.Map;

public class MapCounLetterString {
    public static void main(String[] args){

        System.out.println(countLetter("hellooo"));

    }
    public static String countLetter(String str){
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(char letter : str.toCharArray()) {
            if(map.containsKey(letter)) {
                int oldCount = map.get(letter);
                map.put(letter, oldCount + 1);
            }else {
                map.put(letter, 1);

            }
        }
        StringBuilder sb = new StringBuilder();
        for( char key : map.keySet()) {
            sb.append(key).append(map.get(key));
        }
        return sb.toString();

    }

}
