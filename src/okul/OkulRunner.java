package okul;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OkulRunner {
    static Scanner scan = new Scanner(System.in);
    static List<KisiGenel> ögrenciListesi = new ArrayList<>();
    static List<KisiGenel> ögretmenListesi = new ArrayList<>();
    static String kisiTürü;

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Ögrenci ve ögretmen yönetim paneli yükleniyor...");
        Thread.sleep(3000);

        System.out.println("\t====================================\n" +
                "\t ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "\t====================================\n" +
                "\t 1- ÖĞRENCİ İŞLEMLERİ\n" +
                "\t 2- ÖĞRETMEN İŞLEMLERİ\n" +
                "\t Q- ÇIKIŞ");

        System.out.println();

        System.out.print("Islem yapmak istediginiz paneli seciniz : ");
        String islem = scan.next().toUpperCase();

        switch (islem) {
            case "1":
                kisiTürü = "ÖGRENCI";
                islemMenüsü();
                break;

            case "2":
                kisiTürü = "ÖGRETMEN";
                islemMenüsü();
                break;

            case "mayinTarlasi":
                cikisYap();
                break;


        }


    }


    private static void islemMenüsü() throws InterruptedException {
        System.out.println("Secilen " + kisiTürü + " icin asagidaki islemleri yapabilirsiniz.");
        System.out.println("\t============= İŞLEMLER =============\n" +
                "\t\t 1-EKLEME\n" +
                "\t\t 2-ARAMA\n" +
                "\t\t 3-LİSTELEME\n" +
                "\t\t 4-SİLME\n" +
                "\t\t 5-ANA MENÜ\n" +
                "\t\t Q-ÇIKIŞ");

        System.out.print("Yapmak istediginiz islemi seciniz : ");
        String islemTercihi = scan.next().toUpperCase();

        switch (islemTercihi) {
            case "1":
                ekle();
                islemMenüsü();
                break;
            case "2":
                ara();
                islemMenüsü();
                break;
            case "3":
                listele();
                islemMenüsü();
                break;
            case "4":
                sil();
                islemMenüsü();
                break;
            case "5":
                anaMenü();
                islemMenüsü();
                break;
            case "mayinTarlasi":
                cikisYap();
                islemMenüsü();
                break;


        }

    }

    private static void anaMenü() {
    }

    private static void sil() {
    }

    private static void listele() {
        System.out.println("   ***   " + kisiTürü + " LISTELEME PANELI   ***");
        if (kisiTürü.equalsIgnoreCase("ÖGRENCI")) {
            System.out.println(ögrenciListesi);
        } else {
            for (KisiGenel each : ögretmenListesi) {
                System.out.println(each.toString() + " Ad Soyad : " + each.getAdSoyad() + each.getYas());

            }
        }
    }

    private static void ara() {
    }

    private static void ekle() {
        System.out.println(kisiTürü + " ekleme paneline hos geldiniz.");
        System.out.print("Ad Soyad giriniz : ");
        scan.nextLine();
        String adSoyad = scan.nextLine();
        System.out.print("Kimlik numarasi giriniz : ");
        String kimlikNumarasi = scan.nextLine();
        System.out.print("Yas giriniz : ");
        int yas = scan.nextInt();

        if (kisiTürü.equals("ÖGRETMEN")) {
            System.out.print("Bölüm giriniz : ");
            scan.nextLine();
            String bölüm = scan.nextLine();
            System.out.print("Sicil numarasi giriniz : ");
            String sicilNumarasi = scan.nextLine();
            Ögretmen ögrtmn = new Ögretmen(adSoyad, kimlikNumarasi, yas, bölüm, sicilNumarasi);
            ögretmenListesi.add(ögrtmn);
        } else {
            System.out.print("Ögrenci numarasi giriniz : ");
            String numara = scan.next();
            System.out.print("Sinif giriniz : ");
            String sinif = scan.next();
            Ögrenci ögrnci = new Ögrenci(adSoyad, kimlikNumarasi, yas, numara, sinif);
            ögrenciListesi.add(ögrnci);
        }
    }


    private static void cikisYap() throws InterruptedException {
        System.out.println("Panelden cikis yapiliyor...");
        Thread.sleep(2000);
        System.out.println("\t*** Cikis basarili ***\t");
    }

}
