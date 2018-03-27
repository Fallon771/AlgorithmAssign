package ie.lyit.arrays;
import java.util.*;

/**
 * Author James Fallon
 */

public class SortedArray {
    
    private int[] array;
    
    public int[] sortedArray(Random rand,int[] data){	
	for(int i=0;i<data.length;i++){
	data[i] = rand.nextInt(10000)+1;
	}
	Arrays.sort(data);
        array = data;
	return data;
	}  

    public int[] getArray() {
        return array;
    } 
}
