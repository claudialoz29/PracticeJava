import java.util.Arrays;

public class SumOfTwo {
    public static void main(String[] args){
        // writte the program with the sum of two you get to your target

        System.out.println(Arrays.toString(sumOfTwo(new int[] {1,2,3,5}, 4)));


    }

    public static int[] sumOfTwo(int[] numArr, int target){
        for(int i = 0; i < numArr.length; i++){
            for(int j = i + 1; j < numArr.length; j++){
                if(numArr[i] + numArr[j] == target){
                    return new int[] {numArr[i], numArr[j]};
                }
            }
        }
        return new int[] { -1, -1};

    }
}
