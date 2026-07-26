class Solution {
    public int solution(int[][] signals) {
        int answer = -1;
        int max = 1;
        for (int[] signal : signals) {
            max *= (signal[0] + signal[1] + signal[2]);
        }
        int[][] check = new int[signals.length][max + 1];

        for (int i = 0; i < signals.length; i++) {
            int start = signals[i][0] + 1; // 노란불 시작 점
            int period = signals[i][0] + signals[i][1] + signals[i][2]; // 노란 불 주기
            for (int j = start; j <= max; j += period) {
                for(int k = j; k < j + signals[i][1]; k++) {
                    if(k < max + 1) {
                        check[i][k] = 1;
                    }
                }
            }
        }

        for(int i = 1; i <= max; i++) {
            if(isColumnAllSame(check, i)) {
                return i;
            }
        }

        return answer;
    }

    public boolean isColumnAllSame(int[][] arr, int col) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][col] != 1) {
                return false;
            }
        }
        return true;
    }
}