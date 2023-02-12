import java.util.*;

class Q4_SubArrays {
	public static void print_subArrays(int[] A) {

		List<Integer> list;
		list = new ArrayList<Integer>();
		for (int i = 0; i < A.length; i++) {
			int sum = 0;
			list.removeAll(list);
			for (int j = i; j < A.length; j++) {
				sum += A[j];
				list.add(A[j]);
				if (sum == 0) {
					System.out.println("Sub-arrays with 0 sum : " + list.toString());

				}
			}
		}
	}

	public static void main(String[] args) {
		int[] num_list = { 1, 3, -7, 3, 2, 3, 1, -3, -2, -2 };
		System.out.println("\nOriginal array: " + Arrays.toString(num_list));
		print_subArrays(num_list);

		int[] num_list2 = { 1, 2, -3, 4, 5, 6 };
		System.out.println("\nOriginal array: " + Arrays.toString(num_list2));
		print_subArrays(num_list2);

		int[] num_list3 = { 1, 2, -2, 3, 4, 5, 6 };
		System.out.println("\nOriginal array: " + Arrays.toString(num_list3));
		print_subArrays(num_list3);
	}
}