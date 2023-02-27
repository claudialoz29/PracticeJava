public class EvenorOdd {
    public static void main(String[] args){

            System.out.println(evenOrOdd(2));

    }
    public static String evenOrOdd(int num){
        if(num % 2 == 0){
            return "even";
        } else {
            return "odd";
        }

    }
}
