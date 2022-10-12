package com.BVT2105;

//Данный класс - программа, определяющая является ли число палиндромом
public class Palindrome {
    //Данный метод получает строку через терминал, читает ее до пробела и печатает результат
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            System.out.println(isPalindrome(s));
        }
    }
    //Данная функция делает реверс строки
    public static String reverseString(String s) {
        String zeroS = "";
        for (int i = s.length(); i != 0; i--) {
            char t = s.charAt(i-1);
            zeroS = zeroS + t;
        }
        return zeroS;
    }
    //Данная функция сравнивает введенную строку с реверснутой
    public static boolean isPalindrome(String s) {
        boolean result = false;
        if(s.equals(reverseString(s))) result = true;
        return result;
    }
}