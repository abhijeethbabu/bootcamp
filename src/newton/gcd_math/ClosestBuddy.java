package newton.gcd_math;

public class ClosestBuddy {
    public static void main(String[] args) {
        int[] r = closestBud(new int[] {1, 2, 4, 3, 9, 4, 5, 20,32,45,42,32,13,14,15,56});
        for(int i : r) System.out.print(i + " ");
//        System.out.println(gcd(2, 3));
    }

    static int[] closestBud (int[] a) {
        int[] res = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                res[i] = i + 1;
                continue;
            }
            int l = 0, r = 0;
            for (int j = i + 1; j < a.length ; j++) {
                if (gcd(a[i],a[j]) == 1) {
                    l = j;
                    break;
                }
            }
            for (int j = i - 1; j >= 0 ; j--) {
                if (gcd(a[i],a[j]) == 1) {
                    r = j;
                    break;
                }
            }
            int m = Math.abs(l - i) < Math.abs(r - i) ? l : r;
            if (m == 0) res[i] = -1;
            else res[i] = m + 1;
        }
        return res;
    }

    static int gcd(int a, int b) {
        while (a % b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return b;
    }
}
