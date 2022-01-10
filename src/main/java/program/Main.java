package program;

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

        System.out.println("Введите колличество строк и нажмите <ENTER>");
        int n = in.nextInt();
           if(n==6){
               int[] number = new int[n];

               for( int i=0; i<n;i++){
                   System.out.println("Введите елемент числа ");
                   number[i]=in.nextInt();
               }
System.out.print("Полученое число ");
               for(int item:number){
                   System.out.print(item);
               }
               System.out.println(" ");
               int temp = number[0];
               number[0] = number[5];
               number[5] = temp;
               int temp1 = number[1];
               number[1] = number[4];
               number[4] = temp1;
               System.out.print("Отформатированое число ");
               for(int item:number){
           System.out.print(item);
       }
           }
           else
               System.out.println("Ошибка! Необходимо ввести цифру 6.");
            return;








    }

    private static  double percent (int n, int m){
        return (double) ((double)n/100*m);
    }

}
