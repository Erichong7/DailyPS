class Solution {
    public String solution(String number, int k) {
        int len = number.length();
        char[] stack = new char[len];
        int remain = k;

        int last = 0;
        for (int i = 0; i < len; i++) {
            char c = number.charAt(i);
            while (last > 0 && remain > 0 && stack[last - 1] < c) {
                last--;
                remain--;
            }
            stack[last++] = c;
        }
        return new String(stack, 0, len - k);
    }
}