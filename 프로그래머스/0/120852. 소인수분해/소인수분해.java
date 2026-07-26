import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int n) {
        Set<Integer> set = new HashSet<>();
        while (n >= 2) {
            for(int i = 2; i <= n; i++) {
                if(n % i == 0) {
                    set.add(i);
                    n /= i;
                    break;
                }
            }
        }

        return set.stream()
                .mapToInt(i -> i)
                .sorted()
                .toArray();
    }
}