import java.util.Scanner;

public class MainTask03 {

	public static void main(String[] args) {

		int lenght = 0;

		System.out.println("Введите число строк");
		lenght = readFromConsole();

		int[][] matric = new int[lenght][lenght];

		countArray(matric);
		printArray(matric);
	}

	public static int readFromConsole() {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt() == false) {
			String str = sc.next();
			System.out.println("Вы ввели '" + str + "', а нужно число строк");
			System.out.print("Попробуйте ещё раз ");
		}
		return sc.nextInt();

	}

	public static void countArray(int[][] matric) {

		int n = matric.length - 1;
		for (int i = 0; i < matric.length / 2; i++) {
			for (int j = 0; j < matric.length / 2; j++) {
				int count = 0;
				if (i > j) {
					count = 0;
				} else {
					count = 1;
				}
				matric[i][j] = count;
				matric[i][n - j] = count;
				matric[n - i][j] = count;
				matric[n - i][n - j] = count;
			}
		}
	}

	public static void printArray(int[][] mas) {
		System.out.println("\nMatrica: ");
		for (int[] i : mas) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}
}
