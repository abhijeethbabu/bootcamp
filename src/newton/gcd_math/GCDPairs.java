package newton.gcd_math;
// Simple approach
// The max gcd would lie below the largest element of the array
//  the max gcd found would have to divide atleast two of elements from the top (largest)
// Create a sieve of max(arr) + 1 elements
// the indices represent numbers from 0 to max
// add +1 to idx representing array elements
// start couting from the last position
// find the elements that have multiples that lie between 1 to max
// count number of times they occur
// exit when first element from the last occurs >= 2 times
public class GCDPairs {
    public static void main(String[] args) {
        System.out.println(getGcdPair(new int[] {4, 6}));
    }

    static int getGcdPair (int a[]) {
        int max = 0;
        for(int i : a) {
            if (i > max) max = i;
        }
        int c[] = new int[max + 1]; // array with count

        for (int i = 0; i < a.length; i++) {
            c[a[i]]++;      // finding nums which are present and setting their count = 1
        }
        // sieve of erastothenes approach
        int count = 0;
        for (int i = max; i >= 1; i--) {
            for (int j = i; j <= max; j += i) {
                if (c[j] > 0) count += c[j]; // count of number is increased
                if (count >= 2) return i; // pair is found
            }
            count = 0;
        }
        return 1; // default
    }
}
