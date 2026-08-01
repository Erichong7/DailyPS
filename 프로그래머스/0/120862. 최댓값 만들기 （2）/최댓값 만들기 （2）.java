class Solution {
    public int solution(int[] numbers) {
        int answer;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i : numbers) {
            if (i > max1) {
                max2 = max1;
                max1 = i;
            } else if (i > max2) {
                max2 = i;
            }
        }
        answer = max1 * max2;
        max1 = Integer.MAX_VALUE;
        max2 = Integer.MAX_VALUE;
        for(int i : numbers) {
            if (i < max1) {
                max2 = max1;
                max1 = i;
            } else if (i < max2) {
                max2 = i;
            }
        }
        return Math.max(answer, max1 * max2);
    }
}