class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        my_string = my_string.toLowerCase();
        my_string.chars().sorted().forEach(c -> answer.append((char) c));
        return answer.toString();
    }
}