class Solution {
    public int solution(int[] array) {
        sort(array);
        return array[(array.length - 1) / 2];
    }
    
    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }
    
    public void quickSort(int[] array, int start, int end) {
        int part2 = partition(array, start, end);
        if(start < part2 - 1) {
            quickSort(array, start, part2 - 1);
        }
        if(end > part2) {
            quickSort(array, part2, end);
        }
    }
    
    public int partition(int[] array, int start, int end) {
        int pivot = array[(start + end) / 2];
        while(start <= end) {
            while(pivot > array[start]) start++;
            while(pivot < array[end]) end--;
            if(start <= end) {
                swap(array, start, end);
                start++;
                end--;
            }
        }
        return start;
    }
    
    public void swap(int[] array, int start, int end) {
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
    }
}