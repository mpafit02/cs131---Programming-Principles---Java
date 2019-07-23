public class Candidate {

	private String id;
	private double score;
	private String[] preferences;
	private boolean[] activePrefs = { true, true, true, true, true };
	private boolean allocationMade = false;
	private String studyPlace;

	public Candidate(String identity, double s, String[] ps) {
		id = identity;
		score = s;
		preferences = ps;
	}

	public String getId() {
		return id;
	}

	public double getScore() {
		return score;
	}

	public boolean hasAllocation() {
		return allocationMade;
	}

	public void makeAllocation(String prog) {
		allocationMade = true;
		studyPlace = prog;
	}

	public String getPreference(int n) {
		return preferences[n - 1];
	}

	public String toStringPrefs() {
		String s = "\nCandidate " + id + " has the following preferences:\n";
		for (int i = 0; i < preferences.length; i++) {
			s = s + "\t>> Program " + preferences[i] + " is choice " + (i + 1) + "\n";
		}
		return s;
	}

	// Parousiazei tous ipopsifious kai an topothetithikan 
	// se kapoia thesi
	public String toString() {
		String s;
		if (hasAllocation()) {
			s = id + " with score " + score + " has been allocated a place on " + studyPlace;
		} else {
			s = id + " with score " + score + " has not been allocated a place";
		}
		return s;
	}

	// Topothetei ton kathe ipopsifio sto analogo 
	// programma me tis protimiseis tou
	public void insertPrefs(Program[] ps) {
		for (int i = 0; i < ps.length; i++) {
			for (int j = 0; j < preferences.length; j++) {
				if (ps[i].getCode().equals(preferences[j]))
					ps[i].insertCandidate(this);
			}
		}
	}

	// O kathe ipopsifios eleftheronei theseis 
	// oi opies vriskontai se xamiloteri
	// protimisi apo afti pu katataxthikai
	public boolean releasePrefsBelow(String prog, Program[] ps) {
		boolean release = false;
		for (int i = 0; i < activePrefs.length; i++) {
			if (activePrefs[i] && preferences[i].equals(prog)) {
				for (int k = i + 1; k < activePrefs.length; k++) {
					for (int m = 0; m < ps.length; m++) {
						if (ps[m].getCode().equals(preferences[k]) && activePrefs[k]) {
							ps[m].removeCandidate(id);
							activePrefs[k] = false;
							release = true;
						}
					}
				}
			}
		}
		return release;
	}

}