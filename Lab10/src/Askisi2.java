
public class Askisi2 {
	public static final int NUM_OF_COURSES = 3;
	public static final int NUM_OF_STUDENTS = 5;
	public static double[] MesosKataMathiti(int arr[][]) {
		double Mathitis[] = new double[NUM_OF_STUDENTS];
		for(int i = 0 ; i < NUM_OF_STUDENTS; i++) {
			Mathitis[i] = 0;
			for(int j = 0 ; j < NUM_OF_COURSES; j++) {
				Mathitis[i] += arr[i][j];
			}
			Mathitis[i] = Mathitis[i]/NUM_OF_COURSES;
		}
		return Mathitis;
	}
	public static double[] MesosKataMathima(int arr[][]) {
		double Mathima[] = new double[NUM_OF_COURSES];
		for(int j = 0 ; j < NUM_OF_COURSES; j++) {
			Mathima[j] = 0;
			for(int i = 0 ; i < NUM_OF_STUDENTS; i++) {
				Mathima[j] += arr[i][j];
			}
			Mathima[j] = Mathima[j]/NUM_OF_STUDENTS;
		}
		return Mathima;
	}
	public static void main(String[] args) {
		int arr2d[][] = new int[NUM_OF_STUDENTS][NUM_OF_COURSES];
		for(int i = 0 ; i < NUM_OF_STUDENTS; i++) {
			for(int j = 0 ; j < NUM_OF_COURSES; j++) {
				System.out.print("Give grade " + (j + 1) + " for student " + (i + 1) + ": ");
				arr2d[i][j] = StdIn.readInt();
			}
		}
		double[] mathiti = MesosKataMathiti(arr2d);
		System.out.println("\nMesoi oroi ana mathiti:");
		for(int i = 0 ; i < NUM_OF_STUDENTS; i++) {
			System.out.printf("Mathitis %d : %.2f\n",(i + 1),mathiti[i]);
		}
		double[] mathima = MesosKataMathima(arr2d);
		System.out.println("\nMesoi oroi ana mathiti:");
		for(int i = 0 ; i < NUM_OF_COURSES; i++) {
			System.out.printf("Mathima %d : %.2f\n",(i + 1),mathima[i]);
		}
	}

}
