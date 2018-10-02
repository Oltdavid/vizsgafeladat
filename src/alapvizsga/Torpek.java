package alapvizsga;

public class Torpek {

	private String nev;
	private String Tarna;
	private String nem;
	private int kor;
	private int magassag;

	public Torpek(String nev, String tarna, String nem, int kor, int magassag) {

		this.nev = nev;
		Tarna = tarna;
		this.nem = nem;
		this.kor = kor;
		this.magassag = magassag;
	}

	@Override
	public String toString() {
		return "torpe [nev=" + nev + ", Tarna=" + Tarna + ", nem=" + nem + ", kor=" + kor + ", magassag=" + magassag
				+ "]";
	}

	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public String getTarna() {
		return Tarna;
	}

	public void setTarna(String tarna) {
		Tarna = tarna;
	}

	public String getNem() {
		return nem;
	}

	public void setNem(String nem) {
		this.nem = nem;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMagassag() {
		return magassag;
	}

	public void setMagassag(int magassag) {
		this.magassag = magassag;
	}

}
