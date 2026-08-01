class Solution {
    public int solution(int[][] dots) {
        int dx1 = dots[0][0] - dots[1][0];
        int dy1 = dots[0][1] - dots[1][1];
        int dx2 = dots[2][0] - dots[3][0];
        int dy2 = dots[2][1] - dots[3][1];

        int dx3 = dots[0][0] - dots[2][0];
        int dy3 = dots[0][1] - dots[2][1];
        int dx4 = dots[1][0] - dots[3][0];
        int dy4 = dots[1][1] - dots[3][1];

        int dx5 = dots[0][0] - dots[3][0];
        int dy5 = dots[0][1] - dots[3][1];
        int dx6 = dots[1][0] - dots[2][0];
        int dy6 = dots[1][1] - dots[2][1];

        if ((dx1 * dy2 == dx2 * dy1) ||
            (dx3 * dy4 == dx4 * dy3) ||
            (dx5 * dy6 == dx6 * dy5)) {
            return 1;
        }
        return 0;
    }
}