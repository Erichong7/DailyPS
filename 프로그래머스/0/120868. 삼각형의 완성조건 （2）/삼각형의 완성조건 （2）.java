import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int a = Math.max(sides[0], sides[1]);
        int b = Math.min(sides[0], sides[1]);
        int count = 0;
        // a가 가장 긴 변일 때
        for(int c = 1; c <= a; c++) {
            if(c + b > a) {
                count++;
            }
        }
        // c가 가장 긴 변일 때
        for(int c = a + 1; c < a + b; c++) {
            count++;
        }
        return count;
    }
}