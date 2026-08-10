import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> max_heap = new PriorityQueue<>(Collections.reverseOrder()); // 내림차순 (큰 수부터)
        PriorityQueue<Integer> min_heap = new PriorityQueue<>(); // 올람차순 (작은 수부터)

        for (String operation : operations) {
            String[] arr = operation.split(" ");
            String op = arr[0];
            int num = Integer.parseInt(arr[1]);

            if (op.equals("I")) {
                // 삽입
                max_heap.offer(num);
                min_heap.offer(num);
            } else if(!max_heap.isEmpty() && !min_heap.isEmpty()){
                if (num == 1) {
                    // 최댓값 삭제
                    int temp = max_heap.poll();
                    min_heap.remove(temp);
                } else {
                    // 최솟값 삭제
                    int temp = min_heap.poll();
                    max_heap.remove(temp);
                }
            }
        }

        if (!max_heap.isEmpty() && !min_heap.isEmpty()) {
            answer[0] = max_heap.poll();
            answer[1] = min_heap.poll();
        }
        return answer;
    }
}