class Solution {
    public int[] solution(int[] numbers, String direction) {
        if(direction.equals("right")) {
            int last = numbers[numbers.length - 1];
            int next = numbers[0];
            for(int i = 0; i < numbers.length - 1; i++) {
                int temp = numbers[i + 1];
                numbers[i + 1] = next;
                next = temp;
            }
            numbers[0] = last;
            return numbers;
        }

        int first = numbers[0];
        int prev = numbers[numbers.length - 1];
        for(int i = numbers.length - 1; i > 0; i--) {
            int temp = numbers[i - 1];
            numbers[i - 1] = prev;
            prev = temp;
        }
        numbers[numbers.length - 1] = first;
        return numbers;
    }
}