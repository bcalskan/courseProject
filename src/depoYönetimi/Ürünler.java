package depoYönetimi;

public class Ürünler {

    private String ürünIsmi;
    private String üretici;
    private int ürünMiktari;
    private String birim;
    private String raf;


    public Ürünler(String ürünIsmi, String üretici, String birim, String raf, int ürünMiktari) {
        this.ürünIsmi = ürünIsmi;
        this.üretici = üretici;
        this.birim = birim;
        this.raf = raf;
        this.ürünMiktari = ürünMiktari;
    }

    public Ürünler() {

    }

    public String getÜrünIsmi() {
        return ürünIsmi;
    }

    public void setÜrünIsmi(String ürünIsmi) {
        this.ürünIsmi = ürünIsmi;
    }

    public String getÜretici() {
        return üretici;
    }

    public void setÜretici(String üretici) {
        this.üretici = üretici;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public String getRaf() {
        return raf;
    }

    public void setRaf(String raf) {
        this.raf = raf;
    }

    public int getÜrünMiktari() {
        return ürünMiktari;
    }

    public void setÜrünMiktari(int ürünMiktari) {
        this.ürünMiktari = ürünMiktari;
    }

    @Override
    public String toString() {
        return "Ürünler{" +
                "ürünIsmi='" + ürünIsmi + '\'' +
                ", üretici='" + üretici + '\'' +
                ", ürünMiktari=" + ürünMiktari +
                ", birim='" + birim + '\'' +
                ", raf='" + raf + '\'' +
                '}';
    }
}
