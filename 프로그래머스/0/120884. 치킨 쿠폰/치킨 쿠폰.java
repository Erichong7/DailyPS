class Solution {
    public int solution(int chicken) {
        int answer = 0;
        while (chicken >= 10) {
            // 서비스 치킨
            int used = chicken / 10;
            // 남은 쿠폰
            int rest = chicken % 10;
            
            answer += used;
            chicken /= 10;
            chicken += rest;
        }
        return answer;
    }
}