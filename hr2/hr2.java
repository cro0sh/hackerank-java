package hr2;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class hr2 {
	
    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    	//LinkedList<String> alice = new LinkedList<String>();
    	//LinkedList<String> bob = new LinkedList<String>();
    	
		/*
		 * int a1 = a.get(1); int a2 = a.get(2); int a3 = a.get(3); int b1 = a.get(1);
		 * int b2 = a.get(2); int b3 = a.get(3);
		 */
    	
    	//int[] ar = new int[2];
    	int alice = 0;
    	int bob = 0;
    	int tie = 0;
    	
    	for(int i=0; i < 3; i++) {
    		  int alices = a.get(i);
    		  int bobs = b.get(i);
    		  if (alices > bobs) {
  				alice++;
  			}
  			else if (alices == bobs) { 
  				tie++;
  			}
  			else { 
  				bob++;     			
  			}
    		}
    	
    	List<Integer> score = new LinkedList<Integer>();
    	score.add(alice);
    	score.add(bob);
    	System.out.println(score);
    	return(score);
    	
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("a.txt"));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
	

