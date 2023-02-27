public class RevWords {
    public static void main(String[] args) {
    String str = "apple banana kiwi";
        System.out.println(revWords(str)); // kiwi banana apple
}

    public static String revWords(String str) {
        String[]  word = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i = word.length-1; i>=0; i--){
            sb.append(word[i]);

            if(i !=0){
                sb.append(" ");
            }

            }
        return sb.toString();
        }


    }


