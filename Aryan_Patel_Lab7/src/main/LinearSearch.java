package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LinearSearch {

	public static void main(String[] args) throws IOException {
		
		long start = System.currentTimeMillis();
		
		BufferedReader bf = new BufferedReader(new FileReader("/Users/aryanpat/Desktop/12178063.txt"));
		ArrayList<String> listOfInts = new ArrayList<String>();
		
		String line = bf.readLine();
		 
		while (line != null) {
			listOfInts.add(line);
            line = bf.readLine();
        }
		
		bf.close();
		
		String[] array = listOfInts.toArray(new String[0]);
		
		int[] arraySort = new int[array.length];
		
		for(int i = 0;i < array.length;i++){
		   
		 arraySort[i] = Integer.parseInt(array[i]);
		  
		}
		
		
		System.out.println("The index for the target number 992800 is: " + LinearSearch.linearSearch(arraySort, 992800) + ".");
		
		long end = System.currentTimeMillis();
				
		System.out.println("The total time used for Linear Search was: " + (end - start) + "ms.");
		
		//The difference between the time using of Binary vs Linear Search is that Binary search uses log(n) time complexity while Linear search is just n or linear complexity.
		//This means that Binary Search will be faster the larger or more complex the problem is, while Linear is more effective in a single list problem.
		//For this lab using Binary Search was a bit better than using the Linear Search.
		
	}
	
	public static int linearSearch(int[] array, int target) {
		
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] == target) {
				
				return i;
				
			}
		}
		
		return -1;
		
	}
}
