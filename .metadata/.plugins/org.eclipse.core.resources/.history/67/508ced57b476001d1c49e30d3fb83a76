
public class Luchador implements Comparable<Luchador> {

	private int vidaInicial;
	private int vidaActual;
	private int distanciaHealer;
	
	public Luchador(int vidaInicial, int vidaActual, int distanciaHealer) {
		this.vidaInicial = vidaInicial;
		this.vidaActual = vidaActual;
		this.distanciaHealer = distanciaHealer;
	}
	
	public int getVidaInicial() {
		return this.vidaInicial;
	}

	public void setVidaInicial(int vidaInicial) {
		this.vidaInicial = vidaInicial;
	}

	public int getVidaActual() {
		return this.vidaActual;
	}

	public void setVidaActual(int vidaActual) {
		if (this.vidaActual == this.vidaInicial) {
			return;
		}
		else if (this.vidaActual + vidaActual > this.vidaInicial) {
			this.vidaActual = vidaInicial;
		}
		else {
			this.vidaActual += vidaActual;
		}
		
	}

	public int getDistanciaHealer() {
		return this.distanciaHealer;
	}

	public void setDistanciaHealer(int distanciaHealer) {
		this.distanciaHealer = distanciaHealer;
	}
	
	public boolean tieneVidaMaxima() {
		return this.vidaActual == this.vidaInicial;
	}

	@Override
	public int compareTo(Luchador o) {
		if (this.vidaActual < o.vidaActual) {
			return -1;
		}
		else if (this.vidaActual > o.vidaActual) {
			return 1;
		}

		return 0;
	}
	
}
