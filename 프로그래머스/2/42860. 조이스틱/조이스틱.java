class Solution {
    public int solution(String name) {
        char[] arr = name.toCharArray();
        int len = name.length();
        int upDown = 0;
        for (int i = 0; i < len; i++) {
            int c = arr[i] - 'A';
            upDown += Math.min(c, 26 -c);
        }

        int move = len - 1;
        for (int i = 0; i < len; i++) { // i는 유턴 지점 next는 유턴해서 도착할 위치
            int next = i + 1;
            while (next < len && name.charAt(next) == 'A') {
                next++;
            }
            move = Math.min(move, i * 2 + len - next); // 뒤로
            move = Math.min(move, (len - next) * 2 + i); // 앞으로
        }
        return upDown + move;
    }
}