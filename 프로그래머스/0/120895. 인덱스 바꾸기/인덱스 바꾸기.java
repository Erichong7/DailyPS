class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] str = my_string.split("");
        swap(num1, num2, str);
        for(String s : str) {
            answer += s;
        }
        return answer;
    }

    public void swap(int a, int b, String[] arr) {
        String temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}