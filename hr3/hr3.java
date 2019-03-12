package hr3;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class hr3 {

    // Complete the reverseArray function below.
    static int[] reverseArray(int[] a) {
    	int n = a.length;
    	//int[] arr2 = new int[n];
    	//int last = 0;
    	for (int i = 1; i < n; i++) {
            //int arrItem = Integer.parseInt(arrItems[i]);
    		//arr[n] = last;
    		int first = 0;
    		first = n / n;
    		int last = 0;
    		// a[i] = a[n-1]; // when a is 0, n is 4, when a is 1, n is still 4
    		
			/*
			 * last = a[n-1]; // this is the last element of the array int temp = 0; temp =
			 * last; // store last in temp a[n-1] = a[0]; // first element goes in last
			 * place a[0] = temp; // last element goes in first place
			 */ 
    		int temp = 0;
    		if (i == 1) {
    		last = a[n-1]; // this is the last element of the array
    		
    		temp = last; // store last in temp    		 
    		a[n-i] = a[i-1]; // first element goes in last place
    		System.out.println("a[n-i] is " + a[n-i]);
    		System.out.println("a[i-1] is " + a[i-1]);
    		System.out.println("temp is " + temp);    		
    		a[i-1] = temp; // last element goes in first place
    		} else {
			
    			last = a[n-i]; // this is the last element of the array
        		
        		temp = last; // store last in temp    		 
        		a[n-i] = a[i-1]; // first element goes in last place
        		System.out.println("a[n-i] is " + a[n-i]);
        		System.out.println("a[i-1] is " + a[i-1]);
        		System.out.println("temp is " + temp);    		
        		a[i-1] = temp; // last element goes in first place
    		} 
    		
            //arr[i] = arrItem;
        }
    	System.out.println("Entire array is" + Arrays.toString(a));
    	return(a);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("a.txt"));

        int arrCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[arrCount];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] res = reverseArray(arr);

        for (int i = 0; i < res.length; i++) {
            bufferedWriter.write(String.valueOf(res[i]));

            if (i != res.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}


/*
 * public class hr3 {
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * 
 * }
 * 
 * }
 */
