package okul;

import java.util.Locale;

public class KisiGenel {

    private String adSoyad;
    private String kimlikNumarasi;
    private int yas;


    public KisiGenel(String adSoyad, String kimlikNumarasi, int yas) {
        setAdSoyad(adSoyad);
        this.kimlikNumarasi = kimlikNumarasi;
        setYas(yas);
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad.toUpperCase();
    }

    public String getKimlikNumarasi() {
        return kimlikNumarasi;
    }

    public void setKimlikNumarasi(String kimlikNumarasi) {
        this.kimlikNumarasi = kimlikNumarasi;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas < 0) {
            this.yas = -yas;
        } else this.yas = yas;

    }

    @Override
    public String toString() {
        return "KisiGenel{" +
                "adSoyad='" + adSoyad + '\'' +
                ", kimlikNumarasi='" + kimlikNumarasi + '\'' +
                ", yas=" + yas +
                '}';
    }
}
