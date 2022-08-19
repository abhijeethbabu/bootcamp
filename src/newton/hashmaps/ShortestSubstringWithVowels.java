package newton.hashmaps;

import java.util.HashMap;

public class ShortestSubstringWithVowels {
    public static void main(String[] args) {

    }
    static boolean isVowel (char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    static int getShortestVowelString (String str) {
        int e = 0, s = 0;
        int minLength = str.length();
        HashMap<Character, Integer> map = new HashMap<>();
        while (e < str.length() && map.size() < 5) {
            if (isVowel(str.charAt(e))) {
                map.put(str.charAt(e), map.getOrDefault(str.charAt(e), 0) + 1);
            }
            e++;
        }
        if (map.size() == 5) {
            if (e - s <= minLength) minLength = e - s;
        }
        while (s < str.length() && map.size() == 5) {
            if (isVowel(str.charAt(s))) {
                if (map.get(str.charAt(s)) == 1) {
                    map.remove(str.charAt(s));

                    if (e - s < minLength) minLength = e - s;
                } else map.put(str.charAt(s), map.get(str.charAt(s)) - 1);
            }
            s++;
        }

        return minLength;
    }
}
