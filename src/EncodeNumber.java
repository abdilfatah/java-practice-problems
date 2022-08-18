public class EncodeNumber {

    static boolean isPrime(int n){
        for (int i = 2; i <= n/2; i++){
            if (n % i == 0 ){
                return false;
            }
        }
        return true;
    }
    static int[ ] encodeNumber(int n){

        int[] primefact = new int[]{};

        for (int i = 2; i <= n; i++){
            int index = 0;
            if (n % i == 0 && isPrime(i)){
                primefact[index] = i;
                index++;
                System.out.print(i +"," );
                System.out.println(index);
                n = n / i;
                i--;
            }
        }
        return primefact;
    }

    public static void main(String[] args){
        int a = 24;
        int[] b = encodeNumber(a);
        for(int i = 0; i < b.length; i ++)
            System.out.print(b[i] + ",");
    }

    }

