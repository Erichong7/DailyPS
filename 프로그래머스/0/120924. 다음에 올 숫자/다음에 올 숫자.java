class Solution {
    public int solution(int[] common) {
        int answer = 0;

        // 등차 수열 true, 등비 수열 false;
        boolean flag = common[1] - common[0] == common[2] - common[1];

        if(flag) {
            answer = common[0] + ((common.length) * (common[1] - common[0]));
        } else {
            answer = (int) (common[0] * Math.pow(common[1] / common[0], common.length));
        }
        
        return answer;
    }
}