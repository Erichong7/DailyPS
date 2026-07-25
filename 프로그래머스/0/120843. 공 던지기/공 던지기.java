class Solution {
    public int solution(int[] numbers, int k) {
        int index = 0;
        int count = 1;
        while(true) {
            if(count == k) {
                return numbers[index];
            }
            index += 2;
            if(index >= numbers.length) {
                index -= numbers.length;
            }
            count++;
        }
    }
}