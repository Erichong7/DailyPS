class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int paintedIndex = section[0] + m - 1; // 몇번까지 페인트칠이 됐는지
        for(int i = 1; i < section.length; i++) {
            if(section[i] > paintedIndex) {
                paintedIndex = section[i] + m - 1;
                answer++;
            }
        }
        return answer;
    }
}