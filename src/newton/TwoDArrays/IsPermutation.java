package newton.TwoDArrays;

public class IsPermutation {
    public static void main(String[] args) {
        int[] a = new int[] {1, 2, 3};
        int[] b = new int[] {3, 2, 1};
        System.out.println(isPermutation(a, b));
    }
    static boolean isPermutation(int[] a, int[] b) { // check if a is a cyclic permutation of b
        // a must be present in the array with {b} repeated twice for it to be a cyclic permutation
        if (a.length != b.length) return false;
        int[] res = new int[a.length + b.length];
        for (int i = 0; i < b.length; i++) {
            res[i] = b[i];
            res[i+b.length] = b[i];
        }
        // find a[i] in res
        int j = -1;
        for (int i = 0; i < res.length; i++) {
            if (res[i] == a[0]) {
                j = i;
                break;
            }
        }
        if (j == -1 || j > a.length) return false;
        for (int i = j; i < j + a.length; i++) {
//            int p = a[i - j], q = res[i]
            if (a[i - j] != res[i]) return false;
        }
        return true;
    }
}
