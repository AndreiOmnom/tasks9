package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 1;
        int i =1;// упр.8
        while (a <= 10) {
            while (i <= 10) {
                System.out.print(i + " * " + a + " = ");
                System.out.print(i * a);
                //  выровнять строки
                String s1 = i + " * " + a + " = " + (i + a);
                int len1 = s1.length();
                if (len1 == 11) {
                    System.out.print("  ");
                }
                System.out.print("     ");
                i++;
            }
            System.out.println();
            i = 1;
            a++;
        }
        // упражнение 9 min max
        int number  = 54734;
        int cifrmax = number % 10;
        int cifrmin =number % 10;
        number = number /10;
        while ( number > 0) {
            int cifrlast = number % 10;
            if (cifrlast <  cifrmin) {
                cifrmin = cifrlast;
            }
            if (cifrlast > cifrmax) {
                cifrmax = cifrlast;
            }
            number = number / 10;
        }
        System.out.println("min=" + cifrmin + " max=" +cifrmax);

        //10*.Вывести среднее значение всех цифр в числе.
        //int number = 54734.
        //Вывод:
        //4.6
        // НУ НИКАК!
        //     int cifra = number % 10;
        //int c =0;
        // double mean;
        // number = number /10;
        // while ( number > 0) {
        //     int cifralast = number % 10;
        //    c = (c + cifralast);
        //     number = number / 10;
        //}
        // mean = (c  * 1.0) / 5;
        //System.out.println(mean);
    }
}

