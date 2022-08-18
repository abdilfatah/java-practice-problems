public class SumFactor {
    static int sumFactor(int[ ] a){
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < a.length; i++){
            sum += a[i];
        }

        for (int j = 0; j < a.length; j++){
            if (sum == a[j]){
                counter++;
            }
        }
        return counter;
    }
    public static void main(String[] args){
        System.out.println( sumFactor(new int[]{0, 0, 0} ));
    }
}
