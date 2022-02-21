package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* Koç Burcu : 21 Mart - 20 Nisan
   Boğa Burcu : 21 Nisan - 21 Mayıs
   İkizler Burcu : 22 Mayıs - 22 Haziran
   Yengeç Burcu : 23 Haziran - 22 Temmuz
   Aslan Burcu : 23 Temmuz - 22 Ağustos
   Başak Burcu : 23 Ağustos - 22 Eylül
   Terazi Burcu : 23 Eylül - 22 Ekim
   Akrep Burcu : 23 Ekim - 21 Kasım
   Yay Burcu : 22 Kasım - 21 Aralık
   Oğlak Burcu : 22 Aralık - 21 Ocak
   Kova Burcu : 22 Ocak - 19 Şubat
   Balık Burcu : 20 Şubat - 20 Mart */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen kaçıncı ayda doğduğunuzu yazınız: ");
        int month = scan.nextInt();
        System.out.println("Lütfen doğduğunuz günün tarihi giriniz: ");
        int day = scan.nextInt();
        if (month == 3) {
            if (day > 21) {
                System.out.println("Burcunuz: KOÇ");
            } else {
                System.out.println("Burcunuz: BALIK");
            }
        } else if (month == 4) {
            if (day > 20) {
                System.out.println("Burcunuz: BOĞA");
            } else {
                System.out.println("Burcunuz: KOÇ");
            }
        } else if (month == 5) {
            if (day > 22) {
                System.out.println("Burcunuz: İKİZLER");
            } else {
                System.out.println("Burcunuz: BOĞA");
            }
        } else if (month == 6) {
            if (day > 22) {
                System.out.println("Burcunuz: YENGEÇ");
            } else {
                System.out.println("Burcunuz: İKİZLER");
            }
        } else if (month == 7) {
            if (day > 22) {
                System.out.println("Burcunuz: ASLAN");
            } else {
                System.out.println("Burcunuz: YENGEÇ");
            }
        } else if (month == 8) {
            if (day > 22) {
                System.out.println("Burcunuz: BAŞAK");
            } else {
                System.out.println("Burcunuz: ASLAN");
            }
        } else if (month == 9) {
            if (day > 22) {
                System.out.println("Burcunuz: TERAZİ");
            } else {
                System.out.println("Burcunuz: BAŞAK");
            }
        } else if (month == 10) {
            if (day > 22) {
                System.out.println("Burcunuz: AKREP");
            } else {
                System.out.println("Burcunuz: TERAZİ");
            }
        } else if (month == 11) {
            if (day > 21) {
                System.out.println("Burcunuz: YAY");
            } else {
                System.out.println("Burcunuz: AKREP");
            }
        } else if (month == 12) {
            if (day > 21) {
                System.out.println("Burcunuz: OĞLAK");
            } else {
                System.out.println("Burcunuz: YAY");
            }
        } else if (month == 1) {
            if (day > 21) {
                System.out.println("Burcunuz: KOVA");
            } else {
                System.out.println("Burcunuz: OĞLAK");
            }
        } else if (month == 2) {
            if (day > 19) {
                System.out.println("Burcunuz: BALIK");
            } else {
                System.out.println("Burcunuz: <KOVA");
            }
        }


    }
}
