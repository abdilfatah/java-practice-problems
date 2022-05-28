public class nUpCount {

    static int upCount(int [] a, int n){
        int sum = 0;
        int partialsum;
        int counter = 0;

        for (int i = 0; i < a.length; i++){
            partialsum = sum;
            sum+=a[i];
            if (partialsum <= n && sum > n){
                counter++;
            }

        }
        return counter;
    }
    public static void main(String[] args){
        System.out.println(upCount( new int[]{2, 3, 1, -6, 8, -3, -1, 2},5));
    }
}
