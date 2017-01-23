/*
 * 欧几里得算法
 * 计算两个非负整数p和q的最大公约数
 */
package Gcd;
import java.util.*;
public class Gcd {
	
	public static int gcd(int p, int q)
	{
		// 使用递归实现辗转相除法
		if (q == 0)
		{
			return p;
		}
		int r = p % q;
		return gcd(q, r);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 使用Scanner来从键盘获取两个int型输入，求取最大公约数。
		Scanner reader = new Scanner(System.in);
		int p = reader.nextInt();
		int q = reader.nextInt();
		int res = gcd(p, q);
		System.out.print("这两个数的最大公约数是：" + res);

	}

}
