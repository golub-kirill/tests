package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(23,33.));
        System.out.println(convertEurToUsd(23,57766.45625652));
    }

    public static double convertEurToUsd(int eur, double course) {
        double usd = eur*course;
        return usd;
    }
}
