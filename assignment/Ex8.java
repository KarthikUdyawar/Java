//Ex8
//Aim:

import java.util.Scanner;
import java.util.Vector;
//@SuppressWarnings("unchecked")

class Ex8  {
    public static void main(String[] args) {
        Vector v = new Vector(5,2);
        Scanner sc = new Scanner(System.in);
        String name, rem_name;
        int ch,i,n;
        do{
            System.out.println("-----Student Manager-----");
            System.out.println("1.Add Student Name\n2.Remove Student Name\n3.Search a Student By Index\n4.Search A Student By His Name\n5.Display All Students\n6.Exit");
            System.out.print("Enter the number of what you wanna do: ");
            ch = sc.nextInt();

            switch(ch)
            {
                case 1:
                    System.out.println("-----Enter started-----");
                    System.out.print("How many student's name you wanna enter: ");
                    n = sc.nextInt();
                    sc.nextLine();
                    for (i=0;i<n;i++){
                        System.out.print("Enter a name: ");
                        name = sc.nextLine();
                        v.addElement(name);
                    }
                    System.out.println("-----Enter finished-----");
                    break;

                case 2:
                    System.out.println("-----Remove Names-----");
                    System.out.print("How many student's name you wanna remove: ");
                    n = sc.nextInt();
                    sc.nextLine();
                    for (i=0;i<n;i++){
                        System.out.print("Enter the name you want to remove: ");
                        sc.nextLine();
                        rem_name =  sc.nextLine();
                        boolean flag = v.removeElement(rem_name);
                        if (flag){
                            System.out.println(rem_name + " is removed!");
                        }
                        else{
                            System.out.println(rem_name + " is not in our list!");
                        }
                    }
                    System.out.println("-----Remove done-----");
                    break;

                case 3:
                    System.out.println("-----Search By Index-----");
                    System.out.print("Enter the index to be shown: ");
                    i = sc.nextInt();
                    sc.nextLine();
                    try {
                        System.out.println("Name at index " + i + " is " + v.elementAt(i));
                    } catch (Exception e) {
                        System.out.println("No name at the index "+ i+"!");
                    }
                    System.out.println("-----Search Done-----");
                    break;
                case 4:
                    System.out.println("-----Search By Name-----");
                    System.out.print("Enter the name to be searched: ");
                rem_name = sc.next();
                    if(v.contains(rem_name)){
                        System.out.println(rem_name + " found in list at the index position " + v.indexOf(rem_name));
                    }
                    else{
                        System.out.println(rem_name + " is not in the list!");
                    }
                    System.out.println("-----Search Done-----");
                    break;
                case 5:
                    System.out.println("-----Showing Names-----");
                    for (i=0;i<v.size(); i++)
                    {
                        System.out.println(v.elementAt(i));
                    }
                    System.out.println("-----Finished Showing Names-----");
                    break;
                case 6:
                    System.out.println("-----Quit-----");
                    System.exit(0);

                default: System.out.println("Enter a proper input!");

            }
        }while(ch!=6);
    }
}

/*Output
-----Student Manager-----
1.Add Student Name
2.Remove Student Name
3.Search a Student By Index
4.Search A Student By His Name
5.Display All Students
6.Exit
Enter the number of what you wanna do: 1
-----Enter started-----
How many student's name you wanna enter: 3
Enter a name: Karthik
Enter a name: Sam
Enter a name: Tom
-----Enter finished-----
-----Student Manager-----
1.Add Student Name
2.Remove Student Name
3.Search a Student By Index
4.Search A Student By His Name
5.Display All Students
6.Exit
Enter the number of what you wanna do: 3
-----Search By Index-----
Enter the index to be shown: 2
Name at index 2 is Tom
-----Search Done-----
-----Student Manager-----
1.Add Student Name
2.Remove Student Name
3.Search a Student By Index
4.Search A Student By His Name
5.Display All Students
6.Exit
Enter the number of what you wanna do:
4
-----Search By Name-----
Enter the name to be searched: Sam
Sam found in list at the index position 1
-----Search Done-----
-----Student Manager-----
1.Add Student Name
2.Remove Student Name
3.Search a Student By Index
4.Search A Student By His Name
5.Display All Students
6.Exit
Enter the number of what you wanna do: 5
-----Showing Names-----
Karthik
Sam
Tom
-----Finished Showing Names-----
-----Student Manager-----
1.Add Student Name
2.Remove Student Name
3.Search a Student By Index
4.Search A Student By His Name
5.Display All Students
6.Exit
Enter the number of what you wanna do: 6
-----Quit-----
*/
