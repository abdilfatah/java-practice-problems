public class IntegerBasedRounding {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int n = 3;
        doIntegerBasedRounding(a, n);
    }

    public static void doIntegerBasedRounding(int[] a, int n) {
        if (n <= 0) {
            System.out.println("N must be GT 0");
            return;
        }

        for (int i = 0; i < a.length; i++) {
            int curr = 0, j = 1;
            while (curr < a[i]) {
                curr = n * j;

                int prev = (j - 1) * n;
//                System.out.println(prev);
                if (a[i] - prev < curr - a[i]) {a[i] = prev; }

                else if (a[i] - prev > curr - a[i]) {a[i] = curr;}
                else {a[i] = curr;}
                j++;
//                System.out.println(a[i]);
            }
        }
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + ",");
    }
}
