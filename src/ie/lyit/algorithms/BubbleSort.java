package ie.lyit.algorithms;

/**
 * @author James Fallon
 */
public class BubbleSort {
    
    private long startTime;
    private long finishTime;
    
    // Bubble sort
    public int[] bubbleSort(int array[]){
    startTime = System.nanoTime();
    for(int i=0;i<array.length;i++){
	for(int j=0;j<array.length-1;j++){
            if(array[j] > array[j+1]){			
		int temp = array[j+1];
		array[j+1] = array[j];
		array[j] = temp;		
                    }
		}	
            }
    finishTime = (System.nanoTime() - startTime);
    return array;
    } 
    // Getter for finsih time
    public long getFinishTime() {
        return finishTime;
    }
    
}
