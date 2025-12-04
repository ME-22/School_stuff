package data;

public class kulkuneuvo {
	private float hinta;
	private String vari;
	private int maksimiNopeus;
	private int nopeus;
	
	public kulkuneuvo(){
		
	}	

	public kulkuneuvo(float hinta, String vari, int maksimiNopeus, int nopeus) {
		this.hinta = hinta;
		this.vari = vari;
		this.maksimiNopeus = maksimiNopeus;
		this.nopeus = nopeus;
	}

	public float getHinta() {
		return hinta;
	}
	public void setHinta(float hinta) {
		this.hinta = hinta;
	}
	public String getVari() {
		return vari;
	}
	public void setVari(String vari) {
		this.vari = vari;
	}
	public int getMaksimiNopeus() {
		return maksimiNopeus;
	}
	public void setMaksimiNopeus(int maksimiNopeus) {
		this.maksimiNopeus = maksimiNopeus;
	}
	public int getNopeus() {
		return nopeus;
	}
	public void setNopeus(int nopeus) {
		this.nopeus = nopeus;
	}

	public void kiihdyta(int maara) {
			this.nopeus += maara;
	}

	public void hidasta(int maara) {
			this.nopeus -= maara;
	}
}
