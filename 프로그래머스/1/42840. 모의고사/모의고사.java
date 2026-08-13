import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] one = { 1, 2, 3, 4, 5 };
        int[] two = { 2, 1, 2, 3, 2, 4, 2, 5 };
        int[] three = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

        int[] hit = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == one[i % one.length]) {
                hit[0]++;
            }
            if (answers[i] == two[i % two.length]) {
                hit[1]++;
            }
            if (answers[i] == three[i % three.length]) {
                hit[2]++;
            }
        }
        
        int max = Math.max(hit[0], Math.max(hit[1], hit[2]));
        for (int i = 0; i < hit.length; i++) {
            if (hit[i] == max) {
                answer.add(i + 1);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}