class Solution {
    
    private final int americanoPrice = 5_500;
    
    public int[] solution(int money) {
        int[] answer = {money / americanoPrice, money % americanoPrice};
        return answer;
    }
}