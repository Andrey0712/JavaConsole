package program;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //task 1
//        String endl = System.getProperty("line.separator");
//        System.out.print("Your time is limited,"+endl+"so don’t waste it"+endl+"living someone else’s life"
//                +endl+"Steve Jobs");


        //task 2

//        int n,m;
//        System.out.println("Введіть число:");
//        n = Integer.parseInt(in.next());
//        System.out.println("Введіть число:");
//        m = Integer.parseInt(in.next());
//        double rez=percent(n,m);
//        System.out.print(rez);

//task 3

//        System.out.print("Введите размер числа ");
//        int size= in.nextInt();
//        int[] number = new int[size];
//
//        for( int i=0; i<size;i++){
//            System.out.println("Введите елемент числа ");
//            number[i]=in.nextInt();
//        }
//        for(int item:number){
//            System.out.print(item);
//        }
//        System.out.println();

        //task 4

//        System.out.println("Введите колличество строк и нажмите <ENTER>");
//        int n = in.nextInt();
//           if(n==6){
//               int[] number = new int[n];
//
//               for( int i=0; i<n;i++){
//                   System.out.println("Введите елемент числа ");
//                   number[i]=in.nextInt();
//               }
//System.out.print("Полученое число ");
//               for(int item:number){
//                   System.out.print(item);
//               }
//               System.out.println(" ");
//               int temp = number[0];
//               number[0] = number[5];
//               number[5] = temp;
//               int temp1 = number[1];
//               number[1] = number[4];
//               number[4] = temp1;
//               System.out.print("Отформатированое число ");
//               for(int item:number){
//           System.out.print(item);
//       }
//           }
//           else
//               System.out.println("Ошибка! Необходимо ввести цифру 6.");
//            return;


        //task 5

//        System.out.println("Введите номер месяца и нажмите <ENTER>");
//        int month  = in.nextInt();
//          switch (month) {
//            case 12:
//            case 1:
//            case 2:
//                System.out.print("Зима");
//                break;
//            case 3:
//            case 4:
//            case 5:
//                System.out.print("Весна");
//                break;
//            case 6:
//            case 7:
//            case 8:
//                System.out.print("Лето");
//                break;
//            case 9:
//            case 10:
//            case 11:
//                System.out.print("Осень");
//                break;
//            default:
//                System.out.print("Вы с какой планеты? Нет столько месяцев в году");
//        }

        //task 6
//        System.out.println("Введите количество метров и нажмите <ENTER>");
//        int m  = in.nextInt();
//
//        System.out.println("Если хотите метры перевесим в мили - выберите 1 и нажмите <ENTER>");
//        System.out.println("Если хотите метры перевесим в дюймы - выберите 2 и нажмите <ENTER>");
//        System.out.println("Если хотите метры перевесим в ярды - выберите 3 и нажмите <ENTER>");
//        int n  = in.nextInt();
//
//          switch (n) {
//              case 1:
//                  double rez = m * 0.000621371;
//                  System.out.print(rez);
//                  break;
//              case 2:
//                  double rez1 = m * 39.3701;
//                  System.out.print(rez1);
//                  break;
//              case 3:
//                  double rez2 = m * 1.09361;
//                  System.out.print(rez2);
//                  break;
//              default:
//                  System.out.print("Нет такого варианта");
//          }

        //task 7

//        System.out.println("Начало диапозона : ");
//        int a  = in.nextInt();
//        System.out.println("Конец диапазона : ");
//        int b  = in.nextInt();
//
//        if(b-a>0){
//            odd_numbers (a, b);
//    }
//        else{
//            odd_numbers_optimized (a, b);}

        //task 8
//        System.out.println("Начало диапозона : ");
//        int a  = in.nextInt();
//        System.out.println("Конец диапазона : ");
//        int b  = in.nextInt();
//        multiplication_table (a, b);

        //task 9

//        int n;
//        System.out.println("Введіть розір масива:");
//        n = Integer.parseInt(in.next());
//        int[] arr = new int[n];
//        int max = arr[0];
//        int min = arr[0];
//        int countNul=0;
//        int countPlus=0;
//
//        for (int i = 0; i < n; i++)
//            arr[i] = getRandomNumber(-20, 20);
//        for (int item : arr) {
//            System.out.println(item + " ");
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (max < arr[i]) { // сравниваем
//                max = arr[i]; // запоминаем значение
//            }
//            if (min > arr[i]) { // сравниваем
//                min = arr[i]; // запоминаем значение
//            }
//            if (arr[i]>0) {
//                countPlus++;
//            }
//            if (arr[i]==0) {
//                countNul++;
//            }
//
//        }
//        System.out.println("Максимальное число в масиве : "+max);
//        System.out.println("Минимальное число в масиве : "+min);
//        System.out.println("Количество отрицательных элементов в масиве : "+(arr.length-countPlus-countNul));
//        System.out.println("Количество положительных элементов в масиве : "+countPlus);
//        System.out.println("Количество нулей в масиве : "+countNul);

        //task 10

        int n;
        System.out.println("Введіть розір масива:");
        n = Integer.parseInt(in.next());
        int[] arr = new int[n];
        int max = arr[0];
        int min = arr[0];
        int countMinus=0;
        int countPlus=0;
        int count_even_numb=0;
        int count_odd_numb=0;

        for (int i = 0; i < n; i++)
            arr[i] = getRandomNumber(-20, 20);
        for (int item : arr) {
            System.out.println(item + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0) {
                countPlus++;
            }
            if (arr[i]<0) {
                countMinus++;
            }
            if (arr[i] % 2 != 0){
                count_odd_numb++;
            }
            if (arr[i] % 2 == 0){
                count_even_numb++;
            }

        }
        if(countPlus==0){
            System.out.println("Масив позитивных чисел не создан");
        }
        else{
            int[] plus=new int[countPlus]; // выделение памяти
            int j=0; // индекс в новом массиве
            for(int i=0;i<arr.length;i++){
                if (arr[i]>0)
                plus[j++]=arr[i];
            }
            Arrays.sort(plus);
            // печать сформированного массива
            // цикл for each
            System.out.println("Масив позитивных чисел: ");
            for(int x:plus){
                System.out.print(x+" ");
            }
            System.out.println();
        }
        if(count_odd_numb==0){
            System.out.println("Масив нечетных чисел не создан");
        }
        else{
            int[] odd_numb=new int[count_odd_numb]; // выделение памяти
            int j=0; // индекс в новом массиве
            for(int i=0;i<arr.length;i++){
                if (arr[i] % 2 != 0)
                    odd_numb[j++]=arr[i];
            }
            Arrays.sort(odd_numb);
             System.out.println("Масив нечетных чисел: ");
            for(int x:odd_numb){
                System.out.print(x+" ");
            }
            System.out.println();
        }
        if(count_even_numb==0){
            System.out.println("Масив четных чисел не создан");
        }
        else{
            int[] even_numb=new int[count_even_numb]; // выделение памяти
            int j=0; // индекс в новом массиве
            for(int i=0;i<arr.length;i++){
                if (arr[i] % 2 == 0)
                    even_numb[j++]=arr[i];
            }
            Arrays.sort(even_numb);
            System.out.println("Масив четных чисел: ");
            for(int x:even_numb){
                System.out.print(x+" ");
            }
            System.out.println();
        }
        if(countMinus==0){
            System.out.println("Масив негативных чисел не создан");
        }
        else{
            int[] minus=new int[countMinus]; // выделение памяти
            int j=0; // индекс в новом массиве
            for(int i=0;i<arr.length;i++){
                if (arr[i]<0)
                    minus[j++]=arr[i];
            }
            Arrays.sort(minus);
            System.out.println("Масив негативных чисел: ");
            for(int x:minus){
                System.out.print(x+" ");
            }
            System.out.println();
        }






    }

    private static  double percent (int n, int m){
        return (double) ((double)n/100*m);
    }

    private static void odd_numbers (int a, int b){
        for (int i = a; i <= b; i++){
            if (i % 2 != 0){
            System.out.println(i);}
        }
    }
    private static void odd_numbers_optimized (int a, int b){
        for (int i = b; i <= a; i++){
            if (i % 2 != 0){
                System.out.println(i);}
        }
    }
    private static void multiplication_table (int a, int b){
        for (int i = a; i <= b; i++)
                System.out.println(i+"*1="+i+" "+ i+"*2="+i*2+" "+ i+"*3="+i*3+" "+ i+"*4="+i*4+" "
                        + i+"*5="+i*5+" "+ i+"*6="+i*6+" "+ i+"*7="+i*7+" "+ i+"*8="+i*8+" "
                        + i+"*9="+i*9+" "+ i+"*10="+i*10+" ");

    }
    private static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }


}
