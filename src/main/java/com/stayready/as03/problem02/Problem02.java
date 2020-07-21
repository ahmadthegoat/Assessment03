package com.stayready.as03.problem02;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem02 {

    public int findNumberOfNonMatching(int[] ar) {
        Arrays.sort(ar);
        ArrayList<Integer> matching = new ArrayList<Integer>();
        for(int i = 0; i < ar.length-1 ; i++){
            int currentint = ar[i];
            if(currentint != ar[i+1]){
                matching.add(ar[i+1]);
            }
            else{
                continue;
            }

        }
        return matching.size();
    }

}

