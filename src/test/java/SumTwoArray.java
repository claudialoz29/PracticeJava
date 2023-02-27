import java.util.Arrays;

public class SumTwoArray {
    public static void main(String[] args){

        System.out.println(Arrays.toString(sum(new int[] {1,2,3,5}, 4)));

    }
    public static int[] sum(int numArr[], int num) {
       for(int i = 0; i < numArr.length; i++){
           for(int j = i +1; j < numArr.length; j++){
               if(numArr[i] + numArr[j] == num){
                   return new int[] {numArr[i], numArr[j]};
               }
           }
       }
       return new int[] { -1, -1};
    }
}
