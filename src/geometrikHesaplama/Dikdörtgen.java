package geometrikHesaplama;

public class Dikdörtgen extends Sekil {
    public Dikdörtgen(int uzunKenar, int kisaKenar) {
        super(uzunKenar, kisaKenar);
    }

    public Dikdörtgen(int kareKenar) {
    }


    public double cevreHesaplama() {
        return super.cevreHesaplama();
    }

    public double alanHesaplama() {
        return super.alanHesaplama();
    }

    @Override
    public String toString() {
        return "UzunKenar = " + uzunKenar + ", kisaKenar = " + kisaKenar + ", \n dikdortgen cevre = " + cevreHesaplama()
                + ", \n dikdortgen alan = " + alanHesaplama();
    }

}
