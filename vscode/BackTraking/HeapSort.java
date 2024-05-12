package vscode.BackTraking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HeapSort {
    public static void main(String[] args) throws Exception {
        Heap heap = new Heap();
        heap.insert(6);
         heap.insert(2);
        heap.insert(36);
        heap.insert(0);
        heap.insert(8);
        heap.insert(5);
      System.out.println(Arrays.toString(heap.heapSort()));
    }
}
class Heap{
   public List<Integer> list = new ArrayList<>();
    private int parent(int idx){
        return (idx-1)/2 ;
    }
    private int left(int idx){
        return (idx*2) +1;
    }
    private int right(int idx){
        return (idx*2) +2;
    }
    private void swap(int f,int s){
        int tem = list.get(f);
        list.set(f, list.get(s));
        list.set(s, tem);
    }
    public void insert(int value){
        list.add(value);
       int idx = list.size()-1;
        upHeap(idx);
    }
    public int remove() throws Exception{
        if (list.isEmpty()) {
           throw new Exception("You try to Remove Item From an Empty list");
        }
        int value = list.get(0);
        int idx =list.size()-1;
        int last = list.remove(idx);
        if (!list.isEmpty()) {
            list.set(0, last);
            downHeap(0);
        }
            
        return value;
    }
    private void downHeap(int idx) {
     int min = idx;
     
     int left = left(idx);
     int right = right(idx);
     
if(left < list.size() && list.get(min)>(list.get(left))) {
      min = left;
    }

    if(right < list.size() && list.get(min)>(list.get(right))) {
      min = right;
    }
     if (min!=idx) {
        swap(min, idx);
        downHeap(min);
     }
    }
    private void upHeap(int idx) {
        if (idx==0) {
            return;
        }
        int p = parent(idx);
        if (list.get(p)>list.get(idx)) {
            swap(idx, p);
            upHeap(p);
        }
    }
    public int [] heapSort() throws Exception{
        int[] arr= new int[list.size()];
        int i=0;
          while (!list.isEmpty()) {
            arr[i++]= remove();
          }
          return arr;
    }
}
