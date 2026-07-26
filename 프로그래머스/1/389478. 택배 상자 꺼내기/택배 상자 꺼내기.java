class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        int curFloor = (num - 1) / w + 1;
        int upperBox = num;
        while(upperBox <= n) {
            upperBox = num + (w * curFloor - num) * 2 + 1;
            curFloor++;
            num = upperBox;
            answer++;
        }
        return answer;
    }
}