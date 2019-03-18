/*
 * There is one 50 RMB, one 20 RMB, two 5 RMB bills and three 1 RMB coins. 
 * Write a program to find out whether you can take out a given number (x) RMB. 
 * 利用求解方程是否有解的思想解决
 * 假设需要50，20，5，1元的数量分别m,n,i,j
 * 为了判断是否能够拿出给定的钱数x
 * 只需要判断方程：50m + 20n + 5i + j = x是否有满足条件的解
 * 其中m,n等于0或1，i为0或1或2，j为0或1或2或3
 * 如果有满足条件的解，则能够拿出，反之则拿不出
 */
package cn.scstju.st;

public class HaveMoney {
	public String ifHaveMoney(int x){
		for (int m = 0; m <= 1; m++) {
			for (int n = 0; n <= 1; n++) {
				for (int i = 0; i <= 2; i++) {
					for (int j = 0; j <= 3; j++) {
						if(50*m+20*n+5*i+j==x)
							return "Yes";
					}
				}
			}
		}
		return "No";
	}
}
