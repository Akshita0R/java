package calc.java;
import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,temp=0;
		char op;
		do
		{ 
			System.out.println("enter the operator");
			op= sc.next().charAt(0);
			if(op=='+'||op=='-'||op=='/'||op=='*')
			{   
				System.out.println("enter the 2 numbers:");
				a=sc.nextInt();
				b=sc.nextInt();
				switch(op)
				{
				case '+':
					System.out.println("The result of 2 numbers is"+(a+b));
					break;
				case '-':
					System.out.println("The result of 2 numbers is"+(a-b));
					break;
				case '/':
					System.out.println("The result of 2 numbers is"+(a/b));
					break;
				case '*':
					System.out.println("The result of 2 numbers is"+(a*b));
					break;
				default:
					System.out.println("ente invalid operator");
					break;
					
	      	}
				System.out.println("if you want to enter again enter 1 and if you want to exit then enter 0");
				temp=sc.nextInt();
				
			}
			else
				System.out.println("ente invalid operator");
		}while(temp!=0);
	}

}
