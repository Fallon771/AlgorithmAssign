package ie.lyit.algorithms;

/**
 * @author James Fallon
 */
public class BubbleSort {
    
    private long startTime;
    private long finishTime;
    private long swaps;
    private int comparsions;
    
    // Bubble sort
    public void bubbleSort(int array[]){
    swaps = 0;
    comparsions = 0;
    startTime = System.nanoTime();
    
    for(int i=0;i<array.length;i++){
	for(int j=0;j<array.length-1;j++){
        comparsions ++;
            //Compare values
            if(array[j] > array[j+1]){
                //Swap values
                int temp = array[j+1];
                array[j+1] = array[j];
                array[j] = temp;
                swaps++;
                }
            }	
      }
    finishTime = (System.nanoTime() - startTime);
    } 
    // Getter's to return values
    public long getFinishTime() {
        return finishTime;
    }
    public long getSwaps() {
        return swaps;
    }
    public int getComparsions() {
        return comparsions;
    }  
}
