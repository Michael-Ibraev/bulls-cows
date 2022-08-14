package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = (int) (Math.random() * ((999999 - 100) + 1) + 100);
        System.out.println(x);

        int x6 = x%10;
        int x5 = (x/10)%10;
        int x4 = (x/100)%10;
        int x3 = (x/1000)%10;
        int x2 = (x/10000)%10;
        int x1 = (x/100000)%10;

        ArrayList list = new ArrayList();
        list.add(x1);
        list.add(x2);
        list.add(x3);
        list.add(x4);
        list.add(x5);
        list.add(x6);



        int inPlace = 0;
        int notInPlace = 0;

        System.out.print("Введите кол-во попыток: ");
        int times = scanner.nextInt();

        for(int i = 1; i <= times; i++){
            System.out.println("Попытка №" + i);
            int number = scanner.nextInt();
            int number6 = number%10;
            int number5 = (number/10)%10;
            int number4 = (number/100)%10;
            int number3 = (number/1000)%10;
            int number2 = (number/10000)%10;
            int number1 = (number/100000)%10;
            if (number == x){
                System.out.println("Вы угадали");
            }
            if (number6 == x6){
                inPlace++;
            }else if (list.contains(number6)){
                notInPlace++;
            }
            if (number5 == x5){
                inPlace++;
            }else if (list.contains(number5)){
                notInPlace++;
            }
            if (number4 == x4){
                inPlace++;
            }else if (list.contains(number4)){
                notInPlace++;
            }
            if (number3 == x3){
                inPlace++;
            }else if (list.contains(number3)){
                notInPlace++;
            }
            if (number2 == x2){
                inPlace++;
            }else if (list.contains(number2)){
                notInPlace++;
            }
            if (number1 == x1){
                inPlace++;
            }else if (list.contains(number1)){
                notInPlace++;
            }

            System.out.println("Цифр на своих местах: "+inPlace);
            System.out.println("Цифр не на своих местах: "+notInPlace);

            notInPlace = 0;
            inPlace = 0;
        }
        System.out.println("Игра окончена(((");
    }
}
