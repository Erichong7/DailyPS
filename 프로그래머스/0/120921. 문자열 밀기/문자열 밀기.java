class Solution {
    public int solution(String A, String B) {
        
        if(A.equals(B)) {
            return 0;
        }
        
        int answer = 0;
        char[] arr = A.toCharArray();
        for(int i = 0; i < A.length() - 1; i++) {
            answer++;
            char last = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
            
            if(String.valueOf(arr).equals(B)) {
                return answer;
            }
        }
        
        return -1;
    }
}