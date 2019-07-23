public class EntranceSystem {

	public static void displayCandidateAllocations(Candidate[] cands) {
		System.out.print("\n\nCANDIDATE ALLOCATIONS\n");
		for (int i = 0; i < cands.length; i++)
			System.out.println(cands[i]);
		System.out.print("\n\n");
	}

	public static void displayProgramAllocations(Program[] progs) {
		System.out.print("\n\nPROGRAM ALLOCATIONS\n");
		for (int i = 0; i < progs.length; i++)
			System.out.println(progs[i]);
		System.out.print("\n\n");
	}

	public static void main(String[] args) {
		int P = StdIn.readInt();
		int C = StdIn.readInt();
		Program[] progs = new Program[P];
		Candidate[] cands = new Candidate[C];

		for (int i = 0; i < P; i++) {
			String code = StdIn.readString();
			int places = StdIn.readInt();
			progs[i] = new Program(code, places, C);
		}

		for (int i = 0; i < C; i++) {
			String Id = StdIn.readString();
			double score = StdIn.readDouble();
			String[] prefs = new String[5];
			for (int j = 0; j < 5; j++)
				prefs[j] = StdIn.readString();
			cands[i] = new Candidate(Id, score, prefs);
		}

		for (int i = 0; i < C; i++) {
			cands[i].insertPrefs(progs);
		}

		boolean releaseMade;
		do {
			releaseMade = false;
			for (int i = 0; i < P; i++) {
				boolean res = progs[i].requestPrefsRelease(progs);
				releaseMade = releaseMade || res;
			}
		} while (releaseMade);

		for (int i = 0; i < P; i++)
			progs[i].allocatePlaces();

		displayCandidateAllocations(cands);
		displayProgramAllocations(progs);
	}

}
