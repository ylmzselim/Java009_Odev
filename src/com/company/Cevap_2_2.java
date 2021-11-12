package com.company;

public class Cevap_2_2 {
    public static void main(String[] args) {

        String[] ogrenciListesi = new String[3];
        String ad="SELIM", not1="45", not2 = "60";
        for (int i=0;i<3;i++){
            ogrenciListesi[0] = ad + "," + not1 + "," + not2;
        }

        String ogrencibilgisi=ogrenciListesi[0];
        String oAd=ogrencibilgisi.split(",")[0];
        int oNot1=Integer.parseInt(ogrencibilgisi.split(",")[1]);
        int oNot2=Integer.parseInt(ogrencibilgisi.split(",")[2]);
        int ort=(oNot1+oNot2)/2;

        System.out.println("OGRENCİ AD......: "+oAd);
        System.out.println("OGRENCİ NOT1....: "+oNot1);
        System.out.println("OGRENCİ NOT2....: "+oNot2);
        System.out.println("OGRENCİ ORT.....: "+ort);

    }
}
