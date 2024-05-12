public class Mcm {
 

	// Matrix Ai has dimension p[i-1] x p[i]
	// for i = 1 . . . n
	static int MatrixChainOrder(int p[], int si, int ei)
	{
		if (si == ei)
			return 0;

		int min = Integer.MAX_VALUE;
		for (int k = si; k < ei; k++) {
			int count = MatrixChainOrder(p, si, k)
						+ MatrixChainOrder(p, k + 1, ei)
						+ p[si - 1] * p[k] * p[ei];

			if (count < min)
				min = count;
		}
		return min;
	}

	// Driver code
	public static void main(String args[])
	{
		int arr[] = new int[] { 1, 2, 3, 4, 3 };
		int N = arr.length;

		// Function call
		System.out.println(
			"Minimum number of multiplications is "
			+ MatrixChainOrder(arr, 1, N - 1));
	}
}


