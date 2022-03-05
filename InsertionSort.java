import java.util.*;

public class InsertionSort {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] nums = Arrays.stream(sc.nextLine().split(" "))
						   .mapToInt(Integer::parseInt)
						   .toArray();

		System.out.println(Arrays.toString(nums));
		System.out.println();

		for (int i = 1; i < nums.length; i++) {
			int smallest = nums[i];
			int j;
			for (j = i - 1; j >= 0 && nums[j] > smallest; j--) {
				nums[j+1] = nums[j];
			}
			nums[j+1] = smallest;
			System.out.println(Arrays.toString(nums));
		}
	}
}