public class NumberPalindrome {
    public static void main(String[] args) {
        boolean isPal = isPalNum(545);
        System.out.println(isPal); // true
    }

    public static boolean isPalNum(int num) {
        int reversed = 0;
        int original = num;

        // reverse the number
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }

        // compare the reversed number with the original number
        return original == reversed;

    }
}

