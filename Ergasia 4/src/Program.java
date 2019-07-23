public class Program {

	private String code;
	private int places;
	private int count = 0;
	private Candidate[] cands;
	private int freePlaces;

	public Program(String c, int ps, int cs) {
		code = c;
		places = ps;
		freePlaces = ps;
		cands = new Candidate[cs];
	}

	public String getCode() {
		return code;
	}

	public int getPlaces() {
		return places;
	}

	public int getCount() {
		return count;
	}

	public Candidate[] getCands() {
		return cands;
	}

	public int getFreePlaces() {
		return freePlaces;
	}

	public String toStringCands() {
		String s = "The ranked list of candidates is";
		for (int i = 0; i < count; i++) {
			s = s + "\n>> " + cands[i];
		}
		return s;
	}

	public String toStringAllocations() {
		String s = "Program " + code + " has " + places
				+ " places\nThe following candidates get a place on the programme";
		for (int i = 0; i < min(places, count); i++) {
			s = s + "\n>> " + cands[i].getId() + "  " + cands[i].getScore();
		}
		s = s + "\nThe programme has " + freePlaces + " free places";
		return s;
	}

	// Parousiazei ta programmata me tous ipopsifious
	// pou katataxthikan se afta
	public String toString() {
		return toStringAllocations();
	}

	private static double min(double x, double y) {
		if (x < y)
			return x;
		else
			return y;
	}

	public void allocatePlaces() {
		for (int i = 0; i < places; i++) {
			cands[i].makeAllocation(code);
		}
		freePlaces = places - count;
		if (freePlaces < 0) {
			freePlaces = 0;
		}
	}

	// O kathe ipopsifios topotheteitai ston pinaka
	// cands gia to analogo programma sto opoio edikse
	// endiaferon
	public void insertCandidate(Candidate c) {
		cands[count] = c;
		count++;
		Candidate temp;
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count - 1; j++) {
				if (cands[j].getScore() < cands[j + 1].getScore()) {
					temp = cands[j];
					cands[j] = cands[j + 1];
					cands[j + 1] = temp;
				}
			}
		}
	}

	// Afaireitai o ipopsifios apo ton pinaka cands 
	// tou analogou programmatos metakinontas tous
	// metepita ipopsifious mia thesi prin
	public void removeCandidate(String identity) {
		for (int i = 0; i < count; i++) {
			if (cands[i].getId().equals(identity)) {
				for (int j = i; j < count - 1; j++) {
					cands[j] = cands[j + 1];
				}
				count--;
			}
		}
	}

	// Zita apo tin sinartisi releasePrefsBelow
	// na eleksei an iparxoun tixon ipopsifioi 
	// pou boroun na eleftherosoun thesi sto sigkekrimeno
	// programma
	public boolean requestPrefsRelease(Program[] ps) {
		for (int i = 0; i < places; i++) {
			if (cands[i].releasePrefsBelow(code, ps)) {
				return true;
			}
		}
		return false;
	}
}