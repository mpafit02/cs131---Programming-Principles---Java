/**
* Author: Marios Pafitis
* Written: 28/09/2017
* Last updated: 29/09/2017
*
* Compilation: javac mpafit02_erg1B.java
* Execution: java mpafit02_erg1B
*
* Akolouthws tupwnei to prwto epipedon to opoio apoteleitai apo duo kathetes grammes “||” me tin xrisi enos for
* pou ekteleitai oses fores orisame to size. Stin sunexeia tupwnoume to deuteron epipedo me tin xrisi akomi enos for 
* to opoio ksekina me tin morfi “__/||\__” kai epanalamvanetai eksisou ises fores me tin metavliti size.
* Se kathe epomeni grammi prosthetoume treis anw kai katw teleies “:::” deksia kai aristera tou sumvolou “||”
* me tin xrisi tis metavlitis Tupou String “dots”. To trito epipedon, to opoio exei tin morfi “|””””””””””|”
* tupwnetai mia for a me tin xrisi enos for gia auksisi twn eisagwgikwn analoga me to size. Sto tetarto epipedo
* to opoio einai “\_/\/\/\/\/\_/” me tin xrisi tou prwtou for tupwnoume analoges grammes oso eiani to size.
* Me to deuteron for ruthmizoume ta diastemata mesw tis metavlitis “n” me arxikopoiisi sto 0 kai tin 
* auksanoume kata 2. Stin sunexeia aktupwnoume thn arxi “\_” kai me to trito for tupvnoume analogo arithmo symvolwn “/\”
* sumfwna me tin metabliti “k”. I metavliti “k” me arxikopoiisi stin timi k = size * 6 se kathe epenalipsi 
* meiwnetai kata 4. Telos tupwnoume to sumvolo “__/”. To pempto epipedon einai panomoiotupo me to prwto epipedon. 
* To ekto epipedon perilamvanei ena for to opoio ekteleitai size * size fores tupwnontas to sxima “|%%||%%|”  
* Sto telos epanalamvanoume to epipedon duo kai tria gia tin vasi tou sximatos.
* 
*/
public class mpafit02_erg1B {

	public static void main(String[] args) {
		
		//Variables
		String base = "||";
		String line = "|";
		String slash = "/";
		String bslash = "\\";
		String dots = "";
		String underscore = "_";
		String space= " ";
		String quotes= "\"";
		String percentage = "%";
		int size = Integer.parseInt(args[0]);
		if (size>=2) {
		//Print ||
			for(int i = 1; i <= size; i++) {
				for(int j = 1; j <= size * 3; j++) { 
					System.out.print(space);
				}	
				System.out.println(base);
			}
			//Print __/:::::::::||:::::::::\__
			int n = size * 3 - 3;
			for(int i = 1; i <= size; i++) {
				for(int j = 1; j <= n; j++) {
					System.out.print(space);
				}	
				n-=3;
				System.out.println(underscore + underscore + slash + dots + base + dots + bslash + underscore + underscore);		
				dots += ":::";
			}
			
			//Print |""""""""""""""""""""""""|
			System.out.print(line);	
			for(int j = 1;j <= size * 6; j++) {
				System.out.print(quotes);
			}
			System.out.println(line);						
				
			
			//Print \_/\/\/\/\/\/\/\/\/\/\/\_/ 
			n = 0;
			int k = size * 6 - 1;
			for(int i = 1; i <= size; i++) {
				//Spaces
				for(int j = n; j >= 1; j--) {
					System.out.print(space);
				}	
				//Pattern
				System.out.print(bslash + underscore);
				for(int j = 1;j < k; j++) {
					if(j % 2 == 0) {
						System.out.print(bslash);
					}else{
						System.out.print(slash);
					}
				}
				System.out.println(underscore + slash);	
				k-=4;
				n+=2;
			}			
			
			//Print ||
			for(int i = 1; i <= size; i++) {
				for(int j = 1; j <= size * 3; j++) {
					System.out.print(space);
				}	
				System.out.println(base);
			}	
			
			//Print |%%||%%|
			for(int i = 1; i <= size * size; i++) {
				for(int j = 1; j <= size * 3 - 3; j++) {
					System.out.print(space);
				}	
				System.out.println(line + percentage + percentage + base + percentage + percentage + line);
			}
			
			//Print __/:::::::::||:::::::::\__
			n = size * 3 - 3;
			dots = "";
			for(int i = 1; i <= size; i++) {
				for(int j = 1; j <= n; j++) {
					System.out.print(space);
				}	
				n-=3;
				System.out.println(underscore + underscore + slash + dots + base + dots + bslash + underscore + underscore);		
				dots += ":::";
			}
			
			//Print |""""""""""""""""""""""""|
			System.out.print(line);	
			for(int j = 1;j <= size * 6; j++) {
				System.out.print(quotes);
			}
			System.out.println(line);
		}else {
			System.out.println("Wrong Input.");
		}
	}
}
