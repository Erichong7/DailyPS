class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        int x = dot[0];
        int y = dot[1];
        if(x > 0) return answer = y > 0 ? 1 : 4;
        else return answer = y > 0 ? 2 : 3;
    }
}