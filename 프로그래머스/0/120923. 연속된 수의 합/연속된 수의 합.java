class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];

        int len = total / num + num / 2;
        int start = num % 2 == 0 ? total / num - num / 2 + 1 : total / num - num / 2;

        int index = 0;
        for (int i = start; i <= len; i++) {
            answer[index] = i;
            index++;
        }
        return answer;
    }
}