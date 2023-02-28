import java.lang.reflect.Array;
import java.util.Arrays;

public class CountEvensArray {
    public static void main(String[] args){
        //Return the number of even ints in the given array. Note: the % "mod"
        // operator computes the remainder, e.g. 5 % 2 is 1.

        System.out.println(countEvens(new int[] {2, 1, 2, 3, 4 }));
        System.out.println(countEvens(new int[] {2, 2, 0 }));
        System.out.println(countEvens(new int[] {1, 3, 5 }));
    }
    public static int countEvens(int[] nums) {

            int num = 0;
            for(int n : nums){
                if(n % 2 == 0) {
                    num++;
                }
            }
            return num;
    }
}