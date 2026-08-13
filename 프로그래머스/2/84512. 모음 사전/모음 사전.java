class Solution {

    int answer = 0;
    int count = 0;
    String target;
    String[] words = { "A", "E", "I", "O", "U" };

    public int solution(String word) {
        target = word;
        dfs(0, "");
        return answer;
    }

    public void dfs(int n, String word) {
        if (n == 5) {
            return;
        }

        for (int i = 0; i < 5; i++) {
            count++;
            String str = word + words[i];
            if (str.equals(target)) {
                answer = count;
            }
            dfs(n + 1, word + words[i]);
        }
    }
}