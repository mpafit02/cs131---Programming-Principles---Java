public class CSet {
	protected static final int ALPHABET = 26;
	/* Το πεδίο size δίνει το πλήθος των στοιχείων του υπό αναφορά συνόλου */
	private int size;
	/*
	 * Το πεδίο elements δίνει τα στοιχεία του υπό αναφορά συνόλου. Είναι ένας
	 * πίνακας, οι είσοδοι του οποίου αντιστοιχούν στους 26 γραμματικούς χαρακτήρες
	 * a, b, .., z. Οι χαρακτήρες που περιλαμβάνονται στο σύνολο επισημαίνονται με
	 * true στις 7 σχετικές εισόδους. Συνεπώς το σύνολο δεν μπορεί να περιλαμβάνει
	 * τον ίδιο χαρακτήρα πέραν της μιας φοράς
	 */
	private boolean[] elements = new boolean[ALPHABET];

	/* Να οριστούν οι ακόλουθες μέθοδοι αναφοράς */
	/*
	 * Ο πιο κάτω (πρώτος) κατασκευαστής δημιουργεί κενό ή πλήρες (καθολικό) σύνολο
	 * σύμφωνα με την τιμή της παραμέτρου empty
	 */
	public CSet(boolean empty) {
		for (int i = 0; i < ALPHABET; i++) {
			elements[i] = empty;
		}
		if (empty) {
			size = 0;
		} else {
			size = 26;
		}
	}

	/*
	 * Ο πιο κάτω (δεύτερος) κατασκευαστής δημιουργεί σύνολο από τον κάθε ξεχωριστό
	 * γραμματικό χαρακτήρα, και μόνο, που περιλαμβάνεται στη γραμματοσειρά cs, όπου
	 * τυχόν κεφαλαία γράμματα μετατρέπονται στα αντίστοιχα μικρά.
	 */
	public CSet(String cs) {
		char c = 'a';
		cs = cs.toLowerCase();
		for (int i = 0; i < cs.length(); i++) {
			for (int j = 0; j < elements.length; j++) {
				if (cs.charAt(i) == c && !elements[i]) {
					elements[i] = true;
					size++;
				}
				c++;
			}
		}
	}

	/*
	 * Ο πιο κάτω (τρίτος) κατασκευαστής δημιουργεί σύνολο αντιγράφοντας το σύνολο s
	 * (copy constructor). Να οριστεί βάσει του δεύτερου κατασκευαστή.
	 */
	public CSet(CSet s) {
		for (int i = 0; i < ALPHABET; i++) {
			elements[i] = s.elements[i];
		}
		size = s.size;
	}

	/* Επιστρέφει το πλήθος των στοιχείων του υπό αναφορά συνόλου */
	public int Size() {
		return size;
	}

	/*
	 * Μετατρέπει το υπό αναφορά σύνολο σε εκτυπώσιμη μορφή, δηλαδή την ακολουθία,
	 * σε αλφαβητική σειρά, των γραμματικών χαρακτήρων που το απαρτίζουν
	 */
	public String toString() {
		char c = 'a';
		String s = "";
		for (int i = 0; i < ALPHABET; i++) {
			if (elements[i]) {
				s += c;
			}
			c++;
		}
		return s;
	}

	/*
	 * Προσθέτει το χαρακτήρα c στο υπό αναφορά σύνολο, νοουμένου ότι είναι μικρό ή
	 * κεφαλαίο γράμμα
	 */
	public void insertMember(char c) {
		c = Character.toLowerCase(c);
		char chr = 'a';
		for (int i = 0; i < ALPHABET; i++) {
			if (c == chr && !elements[i]) {
				elements[i] = true;
				size++;
			}
			c++;
		}
	}

	/*
	 * Διαγράφει το χαρακτήρα c από το υπό αναφορά σύνολο, νοουμένου ότι ο c ανήκει
	 * στο σύνολο
	 */
	public void deleteMember(char c) {
		c = Character.toLowerCase(c);
		char chr = 'a';
		for (int i = 0; i < ALPHABET; i++) {
			if (c == chr && elements[i]) {
				elements[i] = false;
				size--;
			}
			c++;
		}
	}

	/* Ανήκει ο χαρακτήρας c στο υπό αναφορά σύνολο; */
	public boolean isMember(char c) {
		boolean flag = false;
		c = Character.toLowerCase(c);
		char chr = 'a';
		for (int i = 0; i < ALPHABET; i++) {
			if (c == chr && elements[i]) {
				flag = true;
			}
			c++;
		}
		return flag;
	}

	/*
	 * Περιλαμβάνει το υπό αναφορά σύνολο τα ίδια στοιχεία με το σύνολο cs; Ο
	 * ορισμός να μην κάνει χρήση του πεδίου elements.
	 */
	public boolean equal(CSet cs) {
		return this.toString().equals(cs.toString());
	}
	/*
	 * Είναι το σύνολο cs υποσύνολο του υπό αναφορά συνόλου; Ο ορισμός να μην κάνει
	 * χρήση του πεδίου elements.
	 */

	public boolean subset(CSet cs) {
		return this.toString().contains(cs.toString());
	}

	/*
	 * Επιστρέφει το σύνολο που είναι η ένωση του υπό αναφορά συνόλου με το σύνολο
	 * cs. Ο ορισμός να μην κάνει χρήση του πεδίου elements.
	 */
	public CSet union(CSet cs) {
		CSet s = new CSet(this.toString() + cs.toString());
		return s;
	}

	/*
	 * Επιστρέφει το σύνολο που είναι η τομή του υπό αναφορά συνόλου με το σύνολο
	 * cs.
	 */
	public CSet intersection(CSet cs) {
		char c = 'a';
		CSet s = new CSet(false);
		for (int i = 0; i < ALPHABET; i++) {
			if (this.isMember(c) && cs.isMember(c)) {
				s.insertMember(c);
			}
		}
		return s;
	}

	/*
	 * Επιστρέφει το σύνολο που είναι η διαφορά του υπό αναφορά συνόλου με το σύνολο
	 * cs.
	 */
	public CSet difference(CSet cs) {
		return this.intersection(cs);
	}

	/*
	 * Επιστρέφει το σύνολο που είναι η διαφορά του καθολικού συνόλου από το υπό
	 * αναφορά σύνολο
	 */
	public CSet complement() {
		CSet s = new CSet(true);
		return s.intersection(this);

	}

	public static void main(String[] args) {
		CSet cs = new CSet(true);
		System.out.print(cs);
		System.out.println();
		System.out.println();
		CSet xs = new CSet(false);
		xs.insertMember('a');
		xs.insertMember('w');
		xs.insertMember('b');
		xs.deleteMember('y');
		xs.deleteMember('w');
		CSet as = new CSet(xs);
		System.out.print("as = " + as);
		System.out.print("\n\n");
		CSet ys = new CSet("elpida"), ps = new CSet("papailiou");
		System.out.println(ys.complement());
		System.out.println(ps.complement());
		System.out.println("cs = " + cs.complement());
		CSet[] A = new CSet[1];
		A[0] = new CSet(cs);
		CSet[] B = new CSet[1];
		B[0] = new CSet(as);
		// CSet [] C = concat(A, B);
		System.out.print("\n\n" + cs.toString());
		System.out.print("\n\n" + as.toString());
		// for (int i = 0; i < C.length; i++)
		// System.out.print("\n\n" + C[i].toString() + "\n\n");
		// CSet xs = new CSet(args[0]);
		// CSet [] ps = powerSet(xs);
		// for (int i = 0; i < ps.length; i++)
		// System.out.print("\nps-" + i + " -> " + ps[i].toString());
		System.out.print("\n\nEND\n\n");
	}
}
