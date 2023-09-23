
import java.util.HashMap; //importing hashmap

import java.util.Map; //importing map

public class Problem { // creating public class called problem

    public static void main(String[] args) { //creating public method main
        String letters = "aabbccddeefaagabca"; // initializing string called letters
        Map<String, Integer> letterCount = new HashMap<>(); // initializing hashmap with value key of string and integer
        //map is called letterCount
        for(int x = 0; x < letters.length() ; x++){ //for loop iterating through length of letters
            String letter = letters.substring(x, x+1); //taking the substring of integer and adding 1
            if(letterCount.containsKey(letter)){ // if map letterCount contains the key of letter
                Integer count = letterCount.get(letter); //current count || reaching into pantry and getting sugar(?)
                count +=1; //current count plus one
                letterCount.put(letter, count); //putting the sugar back in the pantry
            }else { //else statement
                letterCount.put(letter, 1); //if letter has never been seen, we are creating its first count
            }
        }
        int maxCount=0; //resetting maxCount so we can start going through the loop
        String maxLetter = ""; // setting maxLetter
        for (Map.Entry<String, Integer> entry: letterCount.entrySet()) { //looping through key and value to get letterCount that has been set
            if (entry.getValue() > maxCount){ //if value is larger than max count
                maxLetter = entry.getKey(); // then get key entry for maxLetter
                maxCount = entry.getValue(); // get value for maxCount
            }
        } //we do for each loop for maps because there's no index in maps
        System.out.println(maxLetter); //print maxLetter
    }
}
