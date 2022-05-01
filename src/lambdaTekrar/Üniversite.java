package lambdaTekrar;

public class Üniversite {

    private String üniversite;
    private String bölüm;
    private int ögrenciSayisi;
    private int notOrtalamasi;

    public Üniversite() {
    }

    public Üniversite(String üniversite, String bölüm, int ögrenciSayisi, int notOrtalamasi) {
        this.üniversite = üniversite;
        this.bölüm = bölüm;
        this.ögrenciSayisi = ögrenciSayisi;
        this.notOrtalamasi = notOrtalamasi;
    }

    public String getÜniversite() {
        return üniversite;
    }

    public void setÜniversite(String üniversite) {
        this.üniversite = üniversite;
    }

    public String getBölüm() {
        return bölüm;
    }

    public void setBölüm(String bölüm) {
        this.bölüm = bölüm;
    }

    public int getÖgrenciSayisi() {
        return ögrenciSayisi;
    }

    public void setÖgrenciSayisi(int ögrenciSayisi) {
        this.ögrenciSayisi = ögrenciSayisi;
    }

    public int getNotOrtalamasi() {
        return notOrtalamasi;
    }

    public void setNotOrtalamasi(int notOrtalamasi) {
        this.notOrtalamasi = notOrtalamasi;
    }

    @Override
    public String toString() {
        return "Üniversite{" +
                "üniversite='" + üniversite + '\'' +
                ", bölüm='" + bölüm + '\'' +
                ", ögrenciSayisi=" + ögrenciSayisi +
                ", notOrtalamasi=" + notOrtalamasi +
                '}';
    }
}
