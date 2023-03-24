public class REvString {
    public static void main(String[] agrs){
        System.out.println(revString("hello"));
        System.out.println(revString2("apple"));

    }
    public static String revString(String str){
        String words = "";
        for(int i = str.length()-1; i>=0; i--){
            words += str.charAt(i);

        }
        return  words;
    }
    public static String revString2(String w){

       StringBuilder sb = new StringBuilder();
        for(int i = w.length()-1; i>=0; i--){
            sb.append(w.charAt(i));
        }
        return w.toString();
    }
}
