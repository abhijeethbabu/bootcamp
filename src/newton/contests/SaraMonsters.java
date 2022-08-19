package newton.contests;

public class SaraMonsters {
    public static void main(String[] args) {
        System.out.println(getIdx(new int[] {10, 10, 10}));
    }
    private static int getIdx(int[] a) {
        int j = 0;
        while(a[j] != 0) {

            for (int i = 0; i < a.length; i++) {
                if (a[i] != 0) a[i]--;
            }
            j = (j + 1) % a.length;
        }
        return j;
    }

}
