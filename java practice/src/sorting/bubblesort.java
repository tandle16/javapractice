package sorting;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 19, 10, 5, 4, 2, 57, 1, 93, 27 };
		int l = a.length;
		for (int i = 0; i < l; i++) {
			for (int j = i + 1; j < l; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
				// System.out.println(a[j]);
				// System.out.println(a[i]);
			}
			for (int k = 0; k < l; k++) {
				System.out.print(a[k] + " ");
			}
			System.out.println();

		}
		System.out.println();
		for (int i = 0; i < l; i++) {
			for (int j = i + 1; j < l; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}
			for (int k = 0; k < l; k++) {
				System.out.print(a[k] + " ");
			}
			System.out.println();
		}

	}
}
