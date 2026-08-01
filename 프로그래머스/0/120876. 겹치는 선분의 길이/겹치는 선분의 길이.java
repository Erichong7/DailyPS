class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] count = new int[200 + 1];
        for(int[] line : lines) {
            for(int i = line[0]; i < line[1]; i++) {
                count[100 + i] += 1;
            }
        }
        
        for(int i : count) {
            if(i >= 2) answer++;
        }
        return answer;
    }
}