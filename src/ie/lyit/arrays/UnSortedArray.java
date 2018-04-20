package ie.lyit.arrays;
import java.util.*;

/**
 * Author James Fallon
 */
public class UnSortedArray {
    
    private int[] array;
    
    public void unsortedArray(Random rand,int[] data){
	// Populate with random numbers		
        for(int i=0;i<data.length;i++){
        // Number range 1-10000
	data[i] = rand.nextInt(10000)+1;
            }
        // Clone array..(create separate copy in memory)
        array = data.clone();
	} 
    // Return array
    public int[] getArrray() {
        return array;
    } 
}
