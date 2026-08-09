import java.util.PriorityQueue;

class Solution {

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public int solution(int[] scoville, int k) {
        int answer = 0;

        for (int s : scoville) {
            minHeap.offer(s);
        }

        while (!isHigher(k) && minHeap.size() > 1) {
            answer++;
            int first = minHeap.poll();
            int second = minHeap.poll();
            int food = first + (second * 2);
            minHeap.add(food);
        }
        
        if (!isHigher(k)) {
            return -1;
        }

        return answer;
    }

    public boolean isHigher(int k) {
        for (int s : minHeap) {
            if (s < k) {
                return false;
            }
        }
        return true;
    }
}