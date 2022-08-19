package newton.hashmaps;

import java.util.HashMap;

public class ContigousArray {
    // 1 0 1 0 1
    // 1 -1 1 -1 1
    // 1 0 1 0 1 --> ps
    public static void main(String[] args) {
        System.out.println(findMaxLength(new int[] {0, 0, 1, 0, 1, 0, 1, 1, 0}));
    }
    public static int findMaxLength(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) nums[i] = -1;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int ps = 0;
        int maxL = 0;
        for (int i = 0; i < nums.length; i++) {
            ps += nums[i];
            if (ps == 0) {
                map.put(ps,i);
                maxL = i + 1;
            }
            if (!map.containsKey(ps)) {
                map.put(ps, i);
            } else {
                maxL = maxL < i - map.get(ps) ? i - map.get(ps): maxL;
            }
        }
        return maxL;
    }
}
