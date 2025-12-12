package data;

public class potkukelkka extends kulkuneuvo {

	public potkukelkka(float hinta, String vari, int maksimiNopeus) {
    super(hinta, vari, maksimiNopeus);
  }

  private int jalasPituus;

	public int getJalasPituus() {
		return jalasPituus;
	}

	public void setJalasPituus(int jalasPituus) {
		this.jalasPituus = jalasPituus;
	}
}
