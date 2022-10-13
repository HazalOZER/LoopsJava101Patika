package p05_usluSayi;

import java.util.Scanner;

public class UsluFor {
    public static void main(String[] args) {
        /*Ödev
        Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.*/

        Scanner scan = new Scanner(System.in);

        System.out.println("Üssü alınacak sayıyı giriniz");
        int sayi = scan.nextInt();

        System.out.println("Üssü giriniz");
        int us = scan.nextInt();

        int sonuc = 1;


        if (us < 0) {
            System.out.println("Pozitif üs değeri giriniz");
        } else if (us == 0) {
            System.out.println("1");
        } else {
            for (int i = 1; i <= us; i++) {
                    sonuc *= sayi;
            }
            System.out.println(sonuc);
        }

    }
}
