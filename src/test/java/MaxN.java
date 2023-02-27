public class MaxN {
    public static void main(String[] args){

        System.out.println(maxNu(new int[] {3,2,5,6,7}, 4));
    }


    public static int maxNu(int[] arr, int n){
        int f = arr[0];
        for(int el : arr){
            if(f < el){
                f = el;
            }
        }
        return f-n;
    }
}
