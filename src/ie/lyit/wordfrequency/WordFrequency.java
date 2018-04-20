package ie.lyit.wordfrequency;
import java.io.*;
import java.util.*;

/**
 * @author James Fallon
 *  L00131059
 *  Sort War & Peace -- Count words
 */
public class WordFrequency {
    
    
    public static void main(String args[]) throws FileNotFoundException{
    
    // Create a hashmap
    Map<String, Integer> countWords = new HashMap<String, Integer>();
    // Pass in our txt file
    Scanner s = new Scanner(new File("..\\AlgorithmAssign\\Text Files\\war&peace.txt"));
    // Use delimiter
    s.useDelimiter("[^a-zA-Z]+");
    while (s.hasNext()) {
        String next = s.next();
        Integer count = countWords.get(next);
        if (count != null) {
            countWords.put(next, count + 1);
        } else {
            countWords.put(next, 1);
        }
    }
    // Close scanner
    s.close();
    
    // Create a tree map to sort 
    Map<String, Integer> map = new TreeMap<String, Integer>(countWords);
    // Entry set
    Set set = map.entrySet();
    // Iterator to loop over set
    Iterator it = set.iterator();
         while(it.hasNext()) {
              Map.Entry me = (Map.Entry)it.next();
              // Display words & count
              System.out.print(me.getKey() + ": ");
              System.out.println(me.getValue());
         }
    }
}
