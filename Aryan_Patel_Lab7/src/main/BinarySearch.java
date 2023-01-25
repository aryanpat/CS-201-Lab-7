package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class BinarySearch {
	  
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
		
		
		System.out.println("The index for the target number 992800 is: " + BinarySearch.brinarySearch(arraySort, 992800) + ".");
		
		long end = System.currentTimeMillis();
				
		System.out.println("The total time used for Binary Search was: " + (end - start) + "ms.");
		
		
	}
	
	
	public static int brinarySearch(int[] array, int target) {
		
		int start = 0;
		int end = array.length - 1;
		
		while(start <= end) {
			
			int mid = (start + end) / 2;
			
			if(array[mid] == target) {
				
				return mid;
						
			}
			else if(array[mid] < target) {
				
				start = mid + 1;
				
			}
			else {
				
				end = mid - 1;
				
			}
			
		}
		
		return -1;
		
	}
}


