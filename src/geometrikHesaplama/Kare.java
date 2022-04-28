package geometrikHesaplama;

public class Kare extends Dikdörtgen {
    public Kare(int kareKenar) {
        super(kareKenar);
    }

    public double alanHesaplamaKare(){
        return kareKenar*kareKenar;
    }

    public double cevreHesaplamaKare(){
        return kareKenar*4;
    }

    @Override
    public String toString() {
        return "Kare kenari : "+kareKenar+"\nKare cevresi : "+cevreHesaplamaKare()+"\nKare alani : "+alanHesaplamaKare();
    }
}
