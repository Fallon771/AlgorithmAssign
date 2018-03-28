package ie.lyit.algorithms;

/**
 * Author James Fallon
 */
public class InsertionSort {
    
    private int[] array;
    private long startTime;
    private long finishTime;
    private long swaps;
    private int comparsions;
    
    public void insertionSort(int[] data){
        startTime = System.nanoTime();
    
        for(int i = 1;i < data.length;i++){
        int next = data[i];
        int j = i;
        comparsions++;
        while(j > 0 && data[j-1] > next){
            data[j] = data[j-1];
            j--;
            swaps++;
            }
            data[j] = next;
        }
        finishTime = System.nanoTime() - startTime;
        array = data.clone();
    }
    // Getter's
    public long getFinishTime() {
        return finishTime;
    }
    public long getSwaps() {
        return swaps;
    }
    public int getComparsions() {
        return comparsions;
    }
    public int[] getArray(){
        return array;
    }
    
}
