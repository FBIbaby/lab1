/*
 * There is one 50 RMB, one 20 RMB, two 5 RMB bills and three 1 RMB coins. 
 * Write a program to find out whether you can take out a given number (x) RMB. 
 * ������ⷽ���Ƿ��н��˼����
 * ������Ҫ50��20��5��1Ԫ�������ֱ�m,n,i,j
 * Ϊ���ж��Ƿ��ܹ��ó�������Ǯ��x
 * ֻ��Ҫ�жϷ��̣�50m + 20n + 5i + j = x�Ƿ������������Ľ�
 * ����m,n����0��1��iΪ0��1��2��jΪ0��1��2��3
 * ��������������Ľ⣬���ܹ��ó�����֮���ò���
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
