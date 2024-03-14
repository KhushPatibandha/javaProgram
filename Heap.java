import java.util.ArrayList;

public class Heap<T extends Comparable<T>> {

    private ArrayList<T> list = new ArrayList<>();

    private void swap(int first, int second) {
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    private int parent(int idx) {
        return (idx - 1) / 2;
    }

    private int left(int idx) {
        return (2 * idx) + 1;
    }

    private int right(int idx) {
        return (2 * idx) + 2;
    }

    private void upHeap(int idx) {
        if(idx == 0) {
            return;
        }
        int parent = parent(idx);
        if(list.get(idx).compareTo(list.get(parent)) < 0) {
            swap(idx, parent);
            upHeap(parent);
        }
    }

    private void downHeap(int idx) {
        int min = idx;
        int left = left(idx);
        int right = right(idx);

        if(left < list.size() && list.get(min).compareTo(list.get(left)) > 0) {
            min = left;
        }

        if(right < list.size() && list.get(min).compareTo(list.get(right)) > 0) {
            min = right;
        }

        if(min != idx) {
            swap(min, idx);
            downHeap(min);
        }
    }

    public void insert(T value) {
        list.add(value);
        upHeap(list.size() - 1);
    }

    public T remove() throws Exception {
        if(list.isEmpty()) {
            throw new Exception("Can't remove from an empty heap");
        }
        T temp = list.get(0);
        T last = list.remove(list.size() - 1);
        if(!list.isEmpty()) {
            list.set(0, last);
            downHeap(0);
        }
        return temp;
    }

    public ArrayList<T> heapSort() throws Exception {
        ArrayList<T> data = new ArrayList<>();

        while(!list.isEmpty()) {
            data.add(this.remove());
        }
        return data;
    }


    public static void main(String[] args) throws Exception {
        Heap<Integer> heap = new Heap<>();

        heap.insert(34);
        heap.insert(45);
        heap.insert(22);
        heap.insert(89);
        heap.insert(76);

        ArrayList list = heap.heapSort();
        System.out.println(list);
    }
}
