import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int[] wire : wires) {
            map.computeIfAbsent(wire[0], key -> new ArrayList<>()).add(wire[1]);
            map.computeIfAbsent(wire[1], key -> new ArrayList<>()).add(wire[0]);
        }

        for (int[] wire : wires) {
            boolean[] visited = new boolean[n + 1];
            visited[wire[0]] = true;
            visited[wire[1]] = true;
            int count = dfs(wire[0], map, visited);
            int other = n - count;
            answer = Math.min(answer, Math.abs(count - other));
        }
        return answer;
    }

    public int dfs(int node, Map<Integer, ArrayList<Integer>> map, boolean[] visited) {
        int count = 1;
        for (int next : map.getOrDefault(node, new ArrayList<>())) {
            if(!visited[next]) {
                visited[next] = true;
                count += dfs(next, map, visited);
            }
        }
        return count;
    }
}