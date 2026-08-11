import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        int n = citations.length;
        for (int i = 0; i < n; i++) {
            int h = n - i;              // 남은 논문 수를 h 후보로
            if (citations[i] >= h) {
                return h;                // 왼쪽에서부터 처음 만족하는 h가 최댓값
            }
        }
        return 0;
    }
}