import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

    public final Map<String, Integer> map = new HashMap<>();

    public int[] solution(String[] genres, int[] plays) {

        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }

        int index = 0;
        while (!map.isEmpty()) {
            String most = getMostListenedGenre();

            // 장르의 1, 2 순위 곡 배열에 넣기
            int one = 0;
            int two = 0;
            int oneIndex = -1;
            int twoIndex = -1;
            for (int i = 0; i < genres.length; i++) {
                if (genres[i].equals(most)) {
                    if (plays[i] > one) {
                        twoIndex = oneIndex;
                        two = one;
                        oneIndex = i;
                        one = plays[i];
                    } else if (plays[i] > two) {
                        twoIndex = i;
                        two = plays[i];
                    }
                }
            }

            answer.add(oneIndex);
            if(twoIndex != -1) {
                answer.add(twoIndex);
            }
        }

        return answer.stream()
                .mapToInt(n -> n)
                .toArray();
    }

    public String getMostListenedGenre() {
        // 가장 많이 들은 장르 구하기
        String most = "";
        int max = 0;
        for (String key : map.keySet()) {
            if(map.get(key) > max) {
                max = map.get(key);
                most = key;
            }
        }
        map.remove(most);
        return most;
    }
}
