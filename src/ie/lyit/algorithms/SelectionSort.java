package ie.lyit.algorithms;

/**
 * Author James Fallon
 * -- Selection sort --
 */

public class SelectionSort {
    
    private long startTime;
    private long finishTime;
    private int swaps;
    private int comparsions;
    
    public void selectionSort(int[] array){	
	startTime = System.nanoTime();
        swaps =0;
        comparsions =0;
	for(int i=0;i<array.length-1;i++){
	int min = i;
            for(int j=i+1;j<array.length;j++){
            comparsions++;  
            if(array[j] < array[min]){
            min  = j;
		}
            }
            // Swap values
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
            swaps++;
	}
	finishTime = (System.nanoTime()- startTime);
	}
    // Getter's
    public long getFinishTime() {
        return finishTime;
    }

    public int getSwaps() {
        return swaps;
    }

    public int getComparsions() {
        return comparsions;
    }
    
}
