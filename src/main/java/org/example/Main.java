package org.example;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1.Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
        // и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению
        // приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
        //float number;
        //while (true)
        //try {
        //    number = getFloatNumber();
        //    System.out.println("Введенное число " + number);
        //    break;
        //}
        //catch (InputMismatchException e){
        //    System.out.println("Введенная строка не является числом");
        //    continue;
        //}

        // 2. Если необходимо, исправьте данный код (задание 2)
//        int[] intArray = new int[]{1,2,3,4,5,6,7,8};
//        try {
//            int d = 0;
//            double catchedRes1 = intArray[8] / d;
//            System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
//            System.out.println("Catching exception: " + e);
//        }

        // 3. Если необходимо, исправьте данный код (задание 3)
//        try {
//            int a = 90;
//            int b = 3;
//            System.out.println(a / b);
//            printSum(2, 234);
//            int[] abc = { 1, 2 };
//            abc[3] = 9;
//
//        } catch (NullPointerException ex) {
//            System.out.println("Указатель не может указывать на null!");
//        } catch (ArrayIndexOutOfBoundsException ex) {
//            System.out.println("Массив выходит за пределы своего размера!");
//        } catch (Throwable ex) {
//            System.out.println("Что-то пошло не так...");
//        }

        // 4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
        // Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
        String str;
        try {
            str = getData();
            System.out.println("Введенная строка: " + str);
        }
        catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }

    }
    public static float getFloatNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число с плавающей точкой");
        float number = scanner.nextFloat();
        return number;
    }

    public static String getData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку ");
        String str = scanner.nextLine();
        if (str.equals("")) throw new InputMismatchException("Пустую строку вводить нельзя");
        return str;
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

}