package lesson1;
import java.util.Scanner;

/**
 * program
 */
import java.util.Scanner;

public class program {

    static public void main(String[] args){
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Enter int a:");
        boolean flag = iScanner.hasNextInt();
        System.out.println(flag);
        int x = iScanner.nextInt();
        System.out.println("Enter double b:");
        boolean flag2 = iScanner.hasNextDouble();
        System.out.println(flag2);
        double y = iScanner.nextDouble();
        System.out.printf("sum = %d+%f=%2f\n",x,y,x+y);
        iScanner.close(); 
    }
}
