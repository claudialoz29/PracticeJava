import java.util.Arrays;

public class BigDiff {
    public static void main(String[] args) {
        //Given an array length 1 or more of ints, return
        // the difference between the largest and smallest values in the
        // array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.

        int diff = (bigDiff(new int[]{10, 3, 5, 6}));
        System.out.println(diff);
    }

    public static int bigDiff(int[] nums) {
        int max = nums[0];
        int result = 0;
        for( int el : nums){
            if(max < el){
                max = el;
            }
            int min = nums[0];
            for(int n : nums){
                if( min > n){
                    min = n;
                    result = max - min;
                }
            }
        }
        return result;
    }
}
