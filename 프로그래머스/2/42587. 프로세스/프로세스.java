import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0; i < priorities.length; i++) {
            queue.add(new int[]{i, priorities[i]});
        }
        
        int count = 0;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            
            boolean hasHigher = false;
            for(int[] p : queue) {
                if (current[1] < p[1]) {
                    hasHigher = true;
                }
            }
            
            if (hasHigher) {
                queue.add(current);
            } else {
                count++;
                if (current[0] == location) {
                    return count;
                }
            }
        }
        return count;
    }
}