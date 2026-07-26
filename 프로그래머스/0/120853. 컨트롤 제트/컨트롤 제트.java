import java.util.Stack;

class Solution {
    public int solution(String s) {
        Stack<Integer> stack = new Stack<>();
        String[] arr = s.split(" ");
        for(String a : arr) {
            if(a.equals("Z")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(a));
            }
        }
        return stack.stream().mapToInt(n -> n).sum();
    }
}