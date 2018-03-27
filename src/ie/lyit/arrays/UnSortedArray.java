package ie.lyit.arrays;
import java.util.*;

/**
 * Author James Fallon
 * Unsorted Array
 */
public class UnSortedArray {
    
    private int[] array;
    
    public void unsortedArray(Random rand,int[] data){
			
        for(int i=0;i<data.length;i++){
	data[i] = rand.nextInt(10000)+1;
            }
        array = data;
	} 
    
    public int[] getArrray() {
        return array;
    } 
}
