class Solution {
    public int solution(int[][] sizes) {
        int widthMax = 0;
        int heightMax = 0;
        
        for (int[] size : sizes) {
            if (size[0] < size[1]) {
                swap(size, 0, 1);
            }
            widthMax = Math.max(widthMax, size[0]);
            heightMax = Math.max(heightMax, size[1]);
        }
        
        return widthMax * heightMax;
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}