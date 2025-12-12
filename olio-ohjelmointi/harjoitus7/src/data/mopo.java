package data;

public class mopo extends kulkuneuvo {
  private String moottorimerkki;
  private String tyyppi;

  public mopo() {
    super();
  }

  public mopo(String moottorimerkki, String tyyppi) {
    super();
    this.moottorimerkki = moottorimerkki;
    this.tyyppi = tyyppi;
  }

  public mopo(float hinta, String vari, int maksimiNopeus, String moottorimerkki, String tyyppi) {
    super(hinta, vari, maksimiNopeus);
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
