import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        int[] cnt = new int[n + 2];
        Arrays.fill(cnt, 1);
        for (int l : lost) {
            cnt[l]--;
        }
        for (int r : reserve) {
            cnt[r]++;
        }
        for (int i = 1; i < cnt.length; i++) {
            if (cnt[i] != 0) {
                continue;
            }
            if (cnt[i - 1] == 2) {
                cnt[i - 1]--;
                cnt[i]++;
            } else if (cnt[i + 1] == 2) {
                cnt[i + 1]++;
                cnt[i]++;
            }
        }
        for (int c : cnt) {
            if (c == 0) {
                answer--;
            }
        }
        return answer;
    }
}