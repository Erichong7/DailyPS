class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int[][] poses = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        for(int[] p : poses) {
            int y = h + p[0];
            int x = w + p[1];
            if(inBoard(y, x, board) && board[y][x].equals(board[h][w])) {
                answer++;
            }
        }

        return answer;
    }

    public boolean inBoard(int h, int w, String[][] board) {
        int maxH = board.length - 1;
        int maxW = board[0].length - 1;
        return h <= maxW && h >= 0 && w <= maxH && w >= 0;
    }
}