package data;

public class suorakaide {
	private int leveys;
	private int korkeus;
	public int getLeveys() {
		return leveys;
	}
	public void setLeveys(int leveys) {
		this.leveys = leveys;
	}
	public int getKorkeus() {
		return korkeus;
	}
	public void setKorkeus(int korkeus) {
		this.korkeus = korkeus;
	}
	public int getPintaAla() {
		return this.leveys*this.korkeus;
	}
}
