import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int k = nums.length / 2;
        return Math.min(map.size(), k);
    }
}