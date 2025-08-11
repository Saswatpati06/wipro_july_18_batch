package Java_labs_31_07;

import java.util.Arrays;
class SortThread extends Thread {
    private int[] arr;
    public SortThread(int[] arr) { this.arr = arr; }
    public void run() { Arrays.sort(arr); }
    public int[] getSortedArray() { return arr; }
}
public class MultiThreadSort {
    public static void main(String[] args) throws InterruptedException {
        int[] arr = {5, 6, 1, 2, 7, 3, 8, 4};
        int mid = arr.length/2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        SortThread t1 = new SortThread(left);
        SortThread t2 = new SortThread(right);
        t1.start(); t2.start();
        t1.join(); t2.join();
        int[] sorted = merge(t1.getSortedArray(), t2.getSortedArray());
        System.out.println(Arrays.toString(sorted));
    }
    private static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i=0, j=0, k=0;
        while (i < a.length && j < b.length)
            result[k++] = a[i] < b[j] ? a[i++] : b[j++];
        while (i < a.length) result[k++] = a[i++];
        while (j < b.length) result[k++] = b[j++];
        return result;
    }
}

