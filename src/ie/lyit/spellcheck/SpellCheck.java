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
   public static void main(String[] args) 
      throws FileNotFoundException
   {
      // Read the dictionary and the document
      Set<String> dictionaryWords = readWords("..\\AlgorithmAssign\\Text Files\\dictionary.txt");
      Set<String> documentWords = readWords("..\\AlgorithmAssign\\Text Files\\alice30.txt");
      // Create a treeset to sort list
      TreeSet<String> tree = new TreeSet<String>();
      String getWord;
    
      // Add words to treeset
      for (String word : documentWords)
      {
         if (dictionaryWords.contains(word))
         {
            tree.add(word);
         }
      }
      // Create interator to read from treeset
      Iterator<String> it = tree.iterator();
      // Print out all words that are in the book but not dictionary(sorted)
      while(it.hasNext()){
          getWord = it.next();
          System.out.println(getWord);
      }
   }
   
   public static Set<String> readWords(String filename)
      throws FileNotFoundException
   {
      Set<String> words = new HashSet<>();
      Scanner in = new Scanner(new File(filename));
      // Use any characters other than a-z or A-Z as delimiters
      in.useDelimiter("[^a-zA-Z]+");
      while (in.hasNext())
      {
         words.add(in.next().toLowerCase());        
      }
      return words;
   }
}