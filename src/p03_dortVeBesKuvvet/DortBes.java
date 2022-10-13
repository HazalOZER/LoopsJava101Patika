package p03_dortVeBesKuvvet;

import java.util.Scanner;

public class DortBes {
    public static void main(String[] args) {

        /*Ödev
        Java döngüler ile girilen sayıya kadar olan 4 ve 5'in
        kuvvetlerini ekrana yazdıran programı yazıyoruz.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int num = scan.nextInt();

        System.out.print(num + " değerine kadar olan 4'ün kuvvetleri: ");

        for (int i = 1; i <= num; i *= 4) {

            if (i < num) System.out.print(i + ", ");
            else System.out.println("-");
        }
        System.out.println("");

        System.out.print(num + " değerine kadar olan 5'in kuvvetleri: ");

        for (int i = 1; i < num; i *= 5) {

            if (i < num) System.out.print(i + ", ");
            else System.out.println("-");
        }
    }
}
