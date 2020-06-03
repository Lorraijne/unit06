public class Task01 {
	public static void main(String[] args) {
		final int n = 5;
		int[] mas = new int[n];
		int[][] matric = new int[5][5];

		int a1 = 1;
		int a2 = 0;

		for (int i = 0; i < matric.length; i++) {
			for (int j = 0; j < matric[i].length; j++) {
				matric[i][j] = a1 + a2;
				a2 = a1;
				a1 = matric[i][j];
			}
		}

		printArray(matric);
	}

	public static void printArray(int[][] matric) {
		System.out.println("Matrica: ");
		for (int[] i : matric) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}
}