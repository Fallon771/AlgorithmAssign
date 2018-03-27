package ie.lyit.algorithms;

/**
 * Author James Fallon
 */
public class EnhancedBubble {
    
    private int swaps;
    private int comparsions;
    long startTime;
    long finishTime;
    int[] array;
    
    public void bubbleSortTweak(int data[]){
			
	boolean arraySorted = false;
        comparsions = 0;
        swaps = 0;
	long startTime = System.nanoTime();
        
	for(int i =0;i<data.length && !arraySorted;i++){	
	arraySorted = true;
            for(int j=0;j<data.length-i-1;j++){
                comparsions++;
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
        array = data;		
	} 
    
    // Getter's
    public int getSwaps() {
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
