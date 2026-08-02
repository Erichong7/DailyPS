class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = { "aya", "ye", "woo", "ma" };
        for (String bab : babbling) {
            int len = bab.length();
            for(String word : words) {
                if(bab.equals(word)) {
                    answer++;
                } else if(bab.contains(word)) {
                    len -= word.length();
                }
            }
            if(len == 0) {
                answer++;
            }
        }

        return answer;
    }
}