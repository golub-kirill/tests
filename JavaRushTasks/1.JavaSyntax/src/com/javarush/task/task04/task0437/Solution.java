package com.javarush.task.task04.task0437;


/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 10; i > 0; i--) {
            for (int j = 0; j < 10 - i + 1; j++) {
                System.out.print(8);
            }
            System.out.println("");
        }

    }
}
