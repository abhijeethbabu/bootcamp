package newton.TwoDArrays;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FindTheString {
    public static void main(String[] args) {
//        char[][] arr = new char[][]{"asdfg".toCharArray(), "zxcvv".toCharArray(), "qwert".toCharArray()};
//        findTheString("azqsxwdcefvrgbt",arr,3,5);
        String str[] = {"asdfg", "zxcvv", "qwert"};
        findStringOpt("azqsxwdcefvrgbt", str);
    }

    static void findTheString (String s, char[][] arr, int m, int n) {
//        ArrayList<Character> list = new ArrayList<>();
        // int j = 0;
        boolean isPresent = false;
        for (int j = 0; j < s.length(); j++) {
            isPresent = false;
            for (int i = 0; i < n; i++) {
                if (arr[j % m][i] == s.charAt(j)) {
                    isPresent = true;
                    break;
                }
            }
            if (!isPresent) {
                break;
            }
        }
//        return isPresent;
        if (isPresent) System.out.println("Yes");
        else System.out.println("No");
    }

    static void findStringOpt (String s, String[] str) {
        int row = str.length;
        boolean isTrue = false;
        for (int i = 0; i < s.length(); i++) {
            isTrue = false;
            if (str[i % row].contains(String.valueOf(s.charAt(i)))) {
               isTrue = true;
            } else break;
        }
        if (isTrue) System.out.println("Yes");
        else System.out.println("No");
    }

}
