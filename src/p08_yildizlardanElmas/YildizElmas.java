package p08_yildizlardanElmas;

import java.util.Scanner;

public class YildizElmas {
    public static void main(String[] args) {
        /*Java'da döngüler kullanarak yıldızlar ile elmas yapınız.
         *     *
         *    ***
         *   *****
         *  *******
         * *********
         *  *******
         *   *****
         *    ***
         *     *
         * */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz.");
        int num=scan.nextInt();

        for (int i = 0; i <= num; i++) {
            for (int j = 0; j < (num - i); j++) {
                System.out.print(" ");

            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i <=num; i++) {
            for (int j = num; j >=(num-i) ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <(2*(num-i)) ; k++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
