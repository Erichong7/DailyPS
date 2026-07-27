class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goals) {
        String answer = "Yes";
        int index1 = 0;
        int index2 = 0;
        for(String goal : goals) {
            if (index1 < cards1.length && cards1[index1].equals(goal)) {
                index1++;
            } else if (index2 < cards2.length && cards2[index2].equals(goal) ) {
                index2++;
            } else {
                answer = "No";
            }
            
        }
        return answer;
    }
}