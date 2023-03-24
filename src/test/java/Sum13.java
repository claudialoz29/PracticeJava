public class Sum13 {
    public static void main(String[] args){
//Return the sum of the numbers in the array, returning 0
// for an empty array. Except the number 13 is very unlucky, so it
// does not count and numbers that come immediately after a 13 also do not count.

        System.out.println(sum13(new int[] { 1, 2, 2, 1}));
        System.out.println(sum13(new int[] { 1, 1}));
        System.out.println(sum13(new int[] { 1, 2, 2, 1, 13}));

    }
    public static int sum13(int[] nums) {
       int num = 0;
        for(int i = 0; i < nums.length; i++) {
          if (nums[i] == 13){
               i++;
           } else {
               num += nums[i];
           }
       }
        return num;

    }
}