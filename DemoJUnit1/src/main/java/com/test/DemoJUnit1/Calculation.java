package com.test.DemoJUnit1;

public class Calculation {
	public static int calMax(int a[]) {
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i]) {
				max=a[i];
			}
			
		}

		return max;
	}
	public static int square(int n) {
		return (n*n);
	}

}
