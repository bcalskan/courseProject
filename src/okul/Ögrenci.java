package okul;

public class Ögrenci extends KisiGenel {

    private String numara;
    private String sinif;

    public Ögrenci(String adSoyad, String kimlikNumarasi, int yas, String numara, String sinif) {
        super(adSoyad, kimlikNumarasi, yas);
        this.numara = numara;
        this.sinif = sinif;
    }

    public String getNumara() {
        return numara;
    }

    public void setNumara(String numara) {
        this.numara = numara;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return "Ögrenci{" +
                "numara='" + numara + '\'' +
                ", sinif='" + sinif + '\'' +
                '}';
    }
}
