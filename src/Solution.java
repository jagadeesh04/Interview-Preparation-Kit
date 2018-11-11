import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the sockMerchant function below.
    /*static int sockMerchant(int n, int[] ar) {
		
    	Map<Integer, Integer> map = new HashMap();
    	
    	for(int i=0; i<ar.length; i++){
    		if(i==0){
    			map.put(ar[i], 1);
    		} else{
    			if(map.containsKey(ar[i])){
    				map.put(ar[i], map.get(ar[i])+1);
    			} else{
    				map.put(ar[i], 1);
    			}
    		}
    	}
    	int result = 0;
    	
    	map.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));
    	
    	for (Map.Entry<Integer,Integer> entry : map.entrySet())  {
    		
    		if(entry.getValue()%2==0){
    			result = result +entry.getValue()/2;
    		} else{
    			result = result+(entry.getValue()-1)/2;
    		}
    	}
    	
    	
    	return result;


    }*/
	
	// Complete the countingValleys function below.
    /*static int countingValleys(int n, String s) {
    	
    	int finalResult = 0;
    	int seaLevel =0;
    	for(int i=0; i<s.length(); i++){
    		if(s.charAt(i)=='U'){  // up
    			seaLevel = seaLevel +1;
    		} else{ // down
    			seaLevel = seaLevel -1; //-2
    			if(seaLevel == -1){
    				finalResult++;  //added 1
    			
    			}
    		}   		
    	}

    	return finalResult;
    }*/
	
	 static int jumpingOnClouds(int[] c) {
		 
		 int result = 0;
		 
		 if(c.length==2){
			 return 1; 
		 }else{
			 for(int i=0; i<c.length-2; i++){
					if((c[i+1]==0 && c[i+2]==0) || (c[i+1]==1) && c[i+2]==0){
						result++;
						i=i+1;
						if(i==c.length-3){
							result++;
							break;
						}
					} else if(c[i+1]==0 && c[i+2]==1){
						result++;
					}
					 
				 }
				
				 return result;

		 }
		
		
	 }
	 
	// Complete the repeatedString function below.
	   /* static long repeatedString(String s, long n) {
	    	
	    	if(!s.contains("a")){
	    		return 0;
	    	}
	    	
	    	if(s.length()==1)
	    		return n;
	    	else{
	    		
	    		int remainder = (int) (n%s.length());
	    		long quotient = n/s.length();
	    		long temp = 0L;
	    		for(int i=0; i<s.length();i++){
	    			if(s.charAt(i)=='a'){
	    				temp++;
	    			}
	    		}
	    		
	    		long actualResult = temp*quotient;
	    		
	    		String remainderString = s.substring(0,remainder);
	    		
	    		for(int i=0; i<remainderString.length();i++){
	    			if(s.charAt(i)=='a'){
	    				actualResult++;
	    			}
	    		}
	    		
	    		return actualResult;
	    		
	    	}
	    	
	    	
	    }*/

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        /*int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }*/
    	
    	/*int n = 9;
    	int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};

        int result = sockMerchant(n, ar);*/
    	/*int n = 12;
    	String s = "DDUUDDUDUUUD";
    	int result = countingValleys(n, s);*/
    	
    	//int[] c ={0, 0, 0, 0, 1, 0};
    	
   //int[] c ={0, 0, 0, 1, 0, 0};
    	
    	//int[] c ={0, 0, 1, 0, 0, 1, 0};
    	
    	int[] c ={0, 0, 1, 0, 0, 0, 0, 1, 0, 0};
    	
    	int result = jumpingOnClouds(c);
    	
    	/*String s = "abcac";
    	int n = 12;
    	
    	String s = "a";
    	long n = 1000000000000L;
    	
    	long result = repeatedString(s, n);*/
    	
    	
    	System.out.println(String.valueOf(result));

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}