package data;

public class mopo extends kulkuneuvo {
  private String moottorimerkki;
  private String tyyppi;

  public mopo(float hinta, String vari, int maksimiNopeus, int nopeus, String moottorimerkki, String tyyppi) {
    super(hinta, vari, maksimiNopeus, nopeus);
    this.moottorimerkki = moottorimerkki;
    this.tyyppi = tyyppi;
  }

  public String getMoottorimerkki() {
    return moottorimerkki;
  }
  public String getTyyppi() {
    return tyyppi;
  }
  public void setMoottorimerkki(String moottorimerkki) {
    this.moottorimerkki = moottorimerkki;
  }
  public void setTyyppi(String tyyppi) {
    this.tyyppi = tyyppi;
  }
  
}
