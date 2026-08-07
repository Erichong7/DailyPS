import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {

        Deque<Integer> queue = new LinkedList<>();

        queue.add(arr[0]);
        for (int n : arr) {
            if(queue.getLast() != n) {
                queue.add(n);
            }
        }

        return queue.stream().mapToInt(n -> n).toArray();
    }
}