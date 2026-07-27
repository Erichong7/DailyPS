import java.util.Arrays;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        char[] str = s.toCharArray();

        for (char c : str) {
            int count = 0;
            for (char value : str) {
                if (c == value) {
                    count++;
                }
            }
            if (count == 1) {
                answer.append(c);
            }
        }
        str = answer.toString().toCharArray();
        Arrays.sort(str);
        return String.valueOf(str);
    }
}