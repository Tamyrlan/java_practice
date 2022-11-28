package lesson1;
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
//import java.util.Scanner;

public class seminar_1 {
    public static void main(String[] args) {
        int a =2;
        int b=7;
        int c=2;
        int d=1;
        int k1=a*c;
        int k2 = a+d;
        int count =0;
        while(a<b){
            try{
                a=k1;
                count++;
            }

        }

        System.out.println(a);
        System.out.println(count);
        }
    }
//    static int find(int num1, int num2){
//     if()
//     return 0;
//    }
