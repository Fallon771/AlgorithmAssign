package ie.lyit.arrays;
import java.util.*;

/**
 * Author James Fallon
 */
public class SortedArray {
    
    public int[] sortedArray(Random rand,int[] data){
		
	for(int i=0;i<data.length;i++){
	data[i] = rand.nextInt(10000)+1;
	}
	Arrays.sort(data);
	return data;
	}  
}
