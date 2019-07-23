import java.util.Scanner;
public class DerangementProblemB {

	public static void swap(int[] arr, int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int N = stdin.nextInt();
		int arr[] = new int[N];
		int circle[] = new int[N];
		int max, p = 0;
		double aver, sum = 0;
		while (stdin.hasNext()) {
			for (int i = 0; i < N; i++) {
				circle[i] = 1;
				arr[i] = stdin.nextInt();
			}
			for (int k = 0; k < arr.length; k++) {
				System.out.print(arr[k] + " ");
			}
			System.out.println();
			for (int i = 0; i < N; i++) {
				while (arr[i] != i + 1) {
					for (int j = 0; j < N; j++) {
						if (j + 1 == arr[i]) {
							swap(arr, i, j);
							circle[i] += 1;
						}
					}
				}
			}
			p++;
			max = circle[0];
			for (int i = 0; i < circle.length; i++) {
				if (circle[i] > max) {
					max = circle[i];
				}
				System.out.print(circle[i] + " ");
			}
			sum += max;
			System.out.println();
			System.out.println(max);
		}
		aver = sum/p;
		System.out.printf("O mesos oros einai : %.2f\n", aver);	
		System.out.println();
		stdin.close();
	}

}
