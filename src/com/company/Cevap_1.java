package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Cevap_1 {
    public static void main(String[] args) {

        // Kullanıcıdan 4 adet sayı alınız ve bu sayıları bir dizi içine ekleyiniz
        // * dizinin içindeki en büyük sayıyı bulunuz
        // * dizinin içindeki en küçük sayıyı bulunuz
        // * dizinin ortalamasını bulunuz
        // **** ZOR, diziyi büyükten küçüğe sıralayınız.

        // Kullanıcıdan 4 adet sayı alınız ve bu sayıları bir dizi içine ekleyiniz
        Scanner sc = new Scanner(System.in);
        System.out.print("SAYI GİRİNİZ : ");
        int sayi = sc.nextInt();
        int[] sayilar = new int[5];
        sc = new Scanner(System.in);
        for (int i = 0; i < sayi; i++) {
            System.out.print((i + 1) + ". SAYI      : ");
            int s1 = sc.nextInt();
            sayilar[i] = s1;
        }
        System.out.println("************");
        System.out.println("SAYI LİSTESİ");
        System.out.println("************");

        for (int i = 0; i < sayi; i++) {
            System.out.println((i + 1) + ". SAYI      : " + sayilar[i]);
        }
        // * dizinin içindeki en büyük sayıyı bulunuz
        // * dizinin içindeki en küçük sayıyı bulunuz
        int buyuksayi = 0, kucuksayi = 0, ortalama = 0;
        for (int i = 0; i < sayilar[i]; i++) {
            if (i == 0) {
                buyuksayi = sayilar[i];
                kucuksayi = sayilar[i];
            }
            if (sayilar[i] > buyuksayi) {
                buyuksayi = sayilar[i];
            }
            if (sayilar[i] < kucuksayi) {
                kucuksayi = sayilar[i];
            }
        }
        System.out.println("EN BÜYÜK SAYI: " + buyuksayi);
        System.out.println("EN KÜÇÜK SAYI: " + kucuksayi);

        // * dizinin ortalamasını bulunuz
        for (int i = 0; i < sayilar[i]; i++) {
            sayilar[i]++;
            ortalama += sayilar[i] / 2;
        }
        System.out.println("ORTALAMA     : " + ortalama);

        // diziyi büyükten küçüğe sıralayınız.
        for (int i = 0; i < sayilar.length; i++) {
            Arrays.sort(sayilar);
            System.out.println("BÜYÜKTEN KÜÇÜĞE SIRALAMA: " + sayilar[i]);
        }
    }
}

