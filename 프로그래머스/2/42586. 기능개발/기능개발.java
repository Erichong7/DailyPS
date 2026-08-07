import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < progresses.length; i++) {
            queue.add(getDay(progresses[i], speeds[i]));
        }

        int temp = queue.peek();
        int unit = 0;
        while(!queue.isEmpty()) {
            if(queue.peek() <= temp) {
                queue.poll();
                unit++;
            } else {
                temp = queue.peek();
                answer.add(unit);
                unit = 0;
            }
        }
        answer.add(unit);


        return answer.stream()
                .mapToInt(n -> n)
                .toArray();
    }

    public int getDay(int progress, int speed) {
        return (int) Math.ceil((100.0 - progress) / speed);
    }
}