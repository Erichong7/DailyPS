class Solution {
    
    int answer = 0;
    
    public int solution(int[] numbers, int target) {
        dfs(0, 0, target, numbers);
        return answer;
    }
    
    public void dfs(int N, int num, int target, int[] numbers) {
        if (N == numbers.length) {
            if (num == target) {
                answer++;
            }
            return;
        }
        dfs(N + 1, num + numbers[N], target, numbers);
        dfs(N + 1, num - numbers[N], target, numbers);
    }
}