class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        Time videoTime = new Time(video_len);
        Time posTime = new Time(pos);
        Time opStartTime = new Time(op_start);
        Time opEndTime = new Time(op_end);

        int totalSeconds = posTime.toTotalSeconds();

        // 4. 초기 위치도 오프닝 구간 체크
        if (isOpAt(opStartTime.toTotalSeconds(), totalSeconds, opEndTime.toTotalSeconds())) {
            totalSeconds = opEndTime.toTotalSeconds();
        }

        for (String command : commands) {
            if (command.equals("prev")) {
                totalSeconds = Math.max(0, totalSeconds - 10);
            } else {
                totalSeconds = Math.min(videoTime.toTotalSeconds(), totalSeconds + 10);
            }
            if (isOpAt(opStartTime.toTotalSeconds(), totalSeconds, opEndTime.toTotalSeconds())) {
                totalSeconds = opEndTime.toTotalSeconds();
            }
        }
        posTime.update(totalSeconds);
        return posTime.toString();
    }

    public boolean isOpAt(int opStart, int pos, int opEnd) {
        return (opStart <= pos) && (pos <= opEnd);
    }

    class Time {

        int minutes;
        int seconds;

        public Time(String time) {
            String[] parts = time.split(":");
            this.minutes = Integer.parseInt(parts[0]);
            this.seconds = Integer.parseInt(parts[1]);
        }

        int toTotalSeconds() {
            return minutes * 60 + seconds;
        }

        void update(int totalSeconds) {
            this.minutes = totalSeconds / 60;
            this.seconds = totalSeconds % 60;
        }

        @Override
        public String toString() {
            return String.format("%02d:%02d", minutes, seconds);
        }
    }
}