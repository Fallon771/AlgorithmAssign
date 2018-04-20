package ie.lyit.arrays;
import java.util.*;

/**
 * Author James Fallon
 */
public class InvertedArray {
    
    private int[] array;
    
    public void inverseArray(Random rand,int[] data){

        //Collections reverseOrder() only works for type Integer,so lets try this..
        for(int i=0;i<data.length;i++){
            // Number range 1-10000
            data[i] = rand.nextInt(10000)+1;
            // Make numbers all negitive
            data[i] = data[i] * - 1;
            }
            // Sort array,then multiply by -1 again to get inverse sort
            Arrays.sort(data);
            for(int i=0;i<data.length;i++){
            // Make numbers all positive
            data[i] = data[i] * -1;
            }
        // Clone array..(create separate copy in memory)
        array = data.clone();
        } 
    // Return array
    public int[] getArray() {
        return array;
    } 
}
