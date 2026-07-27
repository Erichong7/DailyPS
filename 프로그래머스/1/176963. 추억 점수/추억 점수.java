import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photos) {
        int[] answer = new int[photos.length];

        for(int i = 0; i < photos.length; i++) {
            ArrayList<String> people = new ArrayList<>(List.of(photos[i]));
            for(int j = 0; j < name.length; j++) {
                if (people.contains(name[j])) {
                    answer[i] += yearning[j];
                }
            }
        }

        return answer;
    }
}