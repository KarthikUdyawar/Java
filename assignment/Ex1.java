// Ex1
//Aim: Write a program to take input for an integer from the user nd perform both bitwise right shift operations. Take input for the no. of positions to be shifted.(Use Scanner class to accept user input)

import java.util.Scanner;

class Ex1
{
	public static void main(String args[])
	{
		int n,b,res;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n = sc.nextInt();
		System.out.println("Enter the number of bits: ");
		b = sc.nextInt();

		res = n>>b;
		System.out.println(+res);
	}
}

/*Output:
Enter a number:
123
Enter the number of bits:
2
30
*/
