//Ex10

abstract class Shape
{
	abstract void numberofSides();
	void display()
	{
		System.out.println("This is a non-abstract method of class Shape");
	}
}

class Trapezoid extends Shape
{
	int n;
	Trapezoid()
	{
		n=4;
	}
	void numberofSides()
	{
			System.out.println("Trapezoid has " +n+ " sides");
	}
}

class Triangle extends Shape
{
	int n;
	Triangle()
	{
			n=3;
	}

	void numberofSides()
	{
			System.out.println("Triangle has " +n+ " sides");
	}
}

class Hexagon extends Shape
{
	int n;
	Hexagon()
	{
		n=6;
	}
	void numberofSides()
	{
			System.out.println("Hexagon has " +n+ " sides");
	}
}

class Ex10
{
	public static void main(String args[])
	{
		Shape s;
		s = new Trapezoid();
		Trapezoid tp = new Trapezoid();
		tp.numberofSides();
		s = new Triangle();
		Triangle t = new Triangle();
		t.numberofSides();
		s = new Hexagon();
		Hexagon h = new Hexagon();
		h.numberofSides();
	}
}

/*Output
Trapezoid has 4 sides
Triangle has 3 sides
Hexagon has 6 sides
*/
