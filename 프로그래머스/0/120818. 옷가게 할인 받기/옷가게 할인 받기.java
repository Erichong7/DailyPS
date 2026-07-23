class Solution {
    public int solution(int price) {
        double discountPercent = discount(price);
        return (int) (price - price * discountPercent);
    }

    public double discount(int price) {
        if(price >= 500_000) {
            return 20.0 / 100;
        }
        if(price >= 300_000) {
            return 10.0 / 100;
        }
        if(price >= 100_000) {
            return 5.0 / 100;
        }
        return 0;
    }
}