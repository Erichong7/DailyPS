class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goals) {
        String answer = "Yes";
        int index1 = 0;
        int index2 = 0;
        for(String goal : goals) {
            boolean match1 = index1 < cards1.length && cards1[index1].equals(goal);
            boolean match2 = index2 < cards2.length && cards2[index2].equals(goal);

            if (!match1 && !match2) {
                answer = "No";
                break;
            }
            if (match1) index1++;
            if (match2) index2++;
        }
        return answer;
    }
}