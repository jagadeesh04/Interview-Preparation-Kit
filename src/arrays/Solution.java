package arrays;

import java.io.IOException;

public class Solution {
	
	// Complete the rotLeft function below.
    /*static int[] rotLeft(int[] a, int d) {

    	int[] arr = new int[a.length];
    	
    	for(int i=0; i<a.length; i++){
    		arr[i] = a[d];
    		d=d+1;
    		if(d>=a.length){
    			d=0;
    		}
    	}
    	
    	return arr;
    }*/
	
	// Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {

    	// 2 1 5 3 4 done
    	// 2 5 1 3 4
    	
    	int result = 0;
    	
    	/*for(int i=0; i<q.length-1; i++){
    		if((q[i]-q[i+1]>0) && (q[i]-q[i+1]<=2)) {
    			result = result+(q[i]-q[i+1]);
    		} else if(q[i]-q[i+1]>2){
    			result = -1;
    			System.out.println("Too chaotic");
    		}
    	}
    	
    	if(result>0){
    		System.out.println(result);
    	}*/
    	
    	for(int i=1; i<q.length; i++){
    		
    	}
    	
    }

	public static void main(String[] args) throws IOException {

		//rotLeft
		/*int[] a = {1, 2, 3, 4, 5};
		int d = 3;

        int[] result = rotLeft(a, d);

        System.out.println(Arrays.toString(result));*/
		
		
		//new-year-chaos
		//int[] q = {2, 1, 5, 3, 4};
		//int[] q = {2, 5, 1, 3, 4};
		int[] q = {1, 2, 5, 3, 7, 8, 6, 4};
		minimumBribes(q);
       
    }
}
