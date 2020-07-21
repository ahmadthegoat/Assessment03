package com.stayready.as03.problem00;

public class Problem00 {
    static int countOccurences(String str, String word) { 
    String a[] = str.split(" "); 
  
    int count = 0; 

    for (int i = 0; i < a.length; i++)  
    {  
    String listword = a[i].substring(0, a[i].length()-1);
     if((Character.isLetterOrDigit(listword.charAt(listword.length()-1)) == false)) {
            listword = listword.substring(0, listword.length()-1);
            }
            else{
                listword = listword;
            
    if (word.equals(listword)){ 
        count++; 
    } }
}
    return count; 
} 

        public String countUniqueWords(String input){
        String s = "";
        String a[] = input.split(" "); 

        for(String word: a){
        if((Character.isLetterOrDigit(word.charAt(word.length()-1)) == false)) {
            word = word.substring(0, word.length()-1);
            }
            else{
                word = word;
            }
            s += "The 3 unique words are:\n"+ word + " (Seen " + String.valueOf(countOccurences(word, input)) + ")\n";
        }return s;
        }
            /*int count = 0;
            for(int i =0; i < input.length(); i++){
            if(String.valueOf(word).equals(String.valueOf(input.toCharArray()[i]))){
                count++;
            }
        }
    }
        return null;
**/ 
}


