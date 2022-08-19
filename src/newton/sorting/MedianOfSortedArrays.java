package newton.sorting;

public class MedianOfSortedArrays {
    // X 1 2 3
    // Y 4 5 6 7 8
    // if pivotX is 1 --> 1 >|< 2 3 --> >|< is the partition
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[] {1, 2, 3}, new int[] {4, 5, 6, 7, 8}));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) return findMedianSortedArrays(nums2, nums1); // shorter one first
        int lo = 0, hi = nums1.length;
        int cl = nums1.length + nums2.length;
        while (lo <= hi) {
            int pivotX = (hi + lo) / 2;
            int pivotY = (cl + 1) / 2 - pivotX; // adding 1 ensures that / 2 rounds the sum to the nearest greater integer
            // eg cl = 3 --> (cl + 1) / 2 is 2 and cl / 2 is 1
            int leftX = getLeft(nums1, pivotX);
            int rightX = getRight(nums1, pivotX);
            int leftY = getLeft(nums2, pivotY);
            int rightY = getRight(nums2, pivotY);
            // lX < rY && rX > lY
            if (leftX <= rightY && leftY <= rightX) {
                if (cl % 2 == 0) {
                    return (Math.max(leftX, leftY) + Math.min(rightX, rightY)) / 2.0;
                } else return Math.max(leftX, leftY);
            }

            if (leftX < rightY) {
                lo = pivotX + 1;
            } else hi = pivotX - 1;
        }

        return -1.0;
    }

    private static int getLeft(int nums[], int pivot) {
        if (pivot == 0) return Integer.MIN_VALUE;
        return nums[pivot - 1];
    }

    private static int getRight(int nums[], int pivot) {
        if (pivot == nums.length) return Integer.MAX_VALUE;
        return nums[pivot];
    }
}
