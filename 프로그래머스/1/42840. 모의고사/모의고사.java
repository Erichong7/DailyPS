import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] one = { 1, 2, 3, 4, 5 };
        int[] two = { 2, 1, 2, 3, 2, 4, 2, 5 };
        int[] three = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

        int oneScore = 0;
        int twoScore = 0;
        int threeScore = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == one[i % one.length]) {
                oneScore++;
            }
            if (answers[i] == two[i % two.length]) {
                twoScore++;
            }
            if (answers[i] == three[i % three.length]) {
                threeScore++;
            }
        }

        if (oneScore > twoScore && oneScore > threeScore) {
            answer.add(1);
        } else if (twoScore > threeScore && twoScore > oneScore) {
            answer.add(2);
        } else if (threeScore > oneScore && threeScore > twoScore) {
            answer.add(3);
        } else if (oneScore == twoScore && oneScore == threeScore) {
            answer.add(1);
            answer.add(2);
            answer.add(3);
        } else if (oneScore == twoScore) {
            answer.add(1);
            answer.add(2);
        } else if (twoScore == threeScore) {
            answer.add(2);
            answer.add(3);
        } else {
            answer.add(1);
            answer.add(3);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}