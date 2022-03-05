import java.util.*;

public class QuickSort {
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
			int pivotIdx = partition(nums, start, end);
			divide(nums, start, pivotIdx - 1);
			divide(nums, pivotIdx + 1, end);
		}
	}

	public static int partition(int[] nums, int start, int end) {

		int pivot = nums[start];
		int temp = start;

		for (int j = start + 1; j <= end; j++) {
			if (nums[j] < pivot) {
				temp++;
				swap(nums, j, temp);
			}
		}

		swap(nums, start, temp);
		return temp;
	}

	public static void swap(int[] nums, int idx1, int idx2) {
		System.out.print(nums[idx1] + " <-> " + nums[idx2] + " ");
		System.out.println(Arrays.toString(nums));
		int temp = nums[idx1];
		nums[idx1] = nums[idx2];
		nums[idx2] = temp;
	}
}