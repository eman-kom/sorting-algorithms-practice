import java.util.*;

public class SelectionSort {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] nums = Arrays.stream(sc.nextLine().split(" "))
						   .mapToInt(Integer::parseInt)
						   .toArray();

		System.out.println(Arrays.toString(nums));
		System.out.println();

		for (int i = 0; i < nums.length; i++) {
			int index = i;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] < nums[index]) {
					index = j;
				}
			}
			System.out.print(nums[index] + " <-> " + nums[i] + " ");
			int temp = nums[i];
			nums[i] = nums[index];
			nums[index] = temp;
			System.out.println(Arrays.toString(nums));
		}
	}
}