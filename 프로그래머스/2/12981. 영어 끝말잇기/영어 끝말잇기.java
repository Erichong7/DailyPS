import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        Set<String> usedWords = new HashSet<>();
        usedWords.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            String prev = words[i - 1];
            String now = words[i];

            boolean isConnected = prev.charAt(prev.length() - 1) == now.charAt(0);
            boolean isDuplicate = usedWords.contains(now);

            if (!isConnected || isDuplicate) {
                int person = (i % n) + 1;
                int turn = (i / n) + 1;
                return new int[] {person, turn};
            }

            usedWords.add(now);
        }

        return new int[] {0, 0};
    }
}