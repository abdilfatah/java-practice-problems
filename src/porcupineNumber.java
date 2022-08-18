public class porcupineNumber {

    public static boolean isEndsNine(int n){
        int a = n % 10;
        if (a == 9){
            return true;
        }
        return false;
    }


    public static int isporcupineNumber(int n){
        if (n % 2 == 0 || !isEndsNine(n)){
            return 0;
        }
        return 1;
    }

    public static void main(String[] args){
        System.out.println( isporcupineNumber(139));
    }
}
