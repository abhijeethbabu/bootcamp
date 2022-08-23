package newton.TwoDArrays;

import java.util.Arrays;

public class WalterWhiteEasy {
    public static void main(String[] args) {
//        int[] a = {1, 2, 3};
//        System.out.println(Arrays.toString(a));
//        cycle(a);
//        System.out.println(Arrays.toString(a));
//        cycle(a);
//        System.out.println(Arrays.toString(a));
//        System.out.println(walterWhite(new int[] {1,2,3,1,2,4,1,2,3}, new int[] {1,2,3}));
        System.out.println(walterWhiteEasy(new int[] {1,2,3,1,2,4,1,2,3}, new int[] {1,2,3}));

    }
    static int walterWhite (int[] S, int[] C) {
        int c = C.length, s = S.length;
        if (c > s) return 0;
        int count = 0;
        // loop must run from 0 to s - c
        for (int i = 0; i <= s - c; i++) {
            int[] temp = new int[c];
            for (int j = i; j < i + c ; j++) {
                temp[j - i] = S[j];
            }
            for (int cycle = 0; cycle < c; cycle++) {
                boolean flag = false;
                for (int k = 1; k < c; k++) {
                    if (temp[k] - temp[k-1] != C[k] - C[k-1]) {
                        flag = false;
                        break;
                    }
                    else flag = true;
                }
                if(flag) {
                    count++;
                    break;
                } else cycle(temp);
//                else break;
            }
        }
        return count;
    }

    static void cycle(int[] arr) { // kth cyclic permutation
        int j = arr.length - 1;
        while (j >= 1) {
            int t = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = t;
            j--;
        }
    }

    static int walterWhiteEasy (int[] S, int[] C) {
        int c = C.length, s = S.length;
        if (c > s) return 0;
        int count = 0;
        // loop must run from 0 to s - c
        for (int i = 0; i <= s - c; i++) {
            int[] temp = new int[c];
            for (int j = i; j < i + c ; j++) {
                temp[j - i] = S[j];
            }
            if(isPermutation(C, temp)) count++;
        }
        return count;
    }
    static boolean checkPer (int[] S, int[] C) {

        return false;
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
