package com.BVT2105;

//Данный класс - программа, определяющая является ли число простым
public class Primes {
    //Данная функция перебирает числа и печатает результат
    public static void main(String[] args) {
        for(int i = 2; i <=100; i++) {
            if (isPrime(i) == true) System.out.println(i);
        }

    }
    //Данная функция делит число на все числа перед ним
    public static boolean isPrime(int n) {
        boolean result = true;
        for (int e = 2; e < n; e++) {
            if (n % e == 0)
                result = false;
        }
        return result;
    }
}