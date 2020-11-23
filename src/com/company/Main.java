package com.company;

public class Main {

    public static void main(String[] args) {

        String helloAndroid;
        final int NUM = 5;
        String word = "Apple";
        System.out.println( NUM + " " + word);
        helloAndroid = "5 Apple";
        System.out.println( NUM + " " + word + " " + helloAndroid);

        if  (NUM < 0) {
            System.out.println( "Вы сохранили отрецательное число");
            }
        if (NUM > 0){
            System.out.println( "Вы сохранили положительное число");
            }
        else {
            System.out.println("Вы сохранили нуль");
        }
    }
}
