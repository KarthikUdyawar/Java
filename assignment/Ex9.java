//Ex9

import java.util.Scanner;

class Student{
    String name;
    int rno;
    Student(String n, int r){
        name = n;
        rno = r;
    }

    void display(){
        System.out.println("Name of student: " + name);
        System.out.println("Roll No: " + rno);
    }
}

class Exam extends Student{
    int m1,m2,m3;

    Exam(String n, int r, int marks1, int marks2, int marks3){
        super(n,r);
        m1 = marks1;
        m2 = marks2;
        m3 = marks3;
    }

    void display(){
        super.display();
        System.out.println("Marks of sub 1: "+ m1);
        System.out.println("Marks of sub 2: "+ m2);
        System.out.println("Marks of sub 3: "+ m3);
    }
}

class Result extends Exam{
    int total;

    Result(String n, int r, int marks1, int marks2, int marks3){
        super(n,r,marks1,marks2,marks3);
        total = marks1 + marks2 + marks3;
    }

    void display(){
        super.display();
        System.out.println("Total Marks: "+ total);
    }
}

class Ex9{
    public static void main(String[] args) {
        String n;
        int rno, m1,m2,m3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Name Of Student: ");
        n = sc.nextLine();
        System.out.print("Enter The Roll No: ");
        rno = sc.nextInt();
        System.out.println("Enter The Marks of 3 subjects: ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        System.out.println("----------Result----------");
        Result r = new Result(n, rno, m1, m2, m3);
        r.display();
        sc.close();
    }
}

/*Output
Enter The Name Of Student: Karthik
Enter The Roll No: 62
Enter The Marks of 3 subjects:
87
92
89
----------Result----------
Name of student: Karthik
Roll No: 62
Marks of sub 1: 87
Marks of sub 2: 92
Marks of sub 3: 89
Total Marks: 268
*/
