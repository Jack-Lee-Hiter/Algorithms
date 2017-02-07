
package BinarySearch;
import java.util.Arrays;
public class BinarySearch {
	// 递归实现二分查找
	public static int rank(int key, int[] a)
	{
		return rank(key, a, 0, a.length-1);
	}
	public static int rank(int key, int[] a, int lo, int hi)
	{
		if (lo > hi)
		{
			return -1;
		}
		int mid = (lo + hi) / 2;
		if (key < a[mid])
		{
			return rank(key, a, lo, mid - 1);
		}
		else if (key > a[mid])
		{
			return rank(key, a, mid + 1, hi);
		}
		else
		{
			return mid;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2, 3, 10, 52, 71, 89};
		int key = 52;
		int res = rank(52, a);
		System.out.println(res + 1);

	}

}
