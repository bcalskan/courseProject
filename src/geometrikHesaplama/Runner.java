package geometrikHesaplama;

public class Runner {
    public static void main(String[] args) {
        Cember c = new Cember(8);
        c.cevreHesaplama();
        c.alanHesaplamaCember();
        System.out.println(c);


        Dikdörtgen dik = new Dikdörtgen(5, 8);
        dik.alanHesaplama();
        dik.cevreHesaplama();
        System.out.println(dik);


        Kare kare = new Kare(8);
        kare.alanHesaplamaKare();
        kare.cevreHesaplama();
        System.out.println(kare);

    }


}
