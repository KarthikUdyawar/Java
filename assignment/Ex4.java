//Ex4
//Aim: Write a program to add tro numbers (two integer,two floating points, one integer and one float) using method overloading.

class Addition{
  public int add(int a, int b){
      int sum = a+b;
      return sum;
  }
  public double add(int a, double b){
      double sum = a+b;
      return sum;
  }
  public double add(double a, double b){
      double sum = a+b;
      return sum;
  }
}

class Ex4 {
  public static void main (String[] args) {
      Addition ob = new Addition();
      int sum1 = ob.add(1,2);
      System.out.println("sum of the three integer value :" + sum1);
      double sum2 = ob.add(1,2.5);
      System.out.println("sum of the three integer value :" + sum2);
      double sum3 = ob.add(1.0,2.0);
      System.out.println("sum of the three double value :" + sum3);
  }
}
