import java.util.Scanner;
public class functions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter int a:");
        int x = scan.nextInt();
        System.out.println(factor(x));
    }
    static double factor(int n){
        if(n==1) return 1;
        return n * factor(n-1);
    }
    }

