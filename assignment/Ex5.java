//Ex5
//Aim: Write a programe to implement a menu driven Calculator to perform Addition, Subtraction, Multiplication, Division functions. Create a user define package to implement the above functions and import the same to invoke the above functions.

import java.util.*;
import Cal.*;

class Ex5
{
  public static void main(String[] args)
  {
    Calculator cal = new Calculator();
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int a = sn.nextInt();
    System.out.print("Enter second number: ");
    int b = sn.nextInt();
    System.out.print("Enter an operator (+, -, *, /): ");
    char operator = sn.next().charAt(0);

    switch (operator)
    {
      case '+':
        cal.add(a,b);
        break;
      case '-':
        cal.sub(a,b);
        break;
      case '*':
        cal.mul(a,b);
        break;
      case '/':
        cal.div(a,b);
        break;
      default:
          System.out.printf("Error! operator is not correct");
          return;
    }
  }
}

/*Output
Enter first number: 45
Enter second number: 78
Enter an operator (+, -, *, /): *
Multiplication : 3510
*/
