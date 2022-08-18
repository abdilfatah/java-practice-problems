public class RepsEqual {
    static int repsEqual(int[ ] a, int n){

        int result = 0;
        for (int i = 0; i < a.length; i++){
            result = result * 10 + a[i];
        }

        if (result == n){
            return 1;
        }

        return 0;
    }

    public static void main(String[] args){
        System.out.println( repsEqual(new int[]{3, 2, 0, 5},  32053));
    }
}
