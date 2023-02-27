import java.util.Random;

public class EvenOdd {
    public static void main(String[] args){
        //Even (num % 2 ==0)    // odd (num % 2 == 1)
        int num = new Random().nextInt(101);

        if(num % 2 == 0){
            System.out.println("Yes, Even: " + num);
        } else {
            System.out.println("No, Odd: " + num);
        }
    }
}
