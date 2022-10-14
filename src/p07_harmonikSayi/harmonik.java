package p07_harmonikSayi;

import java.util.Scanner;

public class harmonik {
    /*Java ile girilen sayının harmonik serisini bulan program yazacağız.
    Harmonik Seri Formülü 1+1/2+1/3+1/4+...+1/n*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen  bir sayı giriniz:");
        int num = scan.nextInt();

        double harNum = 0;

        for (int i = 1; i <= num; i++) {

            harNum += (double) 1 / i;
        }
        System.out.println(num + " değerinin harmonik değeri : " + harNum);
    }
}
