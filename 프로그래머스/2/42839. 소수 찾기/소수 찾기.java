import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(String numbers) {
        char[] number = numbers.toCharArray();
        Set<Integer> primeSet = new HashSet<>();
        DFS(0, number, new StringBuilder(), new boolean[number.length], primeSet);
        return primeSet.size();
    }

    public void DFS(int N, char[] number, StringBuilder num, boolean[] used, Set<Integer> primeSet) {
        if (N == number.length) {
            return;
        }
        for (int i = 0; i < number.length; i++) {
            if (!used[i]) {
                num.append(number[i]);
                int value = Integer.parseInt(num.toString());
                if (isPrime(value)) {
                    primeSet.add(value);
                }
                used[i] = true;
                DFS(N + 1, number, num, used, primeSet);
                num.setLength(N);
                used[i] = false;
            }
        }
    }

    public boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}