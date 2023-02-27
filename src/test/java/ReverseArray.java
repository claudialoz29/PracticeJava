import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arrNum = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arrNum)); // [1, 2, 3, 4, 5]

        revArr(arrNum);

        System.out.println(Arrays.toString(arrNum)); // [5, 4, 3, 2, 1]
    }

    public static void revArr(int[] arrNum) {
       int end = arrNum.length-1;
       for(int i = 0; i < arrNum.length/2; i++){
           int tmp = arrNum[i];
           arrNum[i] = arrNum[end];
           arrNum[end] = tmp;
           end--;
       }
    }
}

