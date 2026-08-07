import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        boolean[] isCompleted = new boolean[progresses.length];

        for (int i = 0; i < progresses.length; i++) {
            
            if(isCompleted[i]) continue; // 완료된 거면 다음 걸로
            
            isCompleted[i] = true;
            int day = getDay(progresses[i], speeds[i]);
            int unit = 0;
            
            for (int j = i; j < progresses.length; j++) {
                if(day >= getDay(progresses[j], speeds[j])) {
                    isCompleted[j] = true;
                    unit++;
                } else {
                    break;
                }
            }
            answer.add(unit);
            
        }
        return answer.stream()
                .mapToInt(n -> n)
                .toArray();
    }

    public int getDay(int progress, int speed) {
        return (int) Math.ceil((100.0 - progress) / speed);
    }
}