package ie.lyit.tester;

import java.io.*;
import java.util.logging.*;

/**
 * @author jim
 */
public class TesterClass {
    
    public static void main(String args[]){
        
        try {
            readFile();
        } catch (IOException ex) {
            Logger.getLogger(TesterClass.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    
    public static void readFile() throws IOException{
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("..\\AlgorithmAssign\\Text Files\\alice30.txt"));
            try {
                StringBuilder sb = new StringBuilder();
                String line = br.readLine();

                while (line != null) {
                    sb.append(line);
                    sb.append(System.lineSeparator());
                    System.out.println(line = br.readLine());
                }
                String everything = sb.toString();
                
            } catch(IOException e){
                 br.close();
            }
            finally {
               
}
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TesterClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
