package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] bigArray = new int[20];
        int[] smallArray1 = new int[10];
        int[] smallArray2 = new int[10];

        for (int i = 0; i < bigArray.length; i++) {
            bigArray[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < bigArray.length / 2; i++) {
            smallArray1[i] = bigArray[i];
        }
        for (int i = smallArray1.length; i < bigArray.length; i++) {
            smallArray2[i - 10] = bigArray[i];
        }
        for (int i = 0; i < smallArray2.length; i++) {
            System.out.println(smallArray2[i]);
        }

    }
}
