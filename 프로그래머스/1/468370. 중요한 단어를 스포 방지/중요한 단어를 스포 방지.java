import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String message, int[][] spoiler_ranges) {
        int answer = 0;
        ArrayList<String> spoiler = new ArrayList<>();
        ArrayList<String> words = new ArrayList<>(List.of(message.split(" ")));
        ArrayList<String> notSpoiler = new ArrayList<>();

        // [추가] 어떤 스포 구간과도 안 겹치는(=평문 그대로 노출된) 단어를 notSpoiler에 채움
        int pos = 0;
        for (String word : words) {
            boolean covered = false;
            for (int[] range : spoiler_ranges) {
                if (pos <= range[1] && pos + word.length() - 1 >= range[0]) {
                    covered = true;
                    break;
                }
            }
            if (!covered) notSpoiler.add(word);
            pos += word.length() + 1;
        }

        for(int[] range : spoiler_ranges) { // 스포방지 단어 찾기
            int start = range[0];
            int end = range[1];
            int index = 0;
            for(String word : words) {
                if(index <= end && index + word.length() - 1 >= start) { // 겹침 체크
                    if(!spoiler.contains(word) && !notSpoiler.contains(word)) { // 중복 & 평문 노출 제외
                        answer++;
                        spoiler.add(word);
                    }
                }
                index += word.length() + 1;
            }
        }

        return answer;
    }
}