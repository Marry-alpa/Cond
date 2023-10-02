package Conditional;

import java.util.Scanner;

public class IfElse {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            System.out.println("Enter you name");
            String name = s.next();

            System.out.println("Your age");
            int age = s.nextInt();

            if (age > 18){
                System.out.println(name + "You can visit this system.");
            } else if (age < 18) {
                System.out.println("Sorry, you can not visit the system.");
                int whenCan = 18-age;
                System.out.println("You can try after "+whenCan+" years");
            }else{
                System.out.println("First year how you can visit the system.");
            }

        }
    }
