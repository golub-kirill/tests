package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        //Не люблю, но умею!
        //Красота дороже нелюбви к вложенным циклам
        int i = 1;
        int j = 1;
        while (i <= 10) {
            while (j <= 10) {
                System.out.print((i * j) + " ");
                j++;
            }
            System.out.println();
            i++;
            j = 1;
        }

    }
}
