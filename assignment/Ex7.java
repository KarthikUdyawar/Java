//Ex7
//Aim: Write a programe to capitalize the first Character of each word from a give sentence.

import java.util.*;

public class Ex7 {
    static String capitalize(String str){
        StringBuffer s = new StringBuffer();

        char ch = ' ';
        for (int i = 0; i < str.length(); i++){
            if (ch == ' ' && str.charAt(i) != ' '){
                s.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                s.append(str.charAt(i));
            }
            ch = str.charAt(i);
        }

        return s.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println("Enter a string which you want to capitalize: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("You entered: " + str);
        String cap_str = capitalize(str);
        System.out.println("Capitalized String is: "+cap_str);
        sc.close();

    }
}

/*Output
Enter a string which you want to capitalize:
all the best
You entered: all the best
Capitalized String is: All The Best
*/
