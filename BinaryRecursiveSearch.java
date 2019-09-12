public class BinaryRecursiveSearch implements Practice03Search {

	
	public String searchName() {
		return "Binary recursive search";
	}

	
	public int search(int[] arr, int target) {
		return search(arr, target, 0, arr.length - 1);
	}

	private int search(int[] arr, int target, int low, int high) {
		if (high < low)
			return -1;

		int mid = low + ((high - low) / 2);
		if (arr[mid] > mid)
			return search(arr, target, low, mid-1);
		else if (arr[mid] < target)
			return search(arr, target, mid+1, high);
		else
			return mid;
	}
}
