package Conditional;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int day;

        Scanner s = new Scanner(System.in);
        System.out.println("Please, enter number from 1 to 7");

        day = s.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
        if (day>7){
            System.out.println("Week has 7 days only");
        }else {
            System.out.println("Do you know that week has more days?");
        }
    }
}

