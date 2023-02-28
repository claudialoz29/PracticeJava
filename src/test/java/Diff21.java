public class Diff21 {
    public static void main(String[] args){
       //Given an int n, return the absolute difference between n
        // and 21, except return double the absolute difference if n is over 21.

        System.out.println(diff21(19));


    }
    public static int diff21(int n) {
        int j = 21;
        if(n <= j){
            return j -n;
        } else {
            return (n - j) *2;
        }
        }
}
