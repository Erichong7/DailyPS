class Solution {
    public int solution(int n) {
        return n / gcb(n, 6);
    }
    
    public int gcb(int a, int b) {
        if(b == 0) {
            return a;
        }
        return gcb(b, a % b);
    }
}