class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[] dx = { 0, 1, 1, 1, 0, -1, -1, -1 };
        int[] dy = { 1, 1, 0, -1, -1 ,-1, 0, 1 };
        int[][] matrix = new int[board.length][board[0].length];

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] == 1) {
                    matrix[i][j] = 1;
                    for(int k = 0; k < dx.length; k++) {
                        int x = j + dx[k];
                        int y = i + dy[k];
                        if(x >= 0 && x < board[0].length && y >= 0 && y < board.length && matrix[y][x] != 1) {
                            matrix[y][x] = 1;
                        }
                    }
                }
            }
        }

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    answer++;
                }
            }
        }

        return answer;
    }
}