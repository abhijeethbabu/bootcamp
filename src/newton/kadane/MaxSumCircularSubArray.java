package newton.kadane;

public class MaxSumCircularSubArray {
    /*
    Consider an array x1 x2 x3 .... xn
    For it to be circular, the criteria must be that from any point in the array, we are able to for a subarray of
    length n - 1
    eg From xn to x(n-2)  --> length of this array would be n + n - 1 = 2n - 1
    Create a new array of length 2n - 1 --> b
    b[0] = a[0] and b[n] = a[0]  iteratively b[i] and b[n + i] = a[i]  0 to n-1 and 0 to n-3
    Then find the subarray with the minimum sum
     */
    public static void main(String[] args) {
        System.out.println(maxSubarraySumCircular(new int[] {-10,-7,9,-7,6,9,-9,-4,-8,-5}));
    }

    public static int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        for(int num: nums) totalSum += num;
        int maxSum = kadaneMax(nums);
        int minSum = kadaneMin(nums);
        if (totalSum - minSum == 0) return maxSum;
        return Math.max(maxSum, totalSum - minSum);
    }

    // private helper Kadanes
    private static int kadaneMax (int[] nums) {
        int msf = nums[0], max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (msf > 0) msf += nums[i];
            else msf = nums[i];
            max = Math.max(msf, max);
        }
        return max;
    }

    private static int kadaneMin (int[] nums) {
        int msf = nums[0], min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (msf < 0) msf += nums[i];
            else msf = nums[i];
            min = Math.min(min, msf);
        }
        return min;
    }


}
