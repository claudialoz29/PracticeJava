public class RevWords2 {
    public static void main(String[] args){
        System.out.println(revWords("I love java"));
    }
    public static String revWords(String str){
       StringBuilder sb = new StringBuilder();
        String[] word = str.split(" ");
        for(int i = word.length-1; i>=0;i--){
            sb.append(word[i]);

        }
        return sb.toString();
    }
}
