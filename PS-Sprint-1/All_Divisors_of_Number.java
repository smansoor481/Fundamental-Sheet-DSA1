package com.sprint1;

public class All_Divisors_of_Number {
	public static void main(String[] args) {
		int num = 12;
		for(int i=1;i<=num;i++)
		{
			if(num % i == 0)
			{
				System.out.print(i+" ");
			}
		}
	}
}
