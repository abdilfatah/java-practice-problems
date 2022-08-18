public class isInertial {

    static boolean isOdd(int n){

        if (n % 2 == 0){
            return false;
        }
        return true;
    }

    static boolean isEven(int n){

        if (n % 2 == 0){
            return true;
        }
        return false;
    }

    static int isInertial(int[] a){
        int max = 0;
        int odd = 0;
        for (int i = 0; i<a.length; i++){
            if (a[i] > max){
                max = a[i];
                if (isOdd(a[i])){
                    odd++;
                }
            }

            for (int j = i+1; j<a.length; j++){
                if (a[i]% 2 == 0 && a[j] % 2 !=0 && a[i] > a[j] && a[i] != max){
                    return 0;
                }
            }

            if (odd <= 1 && max % 2 != 0){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args){

        System.out.println(isInertial(new int[]{2,3,5,7}));
    }
}