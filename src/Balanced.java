public class Balanced {

    public static int isBalanced(int a[]){
        int found  = 1;
        for (int i = 0; i < a.length; i++) {
            int isValid = 0;
            for (int j = 0; j < a.length; j++){
                if (a[i] == -a[j]){
                    isValid = 1;
                    break;
                }

            }
            if (isValid == 0){
                found = 0;
            }
        }
        return found;
    }

    public static void main(String[] args){
        System.out.println( isBalanced(new int[]{2, 3, -2, -3}));
    }
}
