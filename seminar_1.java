// task1:
// На вход некоторому исполнителю
// подаётся два числа (a, b).

// У исполнителя есть две команды
// - команда 1 (к1): увеличить в с раз (xC), а умножается на c
// - команда 2 (к2): увеличить на d ( +d ), к a прибавляется d
// написать программу, которая выдаёт общее количество
// возможных преобразований a в b.

// a < b; a, b, c, d - натуральные

// Пример 1: а = 2, b = 7, c = 2, d = 1 ответ 3

// Подумать как можно показать хотя бы один маршрут преобразования

// ответ: (+1) (x2) (+1) или (х2) (+1) (+1) (+1)
// Пример 2: а = 11, b = 7, c = 2, d = 1
// ответ: нет решения.
import java.util.Scanner;

public class seminar_1 {
    public static void main(String[] args) {
        userInput();
        find();
    }
   static void userInput(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter int a:");
    int num1 = scan.nextInt();
    System.out.println("Enter integer b:");
    int num2 = scan.nextInt();
    System.out.printf("a:%d and b:%d",num1,num2);
    scan.close();
   }
   static int find(int num1, int num2){
    
    return 0;
   }
}
