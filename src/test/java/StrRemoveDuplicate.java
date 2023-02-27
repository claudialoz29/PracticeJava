import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class StrRemoveDuplicate {
    public static void main(String[] args){
        //write a program that will not allow dupliocate
        System.out.println(removeDup("appleee"));
        System.out.println(removeDupTwo("appleee"));

    }
    public static String removeDup (String str){
        Set<Character> strOne = new LinkedHashSet<>();

        for(int i = 0; i <str.length(); i++){

            if(!strOne.contains(str.charAt(i))){
                strOne.add(str.charAt(i));


            }
        }
        return strOne.toString();
    }
    public static String removeDupTwo(String str){

        StringBuilder sb = new StringBuilder();
        for(char el : str.toCharArray()){
            if(!sb.toString().contains(String.valueOf(el))){
                sb.append(el);
            }
        }
        return sb.toString();
    }
}
