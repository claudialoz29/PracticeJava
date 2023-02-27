public class Prueb {
    public static void main(String[] args){

        int secondMax = secondMax(new int[] {1,2,3,4});
        System.out.println(secondMax);
    }
    public static int secondMax(int[] arr){
        int sum = 0;
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        return (sum-min-max)/(arr.length-2);
    }
}
