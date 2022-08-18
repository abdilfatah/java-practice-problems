public class LargestAdjacentSum {
    static int largestAdjacentSum(int[ ] a){
        int sum = 0;
        for (int i = 0; i < a.length - 1; i++){
            if(a[i] + a[i+1] > sum){
                sum = a[i] + a[i+1];

            }
        }
        return  sum;
    }

    public static void main(String[] args){
        System.out.println( largestAdjacentSum(new int[]{1,1,1,1,1,2,1,1,1}));
    }

}
