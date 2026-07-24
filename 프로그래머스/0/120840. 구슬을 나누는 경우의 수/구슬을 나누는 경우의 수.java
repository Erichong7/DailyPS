class Solution {
    public int solution(int balls, int share) {
        return combination(balls, share);
    }

    public int combination(int a, int b) {
        if(b == 0 || a == b) {
            return 1;
        }
        return combination(a - 1, b - 1) + combination(a - 1, b);
    }
}