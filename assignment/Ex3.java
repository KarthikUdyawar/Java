//Ex3
//Aim: Define a class to record the bank details of a customer (name, accNo, balance) and define methods getData(), displayData() appropriately. Also define constructors to initialize the object. Demonstrate the methods in Bank class by defining an object in main().

import java.util.*;
class Customer
{
	String name;
	int accNo;
	double balance;

	Customer() // Default constructor
	{

	}

	Customer(String n)
	{
		name = n;
	}

	Customer(String n, int a)
	{
		name = n;
		accNo = a;
	}

	Customer (String n, int a, double b)
	{
		name = n;
		accNo = a;
		balance = b;
	}

	void getData()
  {
	Scanner sc = new Scanner(System.in);
	System.out.print("\nEnter Name : ");
	name = sc.nextLine();
	System.out.print("\nEnter account no : ");
	accNo = sc.nextInt();
	System.out.print("\nEnter balance : ");
	balance = sc.nextDouble();
  }

  void displayData()
  {
	System.out.println("\nName : "+name);
	System.out.println("Account number :"+accNo);
	System.out.println("Balance : "+balance);
  }

}//end of class customer

class Ex3
{
	public static void main(String args[])
	{
		Customer c1 = new Customer();
		System.out.println("\nCustomer 1: ");
		c1.displayData();
		Customer c2 = new Customer("Bob");
		System.out.println("\nCustomer 2: ");
		c2.displayData();
		Customer c3 = new Customer("San",123);
		System.out.println("\nCustomer 3: ");
		c3.displayData();
		Customer c4 = new Customer("Tom",456,100000);
		System.out.println("\nCustomer 4:");
		c4.displayData();
		Customer c5 = new Customer();
		c5.getData();
		c5.displayData();
	}
}

/*Output

Customer 1:

Name : null
Account number :0
Balance : 0.0

Customer 2:

Name : Bob
Account number :0
Balance : 0.0

Customer 3:

Name : San
Account number :123
Balance : 0.0

Customer 4:

Name : Tom
Account number :456
Balance : 100000.0

Enter Name : Karthik

Enter account no : 1547

Enter balance : 150000

Name : Karthik
Account number :1547
Balance : 150000.0
*/
