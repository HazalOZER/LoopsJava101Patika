package p02_tekSayiBulanaKadarCiftTopla;

import java.util.Scanner;

public class TekSayiCiftSayi {
    public static void main(String[] args) {
        /*Ödev
        Java döngüler ile tek bir sayı girilene kadar
        kullanıcıdan girişleri kabul eden ve girilen değerlerden
        çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.*/

        Scanner scan=new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz: ");
        int i=scan.nextInt();

        int sum=0;

        while ( i%2==0) {
            if (i%4==0) {
                sum+=i;
            }
            System.out.print("Lütfen bir sayı giriniz: ");
            i=scan.nextInt();
        }
        System.out.println(sum);

    }
}
