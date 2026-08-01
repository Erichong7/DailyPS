class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for (String s : my_string.split("[^0-9]+")) {
            if (!s.isEmpty()) {
                answer += Integer.parseInt(s);
            }
        }
        return answer;
    }
}