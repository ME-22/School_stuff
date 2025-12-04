package data;

public class sarmio extends suorakaide {
	private int syvyys;

	public int getSyvyys() {
		return syvyys;
	}
	public void setSyvyys(int syvyys) {
		this.syvyys = syvyys;
	}
	public int getTilavuus() {
		return this.getLeveys()*this.getKorkeus()*this.syvyys;
		//Myös: return this.getPintaAla()*this.getSyvyys(); 
	}
}
