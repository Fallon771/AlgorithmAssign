package ie.lyit.arrays;
import java.util.*;

/**
 * Author James Fallon
 */

public class SortedArray {
    
    private int[] array;
    
    public void sortedArray(Random rand,int[] data){
        // Populate with random numbers
	for(int i=0;i<data.length;i++){
	data[i] = rand.nextInt(10000)+1;
	}
        //Sort the array
	Arrays.sort(data);
        // Clone array..(create separate copy in memory)
        array = data.clone();
	}  

    public int[] getArray() {
        return array;
    } 
}
