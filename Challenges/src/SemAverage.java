
public class SemAverage {

	public static void main(String args[]) {
		int sem[] = new int[100];
		int les[] = new int[100];
		double pm[] = new double[100];
		double grade[] = new double[100];
		int count = 0;
		int maxSem = 1;
		double grandTotal = 0;
		while (!StdIn.isEmpty()) {
			sem[count] = StdIn.readInt();
			les[count] = StdIn.readInt();
			pm[count] = StdIn.readDouble();
			grade[count] = StdIn.readDouble();
			if (sem[count] > maxSem) {
				maxSem = sem[count];
			}
			count++;
		}
		for (int i = 1; i <= maxSem; i++) {
			System.out.println("Semester " + i);
			System.out.println("Course\tCredits\tResults");
			double totalC = 0;
			double totalG = 0;
			double total = 0;
			for (int j = 0; j < count; j++) {
				if (sem[j] == i) {
					boolean addCourse = true;
					for (int k = 0; k < count; k++) {
						if (les[j] == les[k] && sem[j] < sem[k])
							addCourse = false;
					}
					if (addCourse) {
						System.out.println(les[j] + "\t" + pm[j] + "\t" + grade[j]);
						totalG = totalG + grade[j] * pm[j];
						totalC = totalC + pm[j];
					}
				}
			}
			total = totalG / totalC;
			grandTotal += total;
			System.out.printf("Semester %d average is %.2f\n\n", i, total);
		}
		System.out.printf("Total weighted average is: %.2f", grandTotal / maxSem);

	}

}
