package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws Exception {
		//напишите тут ваш код
		//Я очень плох в мат. задачах и ЭТО было тяжело.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int i = 0;

		if (a > 0) i++;
		if (b > 0) i++;
		if (c > 0) i++;

		System.out.println(i);

	}
}
