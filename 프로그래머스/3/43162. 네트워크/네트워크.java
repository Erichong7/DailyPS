import java.util.LinkedList;
import java.util.Queue;

class Solution {

    Queue<int[]> queue = new LinkedList<>();
    int answer = 0;

    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[computers.length];
        for (int i = 0; i < computers.length; i++) {
            if (!visited[i]) {
                queue.add(computers[i]);
                visited[0] = true;
                bfs(computers, visited);
            }
        }
        
        return answer;
    }

    public void bfs(int[][] computers, boolean[] visited) {
        while (!queue.isEmpty()) {
            int[] computer = queue.poll();
            for (int i = 0; i < computer.length; i++) {
                if (!visited[i] && computer[i] == 1) {
                    queue.add(computers[i]);
                    visited[i] = true;
                }
            }
        }
        answer++;
    }
}