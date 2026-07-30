class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int num : array) {
            String[] str = String.valueOf(num).split("");
            for(String s : str) {
                if(s.equals("7")) answer++;
            }
        }
        return answer;
    }
}