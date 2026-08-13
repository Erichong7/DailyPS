class Solution {
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        return dfs(0, k, dungeons, visited);
    }

    public int dfs(int n, int k, int[][] dungeons, boolean[] visited) {
        int answer = 0;
        if (n == dungeons.length) {
            return 0;
        }
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && k >= dungeons[i][0]) {
                visited[i] = true;
                answer = Math.max(1 + dfs(n + 1, k - dungeons[i][1], dungeons, visited), answer);
                visited[i] = false;
            }
        }
        return answer;
    }
}