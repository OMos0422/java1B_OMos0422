package course57;

public class Player {
	private int kinryoku;
	private int gakuryoku;
	private int mitame;
	private int omosiro;

	public int getKinryoku() {
		return kinryoku;
	}

	public void setKinryoku(int kiryoku) {
		this.kinryoku = kiryoku;
		System.out.println("筋力は " + kinryoku);
	}

	public int getGakuryoku() {
		return gakuryoku;
	}

	public void setGakuryoku(int gakuryoku) {
		this.gakuryoku = gakuryoku;
		System.out.println("学力は " + gakuryoku);
	}

	public int getMitame() {
		return mitame;
	}

	public void setMitame(int mitame) {
		this.mitame = mitame;
		System.out.println("見た目 " + mitame);
	}

	public int getOmosiro() {
		return omosiro;
	}

	public void setOmosiro(int omosiro) {
		this.omosiro = omosiro;
		System.out.println("面白さ " + omosiro);
	}

}
