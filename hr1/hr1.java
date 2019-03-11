package hr1;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class hr1 {

    /*
     * Complete the simpleArraySum function below.
     */
   

    private static final Scanner scanner = new Scanner(System.in);	

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("a.txt")));
    	BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("a.txt"));
        int arCount = Integer.parseInt(scanner.nextLine().trim());

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");

        for (int arItr = 0; arItr < arCount; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        int result = simpleArraySum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
    
    static int simpleArraySum(int[] ar) {
        /*
         * Write your code here.
         */
		 // hr1 test = new hr1();
		  
		  int ar_sum = 0; 
		/*
		 * int something = 8; String b;
		 */
		  for (int arItr = 0; arItr < ar.length; arItr++) { 
			  		ar_sum += ar[arItr];
			  		//return(ar[arItr]);
			  //int arItem = Integer.parseInt(arItems[arItr].trim()); 
			  //ar[arItr] = arItem; 
			  
		  }
		  System.out.println(ar_sum);
		  return(ar_sum);
		//return(ar[arItr])
		 
    	
                 

    }
    
}



