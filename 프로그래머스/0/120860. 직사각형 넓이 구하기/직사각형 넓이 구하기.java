class Solution {
    public int solution(int[][] dots) {
        int width = 0;
        int height = 0;
        for(int i = 1; i < dots.length; i++) {
            if(dots[0][0] == dots[i][0]) {
                width = Math.max(dots[0][1], dots[i][1]) - Math.min(dots[0][1], dots[i][1]);
            }
            if(dots[0][1] == dots[i][1]) {
                height = Math.max(dots[0][0], dots[i][0]) - Math.min(dots[0][0], dots[i][0]);
            }
        }
        return width * height;
    }
}