class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[(int) Math.ceil((double) my_str.length() / n)];
        int start = 0;
        int end = n;
        for(int i = 0; i < answer.length; i++) {
            if(end < my_str.length()) {
                answer[i] = my_str.substring(start, end);
                start = end;
                end += n;
            } else {
                answer[i] = my_str.substring(start);
            }

        }
        return answer;
    }
}