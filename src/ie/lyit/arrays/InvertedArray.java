package ie.lyit.arrays;
import java.util.*;

/**
 * @author James Fallon
 */
public class InvertedArray {
    
Random rand = new Random();
private int[] data;

// Constructor
public InvertedArray(Random rand,int[] data){

    this.rand=rand;
    this.data=data;
}
    
public int[] inverseArray(){
			
// Collections reverseOrder() only works for type Integer,so lets try this..
    for(int i=0;i<data.length;i++){
        data[i] = rand.nextInt(100)+1;
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
