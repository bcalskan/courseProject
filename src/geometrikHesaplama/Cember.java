package geometrikHesaplama;

public class Cember extends Sekil {
    public Cember(int yaricap) {
        super(yaricap);
    }

    public double cevreHesaplama() {
        return yaricap * 2 * 3.14;
    }

    public double alanHesaplamaCember() {
        return yaricap * yaricap * 3.14;
    }

    @Override
    public String toString() {
        return "Cember yaricap = "+yaricap+"\nCember cevresi : "+cevreHesaplama()+"Cember alani : "+alanHesaplamaCember();
    }
}
