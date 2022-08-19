package newton.kadane;

public class CoolAndHot {
    public static void main(String[] args) {

    }
    private static long kadaneMax (long[] nums) {
        long msf = nums[0], max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (msf > 0) msf += nums[i];
            else msf = nums[i];
            max = Math.max(msf, max);
        }
        return max;
    }

    private static long kadaneMin (long[] nums) {
        long msf = nums[0], min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (msf < 0) msf += nums[i];
            else msf = nums[i];
            min = Math.min(msf, min);
        }
        return min;
    }
}
