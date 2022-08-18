public class PerfectNumber {
    static int henry(int i, int j){
        int count = 0;
        int firstP = 0;
        int secondP = 0;

        int n = 1;
        while (count <= j){
            int sum = 0;
            for (int k = 1; k < n; k++) {
                if (n % k == 0) {
                    sum += k;
                }
            }
                if(sum == n){
                    count++;
                    if (count == i) firstP = sum;
                    if (count == j) secondP = sum;
                    n++;
                }
            }

        return firstP + secondP;
    }

    public static void main(String[] args) {
        System.out.println(henry(1, 2));
    }
}
