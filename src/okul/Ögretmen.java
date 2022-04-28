package okul;

public class Ögretmen extends KisiGenel{


  private String bölüm;
  private String sicilNumarasi;

  public Ögretmen(String adSoyad, String kimlikNumarasi, int yas, String bölüm, String sicilNumarasi) {
    super(adSoyad, kimlikNumarasi, yas);
    this.bölüm = bölüm;
    this.sicilNumarasi = sicilNumarasi;
  }

  public String getBölüm() {
    return bölüm;
  }

  public void setBölüm(String bölüm) {
    this.bölüm = bölüm;
  }

  public String getSicilNumarasi() {
    return sicilNumarasi;
  }

  public void setSicilNumarasi(String sicilNumarasi) {
    this.sicilNumarasi = sicilNumarasi;
  }

  @Override
  public String toString() {
    return "Ögretmen{" +
            "bölüm='" + bölüm + '\'' +
            ", sicilNumarasi='" + sicilNumarasi + '\'' +
            '}';
  }
}
