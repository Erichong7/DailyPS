import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : array) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        int maxCount = 0;
        for (int count : counts.values()) {
            maxCount = Math.max(maxCount, count);
        }

        int answer = -1;
        int modeCount = 0;
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == maxCount) {
                answer = entry.getKey();
                modeCount++;
            }
        }

        return modeCount == 1 ? answer : -1;
    }
}