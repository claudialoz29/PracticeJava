public class StringPalindrome {
    public static void main(String[] args) {
        System.out.println(isPal("level")); // true
        System.out.println(isPal("apple")); // false
    }

    public static boolean isPal(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i = str.length() -1; i>=0; i--) {
        sb.append(str.charAt(i));
        }
        return sb.toString().equals(str);
    }
}

