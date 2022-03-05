import java.util.*;

public class BubbleSort {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] nums = Arrays.stream(sc.nextLine().split(" "))
						   .mapToInt(Integer::parseInt)
						   .toArray();

		System.out.println(Arrays.toString(nums));
		System.out.println();

		for (int i = 1; i < nums.length; i++) {
			boolean swapped = true;
			for (int j = 0; j < nums.length - i; j++) {
				if (nums[j] > nums[j + 1]){
					int temp = nums[j + 1];
					nums[j + 1] = nums[j];
					nums[j] = temp;
					swapped = false;
					System.out.print(nums[j] + " <-> " + nums[j + 1] + " ");
				}
				System.out.println(Arrays.toString(nums));
			}
			if (swapped) {break;}
		}

	}
}