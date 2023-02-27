public class ArrayMax {
    public static void main(String[] args){
        System.out.println(max(new int[] {4, 5, 99, 8, 1, 2})); // 99
        System.out.println(max(new int[] {5, 5, 4, 3, 2})); // 5
        System.out.println(max(new int[] {1, 1, 1})); // 1
    }
    public static int max(int[] arr) {
        int max = arr[0];
        for(int n : arr){
            if(max < n){
                max = n;
            }
        }
        return max;
    }
}
