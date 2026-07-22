class Solution {
    public int[] solution(int[] num_list) {
        int evenCount = 0;
        for(int n : num_list) {
            if(n % 2 == 0) evenCount++;
        }
        return new int[] {evenCount, num_list.length - evenCount};
    }
}