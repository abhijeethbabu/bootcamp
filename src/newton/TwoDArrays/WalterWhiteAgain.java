package newton.TwoDArrays;

public class WalterWhiteAgain {

    public static void main(String[] args) {
        System.out.println(walterWhiteEasy(new int[] {9,8,7,6,5,4,3}, new int[] {1,2,3}));
    }

    static int walterWhiteEasy (int[] S, int[] C) {
        int c = C.length, s = S.length;
        if (c > s) return 0;
        int count = 0;
        // loop must run from 0 to s - c
        int[] twoC = new int[2*c];
        for (int i = 0; i < c; i++) {
            twoC[i] = C[i];
            twoC[i + c] = C[i];
        }
        for (int idx = 0; idx <= s - c; idx++) {
            int i = idx, j = 0, cycle = c;
            while (cycle-- > 0) {
                 j = c - cycle - 1;
                boolean flag = false;
                while (i < idx + c - 1) {
                    if (S[i + 1] - S[i] == twoC[j + 1] - twoC[j]) {
                        flag = true;
                        j++;
                        i++;
                    } else {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
