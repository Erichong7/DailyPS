class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = { 0, 0 };
        for(String key : keyinput) {
            switch (key) {
                case "up" -> answer[1] += isInBoard(answer[0], answer[1] + 1, board) ? 1 : 0;
                case "down" -> answer[1] += isInBoard(answer[0], answer[1] - 1, board) ? -1 : 0;
                case "right" -> answer[0] += isInBoard(answer[0] + 1, answer[1], board) ? 1 : 0;
                case "left" -> answer[0] += isInBoard(answer[0] - 1, answer[1], board) ? -1 : 0;
            }
        }
        return answer;
    }

    public boolean isInBoard(int x, int y, int[] board) {
        int availableX = board[0] / 2;
        int availableY = board[1] / 2;
        return x <= availableX && x >= -availableX && y <= availableY && y >= -availableY;
    }
}