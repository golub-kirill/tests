package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //напишите тут ваш код

        //Делаем Массив
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        //Изи сортировка
        Arrays.sort(arr);
        for (int anArr : arr) {
            System.out.println(anArr);
        }
    }
}

