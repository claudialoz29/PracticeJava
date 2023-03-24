import java.util.Arrays;

public class RevArray2 {
    public static void main(String[] args) {
        int[] arrNum = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arrNum)); // [1, 2, 3, 4, 5]

        revArr(arrNum);

        System.out.println(Arrays.toString(arrNum)); // [5, 4, 3, 2, 1]
    }

    public static void revArr(int[] arrNum) {
        int left = 0;
        int right = arrNum.length - 1;
        while (left < right) {
            int temp = arrNum[left];
            arrNum[left] = arrNum[right];
            arrNum[right] = temp;
            left++;
            right--;
        }
    }
}
