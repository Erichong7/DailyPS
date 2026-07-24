class Solution {
    public String solution(int age) {
        StringBuilder answer = new StringBuilder();
        char[] arr = Integer.toString(age).toCharArray();
        for(char c : arr) {
            answer.append((char) (c - '0' + 'a'));
        }
        return answer.toString();
    }
}