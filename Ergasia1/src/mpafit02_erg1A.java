/**
* Author: Marios Pafitis
* Written: 28/09/2017
* Last updated: 29/09/2017
*
* Compilation: javac mpafit02_erg1A.java
* Execution: java mpafit02_erg1A
*
* To programma diavazei apo ton xristi ton arithmo “num” pou anazita ton pinaka tou. To programma mesw mias 
* epanaliptikis domis typou while epalitheuei tin egkurotita toy arithmou diladi na einai megaluteros toy midenos.
* Stin sunexeia xrisimopoiou epanaliptiki domi tupou for i opoia epanalamvanetai “num” fores. An to “i” 
* isoutai me 1 tote tupwnei tin prwti grammi panw apo ton pinaka pou antiproswpeuei ton pollaplasio arithmo apo 1 
* mexri ton arithmo “num”. Me tin xrisi enow deuterou nested for tupwnoume tin vasi i opoia apoteleitai apo ton 
* sunduasmo “+------+”, “num” fores. Akolouthws me ena trito nested for upologizoume ton pollaplasiasmo i * j kai 
* ton ektupvnoume. Sto telos typwnoyme se ena ksexwristo ekswteriko for ksana ton sunduasmo “+------+”, “num” fores.
*
*/
import java.util.Scanner;
public class mpafit02_erg1A {

	public static void main(String[] args) {	
		
		//Variables
		int mult = 0;
		
		//Import
		System.out.print("Enter the number: ");		
		Scanner stdin = new Scanner(System.in);
		int num = stdin.nextInt();
		while(num < 1) {
			System.out.print("Enter a number greater than 0: ");
			num = stdin.nextInt();
		}
		System.out.println();
		
		
		for(int i = 1; i <= 9; i++) {
			//Print the First Row
			if (i== 1) {
				System.out.print("    ");
				for(int j = 1; j <= num; j++) {	
					System.out.printf("%5d  ",j);				
				} 
			}
			
			//Print the base
			System.out.print("\n    +");
			for(int j = 1; j <= num; j++) {
				System.out.print("------+");
			}
			
			//Calculate and Print the Numbers
			System.out.println();
			for(int j = 1; j <= num; j++) {
				//Print the First Column
				if (j == 1) {
				System.out.printf("%3d |",i);
				}
				
				mult = i * j;
				System.out.printf("%4d  |",mult);
				
			}	
		}
		
		//Print Last Line
		System.out.print("\n    +");
		for(int j = 1; j <= num; j++) {
			System.out.print("------+");
		}
		stdin.close();
	}

}
