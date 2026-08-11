import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();
        String[] strNumbers = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strNumbers[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(strNumbers, (a, b) -> (b + a).compareTo(a + b));

        for (String s : strNumbers) {
            answer.append(s);
        }
        
        if (answer.charAt(0) == '0') {
            return "0";
        }

        return answer.toString();
    }
}