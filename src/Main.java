// https://app.patika.dev/
// https://app.patika.dev/thendbranch

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Ödev
            Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.

            Örnek : 1643 = 1 + 6 + 4 + 3 = 14
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Sayı Giriniz : ");
        int sayi = input.nextInt();

        int hsayi = sayi;
        int basamak = 0;
        int bToplam = 0;

        while (sayi != 0){
            sayi/=10;
            basamak++;
        }
        System.out.println( "basamak sayısı : " + basamak);
        int n = basamak ;

        for (int i = 1; i <= n; i++) {
            int b = hsayi % 10;
            hsayi= hsayi/10;
            bToplam +=b;
            System.out.println(i + " basamak " + b + " Genel toplam : " + bToplam);
        }
        System.out.println("Basamakların toplamı : " + bToplam);
    }
}