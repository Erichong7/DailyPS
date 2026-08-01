import java.util.Arrays;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        Score[] scores = new Score[score.length];

        for(int i = 0; i < score.length; i++) {
            scores[i] = new Score(i, score[i][0] + score[i][1]);
        }
        Arrays.sort(scores);

        answer[scores[0].id] = 1;
        for (int i = 1; i < scores.length; i++) {
            if (scores[i].sum == scores[i - 1].sum) {
                answer[scores[i].id] = answer[scores[i - 1].id]; // 동점이면 이전과 같은 등수
            } else {
                answer[scores[i].id] = i + 1; // 동점 여부와 무관하게 "앞선 인원 수 + 1"로 계산
            }
        }

        return answer;
    }
}

class Score implements Comparable<Score> {
    int id;
    int sum;
    
    public Score(int id, int sum) {
        this.id = id;
        this.sum = sum;
    }
    
    @Override
    public int compareTo(Score that) {
        return that.sum - this.sum;
    }
}