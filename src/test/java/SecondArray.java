import java.util.Arrays;

public class SecondArray {
    public static void main(String[] args){

        int secondMax = secondMax(new int[] {1,2,3,4});
        System.out.println(secondMax);
    }
    public static int secondMax(int[] arr){
        int max = arr[0];
        for(int el : arr){
            if(max < el){
                max = el;
            }
        }
        int secondMax = Integer.MIN_VALUE;
        for(int el : arr){
            if(secondMax < el && el !=max){
                secondMax = el;
            }
        }
        return secondMax;
       }

}
