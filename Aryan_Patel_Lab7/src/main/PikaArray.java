package main;

import java.util.Scanner;

public class PikaArray {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String name;
		String age;
		String gender;

		
		String[] pikaArray1 = new String[3];
		String[] pikaArray2 = new String[3];
		String[] pikaArray3 = new String[3];
		
		String[][] completePika = new String[3][3];
		
		completePika[0] = pikaArray1;
		completePika[1] = pikaArray2;
		completePika[2] = pikaArray3;
		
				
		System.out.println("Enter your Pokemons name: ");
		name = input.next();
		
		System.out.println("Enter your Pokemons gender (M or F): ");
		gender = input.next();
		
		System.out.println("Enter your pomkemons age: ");
		age = input.next();
		
		pikaArray1[0] = name;
		pikaArray1[1] = gender;
		pikaArray1[2] = age; 
		
		System.out.println("Enter your Pokemons name: ");
		name = input.next();
		
		System.out.println("Enter your Pokemons gender (M or F): ");
		gender = input.next();
		
		
		System.out.println("Enter your pomkemons age: ");
		age = input.next();
		
		pikaArray2[0] = name;
		pikaArray2[1] = gender;
		pikaArray2[2] = age; 
		
		System.out.println("Enter your Pokemons name: ");
		name = input.next();
		
		System.out.println("Enter your Pokemons gender (M or F): ");
		gender = input.next();
		
		
		System.out.println("Enter your pomkemons age: ");
		age = input.next();
		
		pikaArray3[0] = name;
		pikaArray3[1] = gender;
		pikaArray3[2] = age; 
		
		for(int a = 0; a < pikaArray1.length; a++){
			
			completePika[0][a] = pikaArray1[a];
			
		}
		
		for(int a = 0; a < pikaArray2.length; a++){
			
			completePika[1][a] = pikaArray2[a];
			
		}
		
		for(int a = 0; a < pikaArray3.length; a++){
			
			completePika[2][a] = pikaArray3[a];
			
		}
		
		System.out.println("The pokemon info in Index 2: My pokemon's name: " + completePika[1][0] + ". It's gender is: " + completePika[1][1] + ". Its age is: " + completePika[1][2] + ".");
	
		input.close();
		
	}
	
}

