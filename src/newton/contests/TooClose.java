package newton.contests;

import java.util.Arrays;

public class TooClose {
    public static void main(String[] args) {
        int[] a = new int[] {4, 7, 10, 6, 5};
        int k = 6;
        Arrays.sort(a);
        int i = 0;
        while (search(a, k - i) && search(a, k + i)) {
            i++;
        }
        if (!search(a, k - i)) {
            System.out.println(k - i);
            return;
        }
        if (!search(a, k + i)) System.out.println(k + i);
    }
    private static boolean search(int[] a, int k) {
        int s = 0, e = a.length - 1;
        int res;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (a[m] == k) return true;
            else if (a[m] > k) e = m - 1;
            else s = m + 1;
        }
        return false;
    }
}
