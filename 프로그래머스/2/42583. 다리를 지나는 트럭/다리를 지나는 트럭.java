import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Deque<Truck> bridge = new ArrayDeque<>();
        Deque<Truck> wait = new ArrayDeque<>();

        for (int w : truck_weights) {
            wait.add(new Truck(w, 0));
        }

        int completedTruck = 0;
        while (completedTruck < truck_weights.length) {
            if (bridge.isEmpty()) {
                bridge.add(wait.poll());
            }
            completedTruck += refreshBridge(bridge, bridge_length);
            answer++;
            if (isAccessible(wait, bridge, bridge_length, weight)) {
                Truck next = wait.poll();
                next.position++;
                bridge.add(next);
            }
        }

        return answer;
    }

    public int refreshBridge(Deque<Truck> bridge, int bridge_length) {
        int completedTruck = 0;
        for (Truck t : bridge) {
            t.position++;
        }
        Truck front = bridge.peek();
        if (front != null && front.position > bridge_length) {
            bridge.poll();
            completedTruck++;
        }
        return completedTruck;
    }

    public boolean isAccessible(Deque<Truck> wait, Deque<Truck> bridge, int bridge_length, int weight) {
        if (wait.isEmpty()) {
            return false;
        }
        if (bridge.isEmpty()) {
            return true;
        }
        if (bridge.size() >= bridge_length) {
            return false;
        }
        Truck next = wait.peek();
        int totalWeight = getWeightOnBridge(bridge) + next.weight;
        return totalWeight <= weight;
    }

    public int getWeightOnBridge(Deque<Truck> bridge) {
        return bridge.stream().mapToInt(t -> t.weight).sum();
    }
}

class Truck {

    int weight;
    int position;

    public Truck(int weight, int position) {
        this.weight = weight;
        this.position = position;
    }
}