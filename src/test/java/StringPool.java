public class StringPool {
    public static void main(String[] args) {


        String str = "apple";
        String strOne = "apple";
        String strTwo = new String("apple");

        System.out.println(str == strOne);//true
        System.out.println(str == strTwo);// false
        System.out.println(str.endsWith(strTwo));//true we are comparing the content
    }
}
