import java.util.PriorityQueue;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        PriorityQueue<Task> waitingQueue = new PriorityQueue<>();

        int ms = 0;
        int sum = 0;
        int endTime = -1;
        int processedCount = 0;
        Task onDisk = null;
        while (processedCount < jobs.length) { // 디스크 컨트롤러

            addTask(ms, jobs, waitingQueue);

            if (ms == endTime) { // 완료 체크
                sum += endTime - onDisk.start;
                onDisk = null;
                processedCount++;
            }
            if (onDisk == null && !waitingQueue.isEmpty()) { // 다음 작업 픽업
                onDisk = waitingQueue.poll();
                endTime = ms + onDisk.time;
            }
            ms++;
        }

        return sum / jobs.length;
    }

    public void addTask(int ms, int[][] jobs, PriorityQueue<Task> waitingQueue) {
        for (int i = 0; i < jobs.length; i++) {
            if (jobs[i][0] == ms) {
                waitingQueue.add(new Task(i, jobs[i][0], jobs[i][1]));
            }
        }
    }
}

class Task implements Comparable<Task> {

    int num;
    int start;
    int time;

    public Task(int num, int start, int time) {
        this.num = num;
        this.start = start;
        this.time = time;
    }

    @Override
    public int compareTo(Task that) {
        if (this.time != that.time) {
            return this.time - that.time;
        }
        if (this.start != that.start) {
            return this.start - that.start;
        }
        return this.num - that.num;
    }
}