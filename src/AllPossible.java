public class AllPossible {
    public static int isAllPosiible(int[] a){
        int Allp = 1;

        for (int j = 0; j < a.length && Allp == 1; j++){
            int found =0;
            for (int k = 0; k < a.length && found == 0; k++){
                if (k == a[j]){
                    found = 1;
                }

            }
            if (found == 0)
            {
                Allp = 0;
            }
        }
        return Allp;

    }

    public static void main(String arg[]){
        System.out.println(isAllPosiible(new int[]{0,1,2,3,5,4}));
    }
}
