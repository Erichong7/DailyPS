class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        boolean[] isSkip = new boolean[26];
        for(char c : skip.toCharArray()) {
            isSkip[c - 'a'] = true;
        }
        for(char c : s.toCharArray()) {
            int i = c - 'a';
            int count = 0;
            while(count < index) {
                i = (i + 1) % 26;
                if(!isSkip[i]) {
                    count++;
                }
            }
            answer.append((char) ('a' + i));
        }

        return answer.toString();
    }
}