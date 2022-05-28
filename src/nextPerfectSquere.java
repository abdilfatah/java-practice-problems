public class nextPerfectSquere {

     static int perfectSq(int n){
        int result;
        if (n<0){
            result = 0;
        }
        else if (n==0){
            result = 1;
        }
        else {
            int calc = (int)Math.floor(Math.sqrt(n)) + 1;
            result = calc*calc;
        }
        return result;
    }

    public static void main(String[] args){
            System.out.println(perfectSq(36));
    }
}
