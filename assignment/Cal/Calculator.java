package Cal;
import java.util.*;
public class Calculator
{
  public void add(int a,int b)
 {
   int res;
   res=a+b;
   System.out.println("Addition : " +res);
 }

 public void sub(int a, int b)
 {
   int res;
   res=a-b;
   System.out.println("Subtraction : "+res);
 }

 public void mul(int a,int b)
 {
   int res;
   res=a*b;
   System.out.println("Multiplication : " +res);
 }

 public void div(int a,int b)
 {
	 int res;
	 res=a/b;
	 System.out.println("Division : " +res);
  }
}
