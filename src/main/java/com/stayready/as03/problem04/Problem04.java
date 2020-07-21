package com.stayready.as03.problem04;

public class Problem04 {
    public Boolean harmlessRansomNote(String message , String magazineText){
        Boolean result = true;
        String a[] = magazineText.split(" "); 
        int count = 0;
        for(String word : a) {
            for(int i =0; i < a.length-1; i++){
                if(word.equals(a[i])){
                    count ++;}
                }
            if(count == 1){
                result = true;
            }
            else{
                result = false;
            }
        }
        return result;
    }
}
