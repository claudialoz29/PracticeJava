public class MaxArray {
    public static void main(String[] args){
        System.out.println(max(new int[] {4, 5, 99, 8, 1, 2}));
        System.out.println(min(new int[] {4, 5, 99, 8, 1, 2}));
        System.out.println(min(new int[] {5,5,4,3,2}));

    }
    public static int max(int[] arr){
       int maxNum = arr[0];
        for(int each: arr){
            if(maxNum < each){
                maxNum = each;
            }
        }
        return maxNum;
    }
    public static int min(int[] arr){
        int minNum = arr[0];
        for(int each : arr){
            if(minNum > each){
                minNum = each;
            }
        }
        return  minNum;
    }
}
