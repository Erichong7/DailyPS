import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        return bfs(maps, n, m);
    }

    public int bfs(int[][] maps, int n, int m) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];
        int[] dx = { 1, -1, 0, 0 };
        int[] dy = { 0, 0, 1, -1 };

        visited[0][0] = true;
        queue.add(new int[]{ 0, 0, 1 });

        while (!queue.isEmpty()) {
            int[] pos = queue.poll();
            if (pos[0] == m - 1 && pos[1] == n - 1) {
                return pos[2];
            }
            for (int i = 0; i < 4; i++) {
                int x = pos[0] + dx[i];
                int y = pos[1] + dy[i];
                if (x >= 0 && x < m && y >= 0 && y < n && !visited[y][x] && maps[y][x] == 1) {
                    queue.offer(new int[]{ x, y, pos[2] + 1 });
                    visited[y][x] = true;
                }
            }
        }

        return -1;
    }
}