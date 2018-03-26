package ie.lyit.arrays;
import java.util.*;

/**
 * Author James Fallon
 */
public class InvertedArray {
    
public int[] inverseArray(Random rand,int[] data){
			
// Collections reverseOrder() only works for type Integer,so lets try this..
    for(int i=0;i<data.length;i++){
        data[i] = rand.nextInt(10000)+1;
        data[i] = data[i] * -1;
	}
        // Sort array,then multiply by -1 again
        Arrays.sort(data);
        for(int i=0;i<data.length;i++){
	data[i] = data[i] * -1;
        }
    return data;
    } 
}
