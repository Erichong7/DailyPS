import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(String begin, String target, String[] words) {
        if (!Arrays.asList(words).contains(target)) return 0;

        Queue<String> queue = new LinkedList<>();
        Queue<Integer> depths = new LinkedList<>();
        boolean[] visited = new boolean[words.length];

        queue.add(begin);
        depths.add(0);
        while (!queue.isEmpty() && !depths.isEmpty()) {
            String one = queue.poll();
            int depth = depths.poll();

            if (one.equals(target)) {
                return depth;
            }

            for (int i = 0; i < words.length; i++) {
                if (!visited[i] && isOneAlphaDiffered(one, words[i])) {
                    visited[i] = true;
                    queue.add(words[i]);
                    depths.add(depth + 1);
                }
            }
        }
        return 0;
    }

    private boolean isOneAlphaDiffered(String one, String word) {
        int count = 0;
        for (int i = 0; i < one.length(); i++) {
            if (one.charAt(i) != word.charAt(i)) {
                count++;
            }
        }
        return count == 1;
    }
}