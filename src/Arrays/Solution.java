package Arrays;

import java.io.IOException;
import java.util.Arrays;

public class Solution {
	
	// Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {

    	int[] arr = new int[a.length];
    	
    	for(int i=0; i<a.length; i++){
    		arr[i] = a[d];
    		d=d+1;
    		if(d>=a.length){
    			d=0;
    		}
    	}
    	
    	return arr;
    }

	public static void main(String[] args) throws IOException {

		
		int[] a = {1, 2, 3, 4, 5};
		int d = 3;

        int[] result = rotLeft(a, d);

        System.out.println(Arrays.toString(result));
       
    }
}
