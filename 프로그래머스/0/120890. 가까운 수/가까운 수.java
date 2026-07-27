class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int minDiff = Integer.MAX_VALUE;
        for(int a : array) {
            int diff = Math.abs(a - n);
            if(diff == minDiff && answer > a) {
                answer = a;
            }
            if(diff < minDiff) {
               minDiff = diff;
               answer = a;
            }
        }
        return answer;
    }
}