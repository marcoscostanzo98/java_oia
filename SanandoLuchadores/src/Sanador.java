
public class Sanador {

	private int magia;
	
	public Sanador(int magia) {
		this.magia = magia;
	}
	
	public int getMagia() {
		return this.magia;
	}
	
	public void restarMagia(int magia) {
		if (this.magia - magia < 0) {
			this.magia = 0;
		}
		else {
			this.magia -= magia;
		}
	}
	
	public boolean puedeCurarADist1() {
		return this.magia >= 3;
	}
	
	public boolean puedeCurarADist2() {
		return this.magia >= 5;
	}
	
}
