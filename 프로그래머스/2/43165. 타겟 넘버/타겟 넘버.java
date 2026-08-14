class Solution {
    
    int answer = 0;
    
    public int solution(int[] numbers, int target) {
        boolean[] visited = new boolean[numbers.length];
        dfs(0, 0, target, numbers, visited);
        return answer;
    }
    
    public void dfs(int N, int num, int target, int[] numbers, boolean[] visited) {
        if (N == numbers.length) {
            if (num == target) {
                answer++;
            }
            return;
        }
        if (visited[N]) {
            return;
        }
        visited[N] = true;
        dfs(N + 1, num + numbers[N], target, numbers, visited);
        dfs(N + 1, num - numbers[N], target, numbers, visited);
        visited[N] = false;
    }
}