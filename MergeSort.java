import java.util.*;

public class MergeSort {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] nums = Arrays.stream(sc.nextLine().split(" "))
						   .mapToInt(Integer::parseInt)
						   .toArray();

		System.out.println(Arrays.toString(nums));
		System.out.println();

		divide(nums);
		System.out.println("Sorted: " + Arrays.toString(nums));
	}

	public static void divide(int[] nums) {
		divide(nums, 0, nums.length - 1);
	}

	public static void divide(int[] nums, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			divide(nums, start, mid);
			divide(nums, mid + 1, end);
			conquer(nums, start, mid, end);
		}
	}

	public static void conquer(int[] nums, int start, int mid, int end) {

		int[] tempArray = new int[end - start + 1];
		int left = start, right = mid + 1, index = 0;

		while (left <= mid && right <= end) {
			if (nums[left] <= nums[right]) {
				tempArray[index++] = nums[left++];
			} else {
				tempArray[index++] = nums[right++];
			}
		}

		while (left <= mid) {
			tempArray[index++] = nums[left++];
		}

		while (right <= end) {
			tempArray[index++] = nums[right++];
		}

		System.out.println(Arrays.toString(tempArray));

		for (int k = 0; k < tempArray.length; k++) {
			nums[start + k] = tempArray[k];
		}

		System.out.println(Arrays.toString(nums));
		System.out.println();
	}
}