class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        for(int i = 0; i < schedules.length; i++) {
            boolean flag = true;
            int time = schedules[i];
            int minute = time % 100;
            int hour = time / 100;
            if(minute >= 50) {
                minute = (minute + 10) % 60;
                hour += 1;
                time = hour * 100 + minute;
            } else {
                time += 10;
            }
            for(int j = 0; j < 7; j++) {
                int day= (startday + j) % 7;
                if(day == 6 || day == 0) { // 주말
                    continue;
                }
                if (time < timelogs[i][j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                answer++;
            }
        }
        return answer;
    }
}