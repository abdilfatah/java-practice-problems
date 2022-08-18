public class ZeroPlentiFul {

    static int isZeroPlentiful(int[ ] a){
        int counter = 0; int counterOfZero = 0;

        for (int i = 0; i < a.length; i++){
            if(a[i] == 0 ) {
                counterOfZero++;
            }

            if (a[i] != 0 && counterOfZero > 0 && counterOfZero < 4){
                return 0;
            }
            if (counterOfZero >= 4 && a[i] != 0 || i == a.length -1 ) {
                counter++;
                counterOfZero = 0;
            }


        }

        return counter;
    }

    public static void main(String[] args){
        System.out.println(isZeroPlentiful(new
        int[]{1,0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0}));
    }
}
