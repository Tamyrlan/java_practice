import java.util.Scanner;
public class task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("int a:");
        int a = sc.nextInt();
        System.out.println("int b:");
        int b = sc.nextInt();
        sc.close();
    }

    static int taskOne(int a, int b){
        int c = 2;
        int d = 1;
        if (a == b) return 1;
        if (a > b) return 0;
        else return taskOne(a+d, b) + taskOne(a*c, b);
    }
}