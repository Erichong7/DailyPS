import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        ArrayList<Number> arr = new ArrayList<>();
        for (int i : numlist) {
            arr.add(new Number(i, Math.abs(i - n)));
        }
        Collections.sort(arr);

        for(int i = 0; i < answer.length; i++) {
            answer[i] = arr.get(i).n;
        }
        
        return answer;
    }
}

class Number implements Comparable<Number> {

    int n;
    int diff;

    public Number(int n, int diff) {
        this.n = n;
        this.diff = diff;
    }

    @Override
    public int compareTo(Number that) {
        if(this.diff == that.diff) {
            return that.n - this.n;
        }
        return this.diff - that.diff;
    }
}