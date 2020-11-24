//Ex12
import java.util.*;

class InvalidMonthNumberException extends Exception{
    String msg;
    InvalidMonthNumberException(){
        msg = "INVALID Month Number, Please Enter a VALID number between 1 and 12";
    }
}

public class Ex12 {
    public static void main(String[] args) {
        int m;
        String[] month = {"January","Febuary","March","April","May","June","July","August","September","October","November","December"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a month number: ");
        m = sc.nextInt();
        sc.close();
        try{
            if(m>=1 && m<= 12){
                System.out.println("It is a VALID number and month is "+month[m-1]);
            }
            else{
                throw new InvalidMonthNumberException();
            }
        }
        catch(InvalidMonthNumberException e){
            System.out.println(e.msg);
        }
        finally{
            System.out.println("Irrespective of your month number, FINALLY is always executed");
        }
    }
}

/*Output
Enter a month number: 11
It is a VALID number and month is November
Irrespective of your month number, FINALLY is always executed
*/
