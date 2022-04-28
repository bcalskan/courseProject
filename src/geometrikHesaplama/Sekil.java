package geometrikHesaplama;

public class Sekil {

    int kisaKenar;
    int uzunKenar;
    int yaricap;
    int kareKenar;

    public Sekil(int yaricap) {
        this.yaricap = yaricap;
    }

    public Sekil() {
        //default parametresiz
    }

    public Sekil(int kisaKenar, int uzunKenar) {
        this.kisaKenar = kisaKenar;
        this.uzunKenar = uzunKenar;
    }

    public double cevreHesaplamaKare() {
        return (kareKenar * 4);
    }

    public double alanHesaplamaKare() {
        return kareKenar * kareKenar;
    }

    public double cevreHesaplama() {
        return (kisaKenar + uzunKenar) * 2;
    }

    public double alanHesaplama() {
        return kisaKenar * uzunKenar;
    }

    public double alanHesaplamaCember(int yaricap) {
        return 3.14 * yaricap * yaricap;
    }




}
