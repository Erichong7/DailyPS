class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int answerNumer = numer1 * denom2 + numer2 * denom1;
        int answerDenom = denom1 * denom2;
        int gcb = gcb(answerNumer, answerDenom);
        int[] answer = {answerNumer / gcb, answerDenom / gcb};
        return answer;
    }
    
    public int gcb(int a, int b) {
        if(b == 0) {
            return a;
        }
        return gcb(b, a % b);
    }
}