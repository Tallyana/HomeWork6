public class Main {
    public static void main(String[] args) {
        System.out.println("HomeWork - 6!");

        System.out.println("Задание1.");

        int start = 5;//проба
        while (start > 0) {
            System.out.println(start);
            start--;

        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            //С помощью цикла for выведите в консоль все числа от 1 до 10.
        }
        System.out.println("Задание 2.");//С помощью цикла for выведите в консоль все числа от 10 до 1.
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Задание 3.");//Выведите в консоль все четные числа от 0 до 17.
        for (int i = 2; i <= 17; i = i + 2) {
            System.out.println(i);
        }
        System.out.println("Задание 4.");//Выведите в консоль все числа от 10 до - 10 от бОльшего числа к меньшему.
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println("Задание 5.");//Напишите программу, которая выводит в
        // консоль все високосные года, начиная с 1904 года до 2096.
        // В консоль результат должен выводиться в формате
        // "… год является високосным".
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + " год является високосным;");
        }
        System.out.println("Задание 6.");
        //Напишите программу, которая выводит в консоль последовательность цифр:
        // 7 14 21 28 35 42 49 56 63 70 77 84 91 98
        for (int i = 7; i < 105; i = i + 7) {
            System.out.println(i);
        }
        System.out.println("Задание 7.");
        //Напишите программу, которая выводит в консоль последовательность цифр:
        // 1 2 4 8 16 32 64 128 256 512
        for (int i = 1; i < 1024; i = i * 2) {
            System.out.println(i);
        }
        {System.out.println("Задание 8.");}
        //Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц вы будете
            // откладывать по 29 000 рублей "в банку".
            //Выведите сумму накоплений за каждый месяц в консоль в формате
            // "Месяц … , сумма накоплений равна … рублей" .
            int zarplata = 29000;
            int total = 0;
            for (int i = 0; i < 12; i++) {
                total = total + zarplata;
                System.out.println("Месяц " + zarplata + ". Cумма накоплений равна " + total + "  рублей");
            }
                    {System.out.println("Задание 9.");}
            //Перепишите решение задачи выше при условии, что деньги вы откладывать будете не "в банку",
        // а в банк под проценты – 12% годовых.
        // Выведите сумму накоплений за каждый месяц в консоль в формате "Месяц … ,
        // сумма накоплений равна … рублей" .
            int zarplata1 = 29000;
             int total1 = 0;
              for (int i = 0; i < 12; i++) {
                  total1 = total1 + total1 / 100;
                  total1 = total1 + zarplata1;
                  System.out.println("Месяц " + zarplata1 + ". Cумма накоплений равна " + total1 + "  рублей");
              }
        }
    }













