import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public ArrayList<Integer> solution(int k, int[] score) {
        ArrayList<Integer> answer = new ArrayList<>();
        ArrayList<Integer> hall = new ArrayList<>();
        for (int s : score) {
            hall.add(s);
            hall.sort(Collections.reverseOrder());
            if(hall.size() < k) {
                answer.add(hall.getLast());
            } else {
                answer.add(hall.get(k - 1));
            }
        }
        return answer;
    }
}