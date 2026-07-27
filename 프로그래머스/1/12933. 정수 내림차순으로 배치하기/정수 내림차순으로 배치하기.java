import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = String.valueOf(n);
        Integer[] numbers = new Integer[str.length()];
        int index = 0;
        for(String s : str.split("")) {
            numbers[index] = Integer.parseInt(s);
            index++;
        }
        
        Arrays.sort(numbers, Collections.reverseOrder());
        for(int num : numbers) {
            answer *= 10;
            answer += num;
        }

        return answer;
    }
}