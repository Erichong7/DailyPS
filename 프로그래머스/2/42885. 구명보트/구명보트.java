import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        boolean[] isArrived = new boolean[people.length];
        Arrays.sort(people);

        int lt = 0;
        int rt = people.length - 1;
        while (lt <= rt) {
            if (lt != rt && people[lt] + people[rt] <= limit) {
                lt++;
            }
            rt--;
            answer++;
        }

        return answer;
    }
}