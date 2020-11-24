//Ex13
class Digits extends Thread
{
  public void run()
  {
    for(int i=1;i<=10;i++)
    {
      System.out.print(i);
      try
      {
        Thread.sleep(500);
      }
      catch(Exception e)
      {

      }
    }
  }
}

class Alphabet implements Runnable // extends Thread
{
  public void run()
  {
    for(int i=1;i<=10;i++)
    {
      System.out.print((char)(64+i));
      try
      {
        Thread.sleep(550);
      }
      catch(Exception e)
      {

      }
    }
  }
}

class Ex13
{
  public static void main(String arg[])
  {
    System.out.println("Multithreading using two child threads");
    Digits d = new Digits();
    d.start();

    Alphabet a = new Alphabet();
    Thread t = new Thread(a);
    t.start();
  }
}

/*Output
Multithreading using two child threads
1A2B3C4D5E6F7G8H9I10J
*/
