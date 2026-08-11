import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (a, b) -> {
                    int cmp = a.charAt(n) - b.charAt(n);
                    if (a.charAt(n) != b.charAt(n)) {
                        return cmp;
                    }
                    return a.compareTo(b);
                }
        );
        return strings;
    }
}