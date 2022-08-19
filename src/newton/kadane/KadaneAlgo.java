package newton.kadane;

public class KadaneAlgo {
    public static void main(String[] args) {
        System.out.println(getMaxSubArr(new int[] {1, 7, -4, 13, -18, 11, 3}));
    }

    private static int getMaxSubArr (int a[]) {
        int meh = a[0]; // max ending here
        int max = a[0]; // max so far
        // if meh > 0 --> update mso
        // if meh < 0 --> do not update mso
        for (int i = 1; i < a.length; i++) {
            if (meh < 0) {
                meh = a[i];
            } else {
                meh += a[i];
            }
            if (max < meh) max = meh;
        }
        return max;
    }

    private static int kadanesNegative(int a[]) { // negative kadans
        int minEndHere = a[0];
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (minEndHere < 0 ) minEndHere += a[i];
            else minEndHere = a[i];

            if (minEndHere < min) min = minEndHere; // got smallest array sum
        }
        return min;
    }

//    private static int maxCircular (int a[]) {
//        int[] b = new int[a.length * 2];
//        for (int i = 0; i < a.length; i++) {
//            b[i] = a[i];
//            b[a.length + i] = a[i];
//        }
//
//    }

}
