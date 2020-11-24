//Ex2
//Aim: Write a programe to generte prime no. between 100 to 500.

class Ex2
{
  public static void main (String[] args)
  {
    int i = 0;
    int num = 0;
    String prime = "";

    for (i = 100; i <= 500; i++)
    {
      int count=0;
      for(num = i; num >= 1; num--)
      {
        if(i%num==0)
        {
          count = count + 1;
        }
      }
      if (count==2)
      {
        prime = prime + i + " ";
      }
    }
    System.out.println("Prime numbers from 100 to 500 are :");
    System.out.println(prime);
  }
}

/*Output:
Prime numbers from 100 to 500 are :
101 103 107 109 113 127 131 137 139 149 151 157 163 167 173 179 181 191 193 197 199 211 223 227 229 233 239 241 251 257 263 269 271 277 281 283 293 307 311 313 317 331 337 347 349 353 359 367 373 379 383 389 397 401 409 419 421 431 433 439 443 449 457 461 463 467 479 487 491 499
*/
