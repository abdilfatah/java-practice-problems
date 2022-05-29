public class PrimeCount {

    static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int primeCount(int start, int end){

        int prime = 0;
        for (int i = start; i <= end; i++){

                if (isPrime(i)){
                    prime++;
                }
        }

        return prime;
    }
    public static void main(String[] args){
        System.out.println(primeCount(10, 30));
    }
}
