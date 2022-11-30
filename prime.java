package prime.java;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		num=sc.nextInt();
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=0;
				break;
			}
			
		}
		if(flag==0||num==1)
		{
			System.out.println("number is prime");
		}
		else
		{
			System.out.println("number is not prime");
		}

	}

}
