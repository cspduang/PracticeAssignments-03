public class BinaryIterativeSearch implements Practice03Search {

	
	public String searchName() {
		return "Binary iterative search";
	}

	
	public int search(int[] arr, int target) {

		int low = 0;
		int high = arr.length - 1;
		int mid;

		while (low <= high) {
			mid = low + ((high - low) / 2);
			if (arr[mid] > target)
				high = mid - 1;
			else if (arr[mid] < target)
				low = mid + 1;
			else
				return mid;
		}

		return -1;
	}
}
