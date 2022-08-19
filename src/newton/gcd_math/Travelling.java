package newton.gcd_math;

public class Travelling {
    public static void main(String[] args) {

    }

    static int travelling (int[] a) {
        int d = gcd(a[0],a[1]);
        for (int i = 2; i < a.length; i++) {
            d = gcd(d, a[i]);
        }
        return d;
    }

    static int gcd(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;
        while (a % b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return b;
    }
}
