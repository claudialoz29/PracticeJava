public class monkeyTrouble {
    public static void main(String[] args){
        //We have two monkeys, a and b, and the parameters aSmile
        // and bSmile indicate if each is smiling. We are in trouble
        // if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

        System.out.println(monkeyTrouble(true, true));
        System.out.println(monkeyTrouble(false, false));
        System.out.println(monkeyTrouble(true, false));

    }



    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    return aSmile == bSmile;
    }
}
