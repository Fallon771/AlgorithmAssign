package ie.lyit.algorithms;

/**
 * Author James Fallon
 */
public class EnhancedBubble {
    
    private long swaps;
    private int comparsions;
    private long startTime;
    private long finishTime;
    private boolean arraySorted; 
    int[] array;
    
    public void bubbleSortTweak(int data[]){
			
	arraySorted = false;
        comparsions = 0;
        swaps = 0;
	startTime = System.nanoTime();
        // Loop until we reach end of array or its sorted
	for(int i =0;i < data.length && !arraySorted;i++){	
	arraySorted = true;
            for(int j=0;j<data.length-i-1;j++){
                comparsions++;
                // Swap intergers 
		if(data[j] > data[j+1]){			
		int temp = data[j+1];
		data[j+1] = data[j];
		data[j] = temp;
                swaps++;
		arraySorted = false;
                }
            }		
	}
	finishTime = System.nanoTime() - startTime;
        array = data.clone();		
	} 
    
    // Getter's to return our results
    public long getSwaps() {
        return swaps;
    }
    public int getComparsions() {
        return comparsions;
    }
    public long getFinishTime() {
        return finishTime;
    }
    public int[] getArray() {
        return array;
    }    
}
