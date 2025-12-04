package Tuomari;
public class Tuomari {
  private int id;
  private String nimi;
  private String maa;

  public Tuomari(int id, String nimi, String maa) {
    this.id = id;
    this.nimi = nimi;
    this.maa = maa;
  }

  public Tuomari() {
  }

  public int getId() {
    return id;
  }
  public String getNimi() {
    return nimi;
  }
  public String getMaa() {
    return maa;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setNimi(String nimi) {
    this.nimi = nimi;
  }

  public void setMaa(String maa) {
    this.maa = maa;
  }

  
}
