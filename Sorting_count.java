import java.util.*;

public class Sorting_count {

    public static void countSort(int[] arr) {
        if(arr == null || arr.length <= 1) {
            return;
        }
        int largest = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }

        int[] freqArr = new int[largest + 1];
        for(int i = 0; i < arr.length; i++) {
            freqArr[arr[i]]++;
        }

        int idx = 0;
        for(int i = 0; i < freqArr.length; i++) {
            while(freqArr[i] > 0) {
                arr[idx] = i;
                idx++;
                freqArr[i]--;
            }
        }
    }

    public static void countSortWithHash(int[] arr) {
        if(arr == null || arr.length <= 1) {
            return;
        }
        int largest = Arrays.stream(arr).max().getAsInt();
        int smallest = Arrays.stream(arr).min().getAsInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int idx = 0;
        for(int i = smallest; i < largest; i++) {
            int count = map.getOrDefault(i, 0);
            for(int j = 0; j < count; j++) {
                arr[idx] = i;
                idx++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 10, 9, 2, 4, 9, 7};
        // countSort(arr);
        countSortWithHash(arr);
        System.out.println(Arrays.toString(arr));
    }

}