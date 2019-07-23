/**
* Author: Μάριος Παφίτης
* Written: 14/09/2017
* Last updated: 22/09/2017
*
* Compilation: javac mpafit02_erg0.java
* Execution: java mpafit02_erg0
*
* Το πρόγραμμα διαβάζει από τον χρήστη το γεωγραφικό του μήκος, 
* και μετά αν διανύει περίοδο καλοκαιριού ή χειμώνα.(Καλοκαίρι : 1, Χειμώνας : 0). 
* Ακολούθως προσθέτει μια ώρα αν είναι καλοκαιρινή η περίοδος 
* και την διαφορά ώρας ανάλογα με το γεωγραφικό μήκος στην ώρα UNIX
* (προσθέτει αν είναι θετικό το γεωγραφικό μήκος και αφαιρεί αν είναι αρνητικό).
* Μέτα μετατρέπει την ώρα UNIX σε ώρα Γκρίνουιτς.
* Τέλος παρουσιάζει τα αποτελέσματα στον χρήστη. 
*
*/
public class mpafit02_erg0 {

	public static void main(String[] args) {
		
		//Variables
		long unixTime = System.currentTimeMillis() / 1000; // /1000 γιατί είναι σε miliseconds
		int hour = 0, min = 0, sec;
		double timeDif;
		String periodDay = new String();
		
		//Read Longitude
		float longitude = Float.parseFloat(args[0]);
		
		//Read if is Summer or Winter
		int Summer_time = Integer.parseInt(args[1]);
		
		//Summer or Winter time
		if(Summer_time == 1) {
			unixTime += 60 * 60;
		}
		
		//Find the time difference
		timeDif = (longitude * 24 / 360);
		unixTime += (int)timeDif * (60 * 60);	
						
		//Convert UNIX to UTC
		hour = (int)(unixTime % (24 * 60 * 60)) / (60 * 60); // UNIX % (24 hours * 60 min * 60 sec) / (60 min * 60 sec)  
		min = (int)(unixTime % (60 * 60)) / 60; // UNIX % (60 min * 60 sec) / (60 sec)
		sec = (int)(unixTime % 60); // UNIX % 60 sec
		
		//Find AM/PM
		if (hour > 11) {
			periodDay = "PM";
		}else{			
			periodDay = "AM";
		}				
		if (hour > 12) {
		    hour -= 12;
		}		
		//Screen
		System.out.println("Your Longitude is: " + longitude);
		System.out.println("Winter time = 0 / Summer time = 1: " + Summer_time);
		System.out.printf("Current time is %02d:%02d:%02d %s\n",hour,min,sec,periodDay);
	}

}

