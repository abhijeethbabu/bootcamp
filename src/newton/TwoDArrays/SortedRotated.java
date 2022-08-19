package newton.TwoDArrays;

import java.sql.SQLOutput;

public class SortedRotated {
    // If sorted increasingly 1 2 3 4 -> find min
    // if sorted decreasingly 4 3 2 1 -> find max
    public static void main(String[] args) {
        sortedRotated(new int[] {3, 4, 1, 2});
    }

    static void sortedRotated (int a[]) {
        int minId = -1, maxId = -1, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
                minId = i;
            }
            if (a[i] > max) {
                max = a[i];
                maxId = i;
            }
        }
        // if minId  > maxId --> sorted ascending
        // else --> sorted descending
//        boolean p = true;
        if (minId > maxId) {
            // ascending
            // a[0] to a[minId - 1] increasing
            // a[minId] to a[last] increasing
            for (int i = 0; i < minId - 1; i++) {
                if (a[i] > a[i + 1]) {
                    System.out.println("No");
                    return;
                }
            }
            for (int i = minId; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    System.out.println("No");
                    return;
                }
            }
            System.out.println("Yes");
            return;
        } else {
            // descending
            // a[0] to a[maxId - 1] decreasing
            // a[maxId] to a[last] decreasing
            for (int i = 0; i < maxId - 1; i++) {
                if (a[i] < a[i + 1]) {
                    System.out.println("No");
                    return;
                }
            }
            for (int i = maxId; i < a.length - 1; i++) {
                if (a[i] < a[i + 1]) {
                    System.out.println("No");
                    return;
                }
            }
            System.out.println("Yes");
            return;
        }
    }

}
