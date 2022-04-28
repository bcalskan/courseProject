package depoYönetimi;

import java.util.HashMap;
import java.util.Scanner;

public class DepoYönet {
    static Scanner scan = new Scanner(System.in);
    static HashMap<Integer, Ürünler> ürünListesi = new HashMap<>();
    int id = 100;


    public void start() {
        System.out.println("============= ISLEMLER =============\n" +
                "1-ÜRÜN TANIMLAMA\n2-MIKTAR GÜNCELLEME\n3-RAF GÜNCELLEME\n4-ÜRÜN CIKISI\n5-ÜRÜN LISTELEME\n6-CIKIS");

        System.out.print("Yapmak istediginiz islemi seciniz : ");
        int secim = scan.nextInt();

        switch (secim) {
            case 1:
                ürünTanimlama();
                start();
                break;
            case 2:
                miktarGüncelleme();
                start();
                break;
            case 3:
                rafGüncelleme();
                start();
                break;
            case 4:
                ürünCikisi();
                start();
                break;
            case 5:
                ürünListeleme();
                start();
                break;
            case 6:
                cikis();
                break;

            default:
                System.out.println("Hatali veri girildi.");
                break;
        }//switch
    }

    private void ürünCikisi(){
        System.out.println("Cikis yapmak istediginiz ürünün ID numarasini giriniz : ");
        int arananId = scan.nextInt();

        if (ürünListesi.keySet().contains(arananId)) {
            ürünListesi.remove(arananId);
            System.out.println("Ürün kaldiriliyor...");
            System.out.println("Ürün cikisi yapildi.");
        } else System.out.println("Ürün bulunamadi.");
    }

    private void cikis() {
        System.out.println("Cikis yapiliyor. Bizi tercih ettiginiz icin tesekkür ederiz.");
    }

    private void ürünListeleme() {
        System.out.println("*** ÜRÜN LISTESI ***");
        System.out.println(ürünListesi);
    }

    private void rafGüncelleme() {
        System.out.println("Raf numarasini güncelleyeceginiz ürünün ID numarasini giriniz : ");
        int arananId = scan.nextInt();

        if (ürünListesi.keySet().contains(arananId)) {
            System.out.println("Yeni raf numarasini giriniz : ");
            String yeniRafNo = scan.nextLine();
            ürünListesi.get(arananId).setRaf(yeniRafNo + ürünListesi.get(arananId).getRaf());
            System.out.println("Raf numarasi güncellendi.");
        } else System.out.println("Aradiginiz ürün bulunamadi.");
    }

    private void miktarGüncelleme() {
        System.out.println("Miktarini güncelleyeceginiz ürünün ID numarasini giriniz : ");
        int arananId = scan.nextInt();

        if (ürünListesi.keySet().contains(arananId)) {
            System.out.println("Güncellemek istediginiz miktari giriniz : ");
            int güncelMiktar = scan.nextInt();
            ürünListesi.get(arananId).setÜrünMiktari(güncelMiktar + ürünListesi.get(arananId).getÜrünMiktari());
            System.out.println("Ürün miktari güncellendi.");
        } else System.out.println("Aradiginiz ürün bulunamadi.");
    }


    public void ürünTanimlama() {
        System.out.print("Ürün ismi giriniz : ");
        scan.nextLine();
        String ürünIsmi = scan.nextLine();

        System.out.print("Ürün üretici bilgisi giriniz : ");
        String üreticiBilgisi = scan.nextLine();

        System.out.print("Ürün birimi giriniz : ");
        String ürünBirimi = scan.nextLine();

        System.out.print("Ürün ID numarasi giriniz : ");
        String ürünId = scan.nextLine();

        System.out.print("Ürün raf numarasini giriniz : ");
        String rafNumarasi = scan.nextLine();

        System.out.print("Ürün miktarini giriniz : ");
        int ürünMiktar = scan.nextInt();

        Ürünler ürün = new Ürünler(ürünIsmi, üreticiBilgisi, ürünBirimi, rafNumarasi, ürünMiktar);
        ürünListesi.put(id, ürün);
        System.out.println(id + " : " + ürünListesi.get(id));
        id++;

    }

}
