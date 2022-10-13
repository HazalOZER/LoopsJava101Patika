package p04_kombinasyon;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {

       /* Ödev
        N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.
         N’in r’li kombinasyonu C(n,r) şeklinde gösterilir. Java ile kombinasyon hesaplayan program yazınız.
        Kombinasyon formülü
        C(n,r) = n! / (r! * (n-r)!)*/

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen küme eleman sayısını giriniz");
        int kumeN= scan.nextInt();

        System.out.println("Lütfen altkümenin kaç elemanlı olmasını istediğini giriniz");
        int kumeR=scan.nextInt();

        int fakN=kumeN,fakR=kumeR, nR=kumeN-kumeR;

        for (int i = kumeN-1; i >=1 ; i--) {
        fakN*=i;
        }
        for (int i = kumeR-1; i >=1 ; i--) {
            fakR*=i;
        }
        for (int i = (nR-1); i>=1 ; i--) {
            nR*=i;

        }
        int sonuc=fakN/(fakR*nR);

        System.out.println("C("+kumeN+","+kumeR+")="+sonuc+" farklı şekilde altküme oluşturabilirsiniz ");
    }
}
