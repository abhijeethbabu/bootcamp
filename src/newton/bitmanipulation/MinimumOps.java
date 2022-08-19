package newton.bitmanipulation;

public class MinimumOps {
    public static void main(String[] args) {
//        minOps(14);
//        System.out.println(minOpsCount(14));
        System.out.println(minimumOneBitOperations(14, 0));
    }
    public static int minimumOneBitOperations(int n, int res)
    {

        // Base Case
        if (n == 0)
            return res;

        // Store the highest power of 2
        // less than or equal to n
        int b = 1;
        while ((b << 1) <= n)
            b = b << 1;

        int k = (b >> 1) ^ b ^ n;
        // Return the result
        return minimumOneBitOperations(k, res + b);
    }

    static void minOps (int n) {
        while (n > 0) {
            // ops
            // change rightmost digit
            n ^= 1;
            System.out.println(Integer.toBinaryString(n));
            // need to find set bits at i and i - 1 such that all bits right to i - 1 are zeros
            // n ^ ( (n & (-n) ) << 1 )
            n ^= ( (n & (-n) ) << 1 );
            System.out.println(Integer.toBinaryString(n));
        }
//        return 0;
    }
    static int minOpsCount (int n) {
        int c = 0;
        while (n > 0) {
            // ops
            // change rightmost digit
            if (n > 0) {
                n ^= 1;
                c++;
            } else break;
            // need to find set bits at i and i - 1 such that all bits right to i - 1 are zeros
            // n ^ ( (n & (-n) ) << 1 )
            if (n > 0) {
                n ^= ((n & (-n)) << 1);
                c++;
            } else break;
        }
        return c;
    }
}
