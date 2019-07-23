/**
 * Author: Marios Pafitis Written: 04/11/2017 Last updated: 05/11/2017
 *
 * Compilation: javac mpafit02_erg3.java 
 * Execution: java mpafit02_erg3
 *
 * To programma katanemei tis theseis foitisis se panepistimiaka programmata
 * spoudon, vasei ton protimiseon ton upopsifion kai ton vathmon katataksis
 * tous. Arxika to programma parousiazei olokliri ti lista endiaferomenon
 * upopsifion gia kathe programma spoudon opos auti prokuptei apo ta protogeni
 * stoixeia, taksinomimeni sti seira pou prepei. Sti sunexeia to programma
 * parousiazei tis meiomenes listes endiaferomenon upopsifion opos autes
 * prokuptoun meta ti diagrafi upopsifiotiton (xamiloteron se protimisi
 * upopsifiotiton se sxesi me diasfalizomeni upopsifiotita). Akolouthos to
 * programma parousiazei gia kathe upopsifio an pire thesi foitisis kai se poio
 * programma spoudon. Telos, dinei tis katanomes gia kathe programma spoudon
 * parallila episimanontas an prokuptoun kapoies agones theseis.
 *
 */

class CPref {
	int Cid;
	double Score;
	int Pref;

	public CPref(int id, double sc, int pr) {
		Cid = id;
		Score = sc;
		Pref = pr;
	}
}

public class mpafit02_erg3 {
	public static void main(String[] args) {

		// Variables
		int P = Integer.parseInt(args[0]); // Plithos Programmaton
		int S = Integer.parseInt(args[1]); // Plithos Ipopsifion
		boolean finish = false, position;
		int[] NumPlaces = new int[P + 1];
		CPref[][] Prefs = new CPref[P + 1][S];
		int[] NumCands = new int[P + 1];

		// Read NumPlaces[], fill NumCands[]
		for (int i = 1; i <= P; i++) {
			NumPlaces[i] = StdIn.readInt();
			NumCands[i] = 0;
		}

		// Read Prefs[][]
		for (int i = 1; i <= S; i++) {
			int id = StdIn.readInt();
			double sc = StdIn.readDouble();
			int prog = StdIn.readInt();
			int pr = 1;
			while (prog != 0) {
				CPref cp = new CPref(id, sc, pr);
				Prefs[prog][NumCands[prog]] = cp;
				NumCands[prog]++;
				pr++;
				prog = StdIn.readInt();
			}
		}
		
		// Sort Prefs[][] based on the score
		CPref temp;
		for (int k = 1; k <= P; k++) {
			for (int i = 1; i <= NumCands[k]; i++) {
				for (int j = 0; j < NumCands[k] - i; j++) {
					if (Prefs[k][j].Score < Prefs[k][j + 1].Score) {
						// Sort
						temp = Prefs[k][j];
						Prefs[k][j] = Prefs[k][j + 1];
						Prefs[k][j + 1] = temp;
					}
				}
			}
		}
		System.out.println();
		for (int i = 1; i <= P; i++) {
			System.out.println("Programme " + i + " has " + NumPlaces[i] + " places");
			System.out.println("Interested candidates are " + NumCands[i]);
			for (int j = 0; j < NumCands[i]; j++) {
				System.out.printf("Candidate: %-2d Score: %2.2f Preference: %d\n",Prefs[i][j].Cid, Prefs[i][j].Score, Prefs[i][j].Pref);
			}
			System.out.println();
		}

		// Reducing interested candidates according to preferences
		finish = false;
		while (!finish) {
			finish = true;
			for (int i = 1; i <= P; i++) {
				for (int j = 0; j < NumCands[i]; j++) {
					for (int m = 1; m <= P; m++) {
						for (int l = 0; l < NumCands[m]; l++) {
							if ((Prefs[i][j].Cid == Prefs[m][l].Cid) && (Prefs[i][j].Pref < Prefs[m][l].Pref)
									&& (j < NumPlaces[i])) {
								finish = false;
								for (int k = l; k < NumCands[m] - 1; k++) {
									Prefs[m][k] = Prefs[m][k + 1];
								}
								NumCands[m]--;
							}
						}
					}
				}
			}
		}
		System.out.println("Reducing interested candidates according to preferences");
		System.out.println();
		for (int i = 1; i <= P; i++) {
			System.out.println("Programme " + i + " has " + NumPlaces[i] + " places");
			System.out.println("Interested candidates are " + NumCands[i]);
			for (int j = 0; j < NumCands[i]; j++) {
				System.out.printf("Candidate: %-2d Score: %2.2f Preference: %d\n",Prefs[i][j].Cid, Prefs[i][j].Score, Prefs[i][j].Pref);
			}
			System.out.println();
		}

		// Candidate Allocations
		System.out.println("Candidate Allocations");
		System.out.println();
		for (int k = 1; k <= S; k++) {
			position = false;
			for (int i = 1; i <= P; i++) {
				for (int j = 0; j < NumCands[i]; j++) {
					if ((Prefs[i][j].Cid == k) && (j < NumPlaces[i])) {
						System.out.printf("Candidate %-2d has been allocated a place on programme %d\n",Prefs[i][j].Cid, i);
						position = true;
					}
				}
			}
			if (!position) {
				System.out.printf("Candidate %-2d has not been allocated a study place\n", k);
			}
		}

		// Programme Allocations
		System.out.println();
		System.out.println("Programme Allocations");
		System.out.println();
		for (int i = 1; i <= P; i++) {
			// NumCands[i] = NumPlaces[i] + 1;
			System.out.println("The following candidates receive a place on Programme " + i);
			for (int j = 0; j < NumPlaces[i]; j++) {
				if (j < NumCands[i]) {
					System.out.printf("Candidate: %-2d with score %2.2f\n", Prefs[i][j].Cid, Prefs[i][j].Score);
				}
			}
			if(NumCands[i] < NumPlaces[i]) {
				if(NumPlaces[i] - NumCands[i] == 1) {
					System.out.println("There is 1 free place on Programme " + i);
				}else {
					System.out.println("There are " + (NumPlaces[i] - NumCands[i]) + " free places on Programme " + i);					
				}
			}
			System.out.println();
		}
	}
}
