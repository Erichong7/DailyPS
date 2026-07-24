import java.util.*;

class Solution {

    static class Node {
        int key, x, y;
        Node left, right;
        Node(int key, int x, int y) {
            this.key = key; this.x = x; this.y = y;
        }
    }

    static List<Node> xSorted; // x 오름차순 정렬된 노드 리스트 (인덱스 = 구간 범위)

    public int[][] solution(int[][] nodeinfo) {
        int n = nodeinfo.length;
        List<Node> nodes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nodes.add(new Node(i + 1, nodeinfo[i][0], nodeinfo[i][1]));
        }

        // x 오름차순 정렬 -> 서브트리 구간을 나누는 기준
        xSorted = new ArrayList<>(nodes);
        xSorted.sort((a, b) -> a.x - b.x);

        Node root = build(0, n - 1);

        List<Integer> preorder = new ArrayList<>();
        List<Integer> postorder = new ArrayList<>();
        preorder(root, preorder);
        postorder(root, postorder);

        int[][] answer = new int[2][n];
        for (int i = 0; i < n; i++) {
            answer[0][i] = preorder.get(i);
            answer[1][i] = postorder.get(i);
        }
        return answer;
    }

    // [s, e] 구간 안에서 y값이 가장 큰 노드를 이 구간의 루트로 삼고,
    // 그 인덱스를 기준으로 왼쪽/오른쪽 구간으로 나눠 재귀적으로 트리를 구성한다.
    private Node build(int s, int e) {
        if (s > e) return null;

        int maxY = -1;
        int rootIndex = s;
        for (int i = s; i <= e; i++) {
            if (xSorted.get(i).y > maxY) {
                maxY = xSorted.get(i).y;
                rootIndex = i;
            }
        }

        Node root = xSorted.get(rootIndex);
        root.left = build(s, rootIndex - 1);
        root.right = build(rootIndex + 1, e);
        return root;
    }

    private void preorder(Node node, List<Integer> result) {
        if (node == null) return;
        result.add(node.key);
        preorder(node.left, result);
        preorder(node.right, result);
    }

    private void postorder(Node node, List<Integer> result) {
        if (node == null) return;
        postorder(node.left, result);
        postorder(node.right, result);
        result.add(node.key);
    }
}