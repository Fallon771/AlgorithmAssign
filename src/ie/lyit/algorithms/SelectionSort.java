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
    
    public int[] selectionSort(int[] array){	
	startTime = System.currentTimeMillis();
	for(int i=0;i<array.length;i++){
	int min = i;
            for(int j=i+1;j<array.length;j++){
            if(array[j] < array[min]){
            min  = j;
		}
            }
            // Swap values
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;		
	}
	finishTime = (System.currentTimeMillis()- startTime);
        return array;
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
