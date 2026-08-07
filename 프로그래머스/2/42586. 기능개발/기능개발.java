import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        
        int n = progresses.length;
        int[] days = new int[n];
        for (int i = 0; i < n; i++) {
            days[i] = getDay(progresses[i], speeds[i]);
        }

        int firstDeployDay = days[0];
        int count = 0;

        for (int day : days) {
            if (day <= firstDeployDay) {
                count++;
            } else {
                answer.add(count);
                firstDeployDay = day;
                count = 1;
            }
        }
        answer.add(count);

        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private int getDay(int progress, int speed) {
        return (int) Math.ceil((100.0 - progress) / speed);
    }
}