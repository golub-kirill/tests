package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        String s = Integer.toString(number);
        int a, sum = 0;
	    for (int i = 0; i < s.length(); i++) {
		    a = Integer.parseInt(Character.toString(s.charAt(i)));
		    sum += a;
	    }
	    return sum;
    }
}