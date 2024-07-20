package onetwo;

public class BinarySearchh {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int num = 5;

		int start = 0;
		int end = arr.length - 1;

		int mid = (start + end) / 2;

		while (start <= end) {
			if (num > arr[mid]) {
				start = mid + 1;
			} else if (num == arr[mid]) {
				System.out.println("Element present at index : " + mid);
				break;
			} else {
				end = mid - 1;
			}
			mid = (start + end) / 2;
		}

		if (start > end) {
			System.out.println(" Element not found !!");
		}
	}

}
