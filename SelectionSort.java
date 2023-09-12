import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        selection(arr, 0, arr.length, 0);
        System.out.println(Arrays.toString(arr));
    }
    public static void selection(int[] arr, int s, int e, int max){
        if(e == 0){
            return;
        }
        if(s < e) {
            if (arr[s] > arr[max]) {
                selection(arr, s + 1, e, s);
            } else {
                selection(arr, s + 1, e, max);
            }
        }
        else{
            int temp = arr[max];
            arr[max] = arr[e-1];
            arr[e-1] = temp;
        }
        selection(arr, 0, e-1, 0);
    }
}
