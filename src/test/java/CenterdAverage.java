public class CenterdAverage {
    public static void main(String[] args){
        int center = centeredAverage(new int[] {1, 1, 5, 5, 10, 8, 7});
        System.out.println(center);
    }
    public static int centeredAverage(int[] nums) {
      int n = nums[0];
        for(int i = 0; i < nums.length /2 + 1; i++){
           n = nums[i];
        }
      return n;
    }
}
