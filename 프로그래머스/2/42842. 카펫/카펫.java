class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};

        for (int i = 1; i <= Math.sqrt(yellow); i++) {
            if (yellow % i == 0) {
                int[] yellowRec = { yellow / i, i };
                int[] brownRec = { yellowRec[0] + 2, yellowRec[1] + 2 };
                if ((brownRec[0] * brownRec[1]) - (yellowRec[0] * yellowRec[1]) == brown) {
                    return brownRec;
                }
            }
        }
        return answer;
    }
}