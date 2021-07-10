# Using custom Pair in the code

## Problem:
## Find k closest elements to x.

```
public class KClosestElements {
    // Creating max heap for storing a pair of difference between x and element as key and the element as a value.
    // We will sort according to the key and create a max heap. If the heap size is greater than k then we will pop the element
    // Time complexity O(nlogk)
    private void kClosestElements(int[] array, int x, int k) {
        PriorityQueue<Pair<Integer, Integer>> maxHeap = new PriorityQueue<Pair<Integer, Integer>>(Collections.reverseOrder());
        for (int i = 0; i < array.length; i++) {
            int key = Math.abs(array[i] - x);
            Pair<Integer, Integer> pair = new Pair<Integer, Integer>();
            pair.add(key, array[i]);
            maxHeap.offer(pair);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        // Print k closest elements to x
        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll().second());
        }
    }

    public static void main(String[] args) {
        KClosestElements kClosestElements = new KClosestElements();
        int[] array = {5, 6, 7, 8, 9};
        int x = 7;
        int k = 3;
        kClosestElements.kClosestElements(array, x, k);
    }
}
```