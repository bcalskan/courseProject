package okulYönetimi;

import java.util.Scanner;

public class Depo {
    static Scanner scan = new Scanner(System.in);


    public static void anaMenü() throws InterruptedException {

        String secim = "";
        do {
            System.out.println("\t========= YILDIZ KOLEJI =========\n" +
                    "\t========= ANA MENÜ =========\n" +
                    "\t\t1-OKUL BILGILERI\n" +
                    "\t\t2-ÖGRETMEN MENÜ\n" +
                    "\t\t3-ÖGRENCI MENÜ\n" +
                    "\t\tQ-CIKIS");

            System.out.print("Yapmak istediginiz islemi seciniz : ");
            secim = scan.nextLine();

            switch (secim) {
                case "1":
                    okulBilgileriniYazdir();
                    break;
                case "2":
                    Ögretmen.ögretmenBilgileriniYazdir();
                    break;
                case "3":
                    Ögrenci.ögrenciBilgileriniYazdir();
                    break;
                case "mayinTarlasi":
                case "q":
                    Depo.cikisYap();
                    break;
                default:
                    System.out.println("Hatali giris yapildi.");

            }


        } while (!secim.equalsIgnoreCase("mayinTarlasi"));

    }

    public static void cikisYap() throws InterruptedException {
        System.out.println("Sistemden cikis yapiliyor...");
        Thread.sleep(3000);
        System.out.println("Cikis gerceklestirildi.");
    }

    public static void okulBilgileriniYazdir() throws InterruptedException {
        System.out.println("\t========= YILDIZ KOLEJI =========\n" +
                "\tAdres : " + Okul.adres + "\n" +
                "\tTelefon numarasi : " + Okul.telefon);
        Thread.sleep(3000);
    }
}
