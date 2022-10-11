package p01_girlenSayiyaKadar3ve4;

import java.util.Scanner;

public class KatlarVeOrtalama {
    public static void main(String[] args) {

        /* Ödev
        Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
        3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.*/

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen bir tamsayı giriniz");
        int num=scan.nextInt();

        int sum=0, flag=0;
        double average=0;

        for (int i = 0; i <=num ; i++) {

        if ( (i%3==0) && (i%4==0) ) {
            sum+=i;
            if(i==0) continue;
            flag++;
        }
        }
        System.out.println("Girdiğiniz sayıya kadar hem üçün " +
                           "hem dördün katı olan sayıların ortalamsı"+
                            (average = (double) sum / flag));

    }
}
