import java.util.Random;
import java.util.Scanner;

public class MainTask04 {

	public static void main(String[] args) {

		int lenghtn = 0;
		int lenghtm = 0;

		System.out.println("Введите размеры матрицы");
		lenghtn = readFromConsole();
		lenghtm = readFromConsole();

		int[][] matric = new int[lenghtn][lenghtm];

		countArray(matric);
		printArray(matric);
		countSum(matric);
		findMax(matric);
		replace(matric);
		System.out.println("nМатрица после перестановки макс и мин элемента");
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
		Random rand = new Random();
		int temp = -5;
		for (int i = 0; i < matric.length; i++) {
			for (int j = 0; j < matric[i].length; j++) {
				matric[i][j] = temp + rand.nextInt(20);
			}
		}
	}

	public static void countSum(int[][] matric) {

		int sum = 0;
		for (int i = 0; i < matric.length; i++) {
			for (int j = 0; j < matric[i].length; j++) {
				if (matric[i][j] < 0) {
					sum = sum + matric[i][j];
				}
				;
			}
			System.out.println("Сумма отрицательных элементов строки " + (i + 1) + " = " + sum);
			sum = 0;
		}
	}

	public static void findMax(int[][] matric) {
		int temp = -99;
		for (int i = 0; i < matric.length; i++) {
			for (int j = 0; j < matric[i].length; j++) {
				if (matric[i][j] > temp) {
					temp = matric[i][j];
				}
				;
			}
			System.out.println("Максимальный элемент в строке " + (i + 1) + " = " + temp);
			temp = 0;
		}
	}

	public static void replace(int[][] matric) {

		int max[] = new int[3];
		max[0] = -99;

		int min[] = new int[3];
		min[0] = 99;

		for (int i = 0; i < matric.length; i++) {
			for (int j = 0; j < matric[i].length; j++) {
				if (matric[i][j] > max[0]) {
					max[0] = matric[i][j];
					max[1] = i;
					max[2] = j;
				}
				;
				if (matric[i][j] < min[0]) {
					min[0] = matric[i][j];
					min[1] = i;
					min[2] = j;
				}
			}
			;
		}
		matric[max[1]][max[2]] = min[0];
		matric[min[1]][min[2]] = max[0];

	}

	public static void printArray(int[][] mas) {
		System.out.println("\nMatrica: ");
		for (int[] i : mas) {
			for (int j : i) {
				System.out.printf("%5d ", j);
			}
			System.out.println();
		}

	}
}
// Молодец! Хорошо решены задания. Замечаний нет.
