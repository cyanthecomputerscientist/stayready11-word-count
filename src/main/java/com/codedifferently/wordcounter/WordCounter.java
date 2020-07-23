package com.codedifferently.wordcounter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class WordCounter {

    HashMap<String , Integer> hashMap = new HashMap<String,Integer>();
    //display the word count in alphabetical order
    public HashMap<String,Integer> wordCount(String file)
    {
        String [] words = file.split(" ");
        Integer wordCount = 0; 
        for (String word : words) 
        {
            if (hashMap.containsKey(word) == false) {
                hashMap.put(word, 1);
            }    
            else
            {
                 wordCount = hashMap.get(word);
                 hashMap.replace(word, wordCount++);
            }
        }
        
        return hashMap;
    }

    public String alphabeticalOrder()
    {
        String alphaOrder = "";
        ArrayList<String> sorted = new ArrayList<String>(hashMap.keySet());
        Collections.sort(sorted);
        for (String word : sorted) 
        {
                alphaOrder += word + "Appeared:" + hashMap.get(word) + "\n";
        }
        return alphaOrder; 

    }
    public String mostFrequency()
    {
        String word = "";
        String message = "The most used word is : ";
        Integer highestFreq = 0; 
        
        for (String key : hashMap.keySet()) 
        {
            if(hashMap.get(key) > highestFreq)
            {
                word = key;
                highestFreq = hashMap.get(key);
            }    

        }
            return message + word + "\n";
    }
    public String leastFrequency()
    {
        String word = "";
        String message = "The least used word is :";
        Integer leastFreq = 1;
        for (String key : hashMap.keySet()) 
        {
            if (hashMap.get(key) <= leastFreq) 
            {
                word = key;
                leastFreq = hashMap.get(key);
            }    
        }
        return message + word;
    }

    public Integer uniqueWords()
    {
        Integer count = 0; 

        for (String key : hashMap.keySet()) 
        {
            if (hashMap.containsValue(1)) 
            {
                count++;    
            }
        }

        return count;
    }

    public String longestWord()
    {

        return "";
    }
}
