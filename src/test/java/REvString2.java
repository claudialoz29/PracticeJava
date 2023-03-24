public class REvString2 {
    public static void main(String[] args){
        System.out.println(rev("hello"));
        System.out.println(revString("hello"));
    }
    public static String rev(String str){
        String each = "";
        for(int i = str.length()-1; i>=0; i--){
            each +=  str.charAt(i);

        }
        return each;
    }
    public static String revString(String word){
        StringBuilder sb = new StringBuilder();
        for(int i = word.length()-1; i>=0; i--){
            sb.append(word.charAt(i));
        }
        return sb.toString();
    }
}
