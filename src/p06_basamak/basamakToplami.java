package p06_basamak;

import java.util.Scanner;

public class basamakToplami {
    public static void main(String[] args) {

        /*Ödev
        Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
        Örnek : 1643 = 1 + 6 + 4 + 3 = 14*/

        int basamak,
            basamakTop=0;

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz: ");
        int num = scan.nextInt();

        while (num!=0){

            basamak=num%10;
            basamakTop+=basamak;
            num/=10;}

        System.out.println(basamakTop);

    }
}