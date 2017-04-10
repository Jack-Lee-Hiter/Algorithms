package leetCode;

/*
 * Reverse digits of an integer.
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 * click to show spoilers.
 * Note:
 * The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.
 */

public class reverseInteger {
	// If overflow exists, the new result will not equal previous one.
	// No flags needed. No hard code like 0xf7777777 needed.
	public static int reverse(int x)
	{
	    int result = 0;

	    while (x != 0)
	    {
	        int tail = x % 10;
	        int newResult = result * 10 + tail;
	        if ((newResult - tail) / 10 != result)
	        { 
	        	return 0; 
	        }
	        result = newResult;
	        x = x / 10;
	    }

	    return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = -123;
		int res = reverse(x);
		System.out.println(res);
	}

}
