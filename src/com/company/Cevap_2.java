package com.company;

import java.util.Scanner;

public class Cevap_2 {
    public static void main(String[] args) {

        // bir dizi içerisine öğrenci bilgilerini şu şekilde ekleyiniz.
        // {"ad: ali, not1:34,not2:34"}
        // öğretmen, öğrenci adını, 1. not, 2. not
        // öğrencilerin listesini 50 üzerinde alanları geçti
        // yazacak şekilde ekrana yazdırınız.

        Scanner sc = new Scanner(System.in);
        int secim = 0, ogrenciSayisi = 0, ogretmenSayisi = 0, durum = 0;
        String[][] sinifListesi = new String[ogrenciSayisi][3];
        String[][] ogretmenListesi = new String[ogretmenSayisi][];
        String[] ogrenciDurum = {"GEÇTİ", "KALDI"};

        do {
            System.out.println("1. ÖĞRENCİ EKLE");
            System.out.println("2. ÖĞRETMEN EKLE");
            System.out.println("3. ÖĞRENCİ LİSTESİ");
            System.out.println("4. ÖĞRENCİ NOTLARI");
            System.out.println("5. ÖĞRENCİ DEGERLENDİRME");
            System.out.println("6. ÇIKIŞ");
            System.out.println("**************************");
            System.out.print("SEÇİM YAPINIZ: ");
            secim = sc.nextInt();
            switch (secim) {
                case 1:
                    System.out.print("ÖĞRENCİ SAYISI: ");
                    ogrenciSayisi = sc.nextInt();
                    sc = new Scanner(System.in);
                    sinifListesi = new String[ogrenciSayisi][10];

                    for (int i = 0; i < ogrenciSayisi; i++) {
                        System.out.print((i + 1) + ". ADI........: ");
                        String ad = sc.nextLine();
                        System.out.print((i + 1) + ". SOYADI.....: ");
                        String soyad = sc.nextLine();
                        sinifListesi[i][0] = ad;
                        sinifListesi[i][1] = soyad;
                    }
                    System.out.println("**************************");
                    break;
                case 2:
                    System.out.print("ÖĞRETMEN SAYISI: ");
                    ogretmenSayisi = sc.nextInt();
                    sc = new Scanner(System.in);
                    ogretmenListesi = new String[ogretmenSayisi][10];

                    for (int i = 0; i < ogretmenSayisi; i++) {
                        System.out.print((i + 1) + ". ADI........: ");
                        String ad1 = sc.nextLine();
                        System.out.print((i + 1) + ". SOYADI.....: ");
                        String soyad1 = sc.nextLine();
                        ogretmenListesi[i][0] = ad1;
                        ogretmenListesi[i][1] = soyad1;
                    }
                    System.out.println("**************************");
                    break;
                case 3:
                    System.out.println("ÖĞRENCİ LİSTESİ");
                    System.out.println("|  ADI  |  SOYADI  |");
                    for (int i = 0; i < ogrenciSayisi; i++) {
                        System.out.print(sinifListesi[i][0] + "   ");
                        System.out.print(sinifListesi[i][1] + "   ");
                        System.out.println();
                    }
                    System.out.println("**************************");
                    break;
                case 4:
                    System.out.println("ÖĞRENCİ NOTLARI");
                    for (int i=0;i<ogrenciSayisi;i++){
                        System.out.print((i+1)+". VİZE NOTU...: ");
                        int vize_notu = sc.nextInt();
                        System.out.print((i+1)+". FİNAL NOTU..: ");
                        int final_notu = sc.nextInt();
                        int ortalama = (vize_notu + final_notu) / 2;
                            if (ortalama > 50) {
                        }
                    }
                    System.out.println("1. ÖĞRENCİ DURUM: " + ogrenciDurum[0]);
                    System.out.println("2. ÖĞRENCİ DURUM: " + ogrenciDurum[1]);
                    System.out.println("**************************");
                    break;
                case 5:
                    System.out.println("ÖĞRENCİ DEGERLENDİRME");
                    System.out.println("| ADI | SOYADI | DURUM | ÖĞRETMEN |");
                    for (int i = 0; i < ogrenciSayisi; i++) {

                        for (int k = 0; k < ogretmenSayisi; k++) {
                            System.out.print(sinifListesi[i][0] + "   ");
                            System.out.print(sinifListesi[i][1] + "   ");
                            System.out.print(ogrenciDurum[0] + "  ");// ikinci öğrencinin durumunu yazdıramadım
                            System.out.print(ogretmenListesi[k][0] + "  ");
                            System.out.print(ogretmenListesi[k][1] + "  ");
                            System.out.println();
                        }
                    }
                    System.out.println("**************************");
                    break;

                default:
                    System.out.println("ÇIKIŞ YAPILDI");
                    break;
            }
        } while (secim > 0 && secim < 6);
    }
}