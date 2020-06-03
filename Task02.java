import java.util.Random;
import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {

		final int n = 5;
		int lenght = 0;

		System.out.println("Введите число строк");
		lenght = readFromConsole();

		int[][] matric = new int[lenght][n];

		countArray(matric);
		printArray(matric);

		int[] mas = new int[lenght];

		for (int k = 0; k < n; k++) {
			countMas(mas, k, matric, lenght);
			bubbleSort(mas);
			swapMas(mas, k, matric, lenght);
		}

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

	public static void printArray(int[][] mas) {
		System.out.println("\nMatrica: ");
		for (int[] i : mas) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

	public static void printMas(int[] mas) {
		System.out.println("\nMat: ");

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println();
	}

	public static void countArray(int[][] matric) {
		Random rand = new Random();

		for (int i = 0; i < matric.length; i++) {
			for (int j = 0; j < matric[i].length; j++) {
				matric[i][j] = rand.nextInt(10);
			}
		}

	}

	public static void countMas(int[] mas, int j, int[][] matric, int length) {

		for (int i = 0; i < length; i++) {
			mas[i] = matric[i][j];
		}

	}

	public static void swapMas(int[] mas, int j, int[][] matric, int length) {

		for (int i = 0; i < length; i++) {
			matric[i][j] = mas[i];
		}

	}

	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
				}
			}
		}
	}

}
