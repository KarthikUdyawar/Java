//Exp6
//Aim: Write a programe to take input for 'N' integer in an array and display only those integers that are greater than the average of all integers.

import java.util.*;

public class Ex6 {
    public static void main(String[] args) {
        int n,i, sum;
        double avg;
        System.out.print("Enter the length of the array: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        sum = 0;
        System.out.println("Enter the " + n + " elements for the array:");
        for (i=0; i<n; i++){
            a[i] = sc.nextInt();
            sum += a[i];
        }

        avg = ((double)sum/n);

        System.out.println("Array elements which are greater than the average " + avg + " is");
        for (i=0; i<n; i++){
            if (a[i] > avg){
                System.out.print(a[i]+"\t");
            }
        }
        sc.close();

    }
}

/*Output
Enter the length of the array: 5
Enter the 5 elements for the array:
4
5
7
2
0
Array elements which are greater than the average 3.6 is
4       5       7
*/
