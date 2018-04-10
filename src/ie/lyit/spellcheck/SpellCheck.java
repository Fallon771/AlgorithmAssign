package ie.lyit.spellcheck;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
   This program checks which words in a file are not present in a dictionary.
*/
public class SpellCheck
{
   
   private static TreeSet myTreeSet = new TreeSet();
   
   public static void main(String[] args) 
      throws FileNotFoundException
   {
      // Read the dictionary and the document
      Set<String> dicWords = readWords("..\\AlgorithmAssign\\Text Files\\dictionary.txt");
      Set<String> docWords = readWords("..\\AlgorithmAssign\\Text Files\\alice30.txt");
      Set<String> mixFinal = new HashSet<String>(dicWords);
      mixFinal.addAll(docWords);
      
      // Create iterator
      Iterator<String> iterDic = dicWords.iterator();
      Iterator<String> iterDoc = docWords.iterator();
      
     
      // Iterarate and print out hashset 
     int size = docWords.size();
     int count = 0 ;
     while(iterDic.hasNext() && count < 500){
         count++;
         
         String dic = iterDic.next();
         String doc = iterDoc.next();
         
//         if(dic.equals(doc)){
//            
//         }  
         myTreeSet.add(dic);
      }  
   
      //myTreeSet.addAll(mixFinal);
      Iterator<String> iter3 = myTreeSet.iterator();
      while(iter3.hasNext()){
         
         String mix = iter3.next();
         System.out.println(mix);
      }  
       System.out.println("SIZE TREE: "+myTreeSet.size());
       System.out.println("Words SIZE: "+size);
       System.out.println("COUNTS: "+count);
   }

   /**
      Reads all words from a file.
      @param filename the name of the file
      @return a set with all lowercased words in the file. Here, a 
      word is a sequence of upper- and lowercase letters.
   */
   public static Set<String> readWords(String filename)
      throws FileNotFoundException
   {
       
      Set<String> words = new HashSet<String>();
      Scanner in = new Scanner(new File(filename));
      // Use any characters other than a-z or A-Z as delimiters
      in.useDelimiter("[^a-zA-Z]+");
      while(in.hasNext()){
          words.add(in.next());
      }
      return words;  
   }
}