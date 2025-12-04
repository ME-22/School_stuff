package data;

public class potkukelkka extends kulkuneuvo {
  
	public potkukelkka(float hinta, String vari, int maksimiNopeus, int nopeus) {
    super(hinta, vari, maksimiNopeus, nopeus);
  }

  private int jalasPituus;

	public int getJalasPituus() {
		return jalasPituus;
	}

	public void setJalasPituus(int jalasPituus) {
		this.jalasPituus = jalasPituus;
	}
}
