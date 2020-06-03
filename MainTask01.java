import java.util.Scanner;

public class MainTask01 {

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
			System.out.println("Вы ввели '" + str + "', а нужно Четное число строк");
			System.out.print("Попробуйте ещё раз ");
		}

		return sc.nextInt();

	}
	public static void countArray(int[][] matric) {

		for (int i = 0; i < matric.length; i++) {
			for (int j = 0; j < matric.length; j++) {
				matric[i][j] = 0;

				if (i == 0 || i == (matric.length - 1)) {
					matric[i][j] = 1;
				}
				if (j == 0 || j == (matric.length - 1)) {
					matric[i][j] = 1;
				}

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
