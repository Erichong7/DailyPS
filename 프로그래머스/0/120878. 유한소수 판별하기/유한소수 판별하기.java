class Solution {
    public int solution(int a, int b) {
        // 기약 분수 만들기
        for(int i = 2; i <= a; i++) {
            if(a % i == 0 && b % i == 0) {
                a /= i;
                b /= i;
            }
        }

        // 분모의 소인수가 2와 5만 존재 하는지 확인
        while(b % 2 == 0) {
            b /= 2;
        }
        while (b % 5 == 0) {
            b /= 5;
        }
        return b == 1 ? 1 : 2;
    }
}