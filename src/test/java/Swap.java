public class Swap {
    public static void main(String[] args){
        int j = 15;
        int i = 10;
        // swap the value of i and j without creating any extra variable

        // 10 + 15 = 25
        i = i + j;
        //25 - 15
        j = i -j;
        //25 -10
        i = i - j ;
        System.out.println("i " + i);
        System.out.println("j " + j);
    }
}
