//Ex11
import java.util.Scanner;

interface Area{
    final static double pi = 3.142;
    public void compute();
}

interface Volume{
    public void compute();
}

class Circle implements Area{
    double r;
    public void compute(){
        System.out.println("Area of the circle with radius "+ r +" is: "+ (pi*r*r));
    }

}

class Sphere implements Area, Volume{
    double r;
    public void compute(){
        System.out.println("Area of the sphere with radius "+ r +" is: "+ (4*pi*r*r));
        System.out.println("Volume of the sphere with radius "+ r +" is: "+ ((4*pi*r*r*r)/3.0));
    }

}

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        System.out.print("Enter the radius for circle: ");
        c.r = sc.nextDouble();
        c.compute();
        Sphere s = new Sphere();
        System.out.print("\nEnter the radius for sphere: ");
        s.r = sc.nextDouble();
        s.compute();
        sc.close();
    }
}

/*Output
Enter the radius for circle: 7
Area of the circle with radius 7.0 is: 153.958

Enter the radius for sphere: 5
Area of the sphere with radius 5.0 is: 314.2
Volume of the sphere with radius 5.0 is: 523.6666666666666
*/
