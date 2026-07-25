class Solution {
    public int solution(int n) {
        long result = 1;
        int i = 1;
        while (result <= n) {
            i++;
            result *= i;
        }
        return i - 1;
    }
}