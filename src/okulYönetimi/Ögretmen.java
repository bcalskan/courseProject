package okulYönetimi;

import java.util.*;

public class Ögretmen {
    static Map<String, String> ögretmenlerMap = new HashMap<>();
    static Scanner scan = new Scanner(System.in);

    public static void fakeÖgretmenEkle() {
        ögretmenlerMap.put("123456987411", "Ali, Can, 1980, Matematik");
        ögretmenlerMap.put("123456987412", "Veli, Yan, 1981, Fizik");
        ögretmenlerMap.put("123456987413", "Ayse, Can, 1982, Kimya");
        ögretmenlerMap.put("123456987414", "Ali, San, 1983, Kimya");
        ögretmenlerMap.put("123456987415", "Alp, Yan, 1984, Matematik");
    }//fakeÖgretmenEkle


    public static void ögretmenBilgileriniYazdir() throws InterruptedException {

        String ögretmenSecim = "";
        do {
            System.out.println("\t============= YILDIZ KOLEJI =============\n" +
                    "\t=========== OGRETMEN MENU ============\n" +
                    "1- Ogretmenler Listesi Yazdir\n" +
                    "2- Soyisimden Ogretmen Bulma\n" +
                    "3- Branstan Ogretmen Bulma\n" +
                    "4- Bilgilerini Girerek Ogretmen Ekleme\n" +
                    "5- Kimlik No Ile Kayit Silme\n" +
                    "A- ANAMENU\n" +
                    "Q- ÇIKIŞ\n");

            System.out.print("Lütfen yapmak istediginiz islemi seciniz : ");
            ögretmenSecim = scan.nextLine();

            switch (ögretmenSecim) {
                case "1":
                    ögretmenListesiniYazdir();
                    break;
                case "2":
                    soyIsimdenÖgretmenBul();
                    break;
                case "3":
                    branstanBul();
                    break;
                case "4":
                    ögretmenEkle();
                    break;
                case "5":
                    kayitSilÖgretmen();
                    break;
                case "A":
                    Depo.anaMenü();
                    break;
                case "mayinTarlasi":
                case "q":
                    Depo.cikisYap();
                    break;
                default:
                    System.out.println("Hatali giris yapildi.");
            }


        } while (!ögretmenSecim.equalsIgnoreCase("mayinTarlasi"));
        Depo.cikisYap();
    }

    public static void kayitSilÖgretmen() throws InterruptedException {
        System.out.print("Kaydini silmek istediginiz ögretmenin TC numarasini giriniz : ");
        String kayitSilTc = scan.nextLine();

        String silinecekValue = ögretmenlerMap.get(kayitSilTc);
        String sonucValue = ögretmenlerMap.remove(kayitSilTc);

        while (true) {
            try {
                boolean sonuc = sonucValue.equals(silinecekValue);
                if (sonuc) {
                    System.out.println("Kayit siliniyor...");
                    Thread.sleep(3000);
                    System.out.println("Kayit silme islemi gerceklestirildi.");
                    break;
                } else throw new Exception();
            } catch (Exception e) {
                System.out.println("Lütfen bekleyiniz...");
                Thread.sleep(3000);
                System.out.println("Girilen TC numarasina sahip ögretmen bulunamadi.");
                break;
            }
        }

        Thread.sleep(2000);


    }

    public static void ögretmenEkle() throws InterruptedException {
        System.out.print("Eklemek istediginiz ögretmenin TC numarasini giriniz : ");
        String yeniTcNo = scan.nextLine();
        System.out.print("Eklemek istediginiz ögretmenin ismini giriniz : ");
        String yeniIsim = scan.nextLine();
        System.out.print("Eklemek istediginiz ögretmenin soyismini giriniz : ");
        String yeniSoyIsim = scan.nextLine();
        System.out.print("Eklemek istediginiz ögretmenin dogum yilini giriniz : ");
        String yeniDogumYili = scan.nextLine();
        System.out.print("Eklemek istediginiz ögretmenin bransini giriniz : ");
        String yeniBrans = scan.nextLine();

        String eklenecekValue = yeniIsim + ", " + yeniSoyIsim + ", " + yeniDogumYili + ", " + yeniBrans;
        ögretmenlerMap.put(yeniTcNo, eklenecekValue);
        System.out.println("Ekleme yapiliyor...");
        Thread.sleep(3000);
        System.out.println("Ekleme basariyla gerceklesti.");
        Thread.sleep(2000);


    }

    public static void branstanBul() throws InterruptedException {
        System.out.print("Aradiginiz ögretmenin bransini giriniz : ");
        String bransBul = scan.nextLine();

        System.out.println("\t============= YILDIZ KOLEJI =============\n" +
                "\t===== SOYISIM ILE ÖGRETMEN ARAMA =====\n"
                + "TCNO        ISIM   SOYISIM   D.YILI  BRANS");

        Set<Map.Entry<String, String>> ögretmenEntrySet = ögretmenlerMap.entrySet();

        for (Map.Entry<String, String> each : ögretmenEntrySet) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String eachValueArr[] = eachValue.split(", ");
            if (bransBul.equalsIgnoreCase(eachValueArr[3])) {
                System.out.printf("%11s %-6s  %-8s %4s    %s \n", eachKey, eachValueArr[0], eachValueArr[1],
                        eachValueArr[2], eachValueArr[3]);
            }
        }//for
        Thread.sleep(3000);
    }

    public static void soyIsimdenÖgretmenBul() throws InterruptedException {
        System.out.print("Aradiginiz ögretmenin soyismini giriniz : ");
        String soyIsimBul = scan.nextLine();

        System.out.println("\t============= YILDIZ KOLEJI =============\n" +
                "\t===== SOYISIM ILE ÖGRETMEN ARAMA =====\n"
                + "TCNO        ISIM   SOYISIM   D.YILI  BRANS");

        Set<Map.Entry<String, String>> ögretmenEntrySet = ögretmenlerMap.entrySet();

        for (Map.Entry<String, String> each : ögretmenEntrySet) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String eachValueArr[] = eachValue.split(", ");
            if (soyIsimBul.equalsIgnoreCase(eachValueArr[1])) {
                System.out.printf("%11s %-6s  %-8s %4s    %s \n", eachKey, eachValueArr[0], eachValueArr[1],
                        eachValueArr[2], eachValueArr[3]);
            }
        }//for
        Thread.sleep(3000);


    }

    public static void ögretmenListesiniYazdir() throws InterruptedException {
        System.out.println("\t============= YILDIZ KOLEJI =============\n" +
                "\t============= ÖGRETMEN LISTESI =============\n"
                + "TCNO        ISIM   SOYISIM   D.YILI  BRANS");

        Set<Map.Entry<String, String>> ögretmenEntrySet = ögretmenlerMap.entrySet();

        for (Map.Entry<String, String> each : ögretmenEntrySet) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String eachValueArr[] = eachValue.split(", ");
            System.out.printf("%11s %-6s  %-8s %4s    %s \n", eachKey, eachValueArr[0], eachValueArr[1],
                    eachValueArr[2], eachValueArr[3]);
        }//for
        Thread.sleep(1000);
        System.out.println("Secim paneline yönlendiriliyorsunuz...");
        Thread.sleep(3000);
    }
}


