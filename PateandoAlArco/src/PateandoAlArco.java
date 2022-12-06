import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PateandoAlArco {
	
	private int x;
	private int y;
	private String res;
	
	public PateandoAlArco(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public static void main(String[] args) throws IOException {
		PateandoAlArco pa = leerArchivo("entrada.in");
		pa.resolver();
		pa.escribirArchivo("salida.out");
	}

	private static PateandoAlArco leerArchivo(String path) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileReader(path));
		
		int ancho = sc.nextInt();
		int largo = sc.nextInt();
		
		sc.close();
		
		return new PateandoAlArco(ancho, largo);
	}
	
	private void resolver() {
		Arco arc = new Arco();
		
		if (this.x < arc.getAncho() && this.x > 0 && this.y < arc.getLargo() && this.y > 0) {
			this.res = "GOL";
		}
		else if (this.x > arc.getAncho() && this.y > arc.getLargo()) {
			this.res = "AFUERA";
		}
		else {
			this.res = "PALO";
		}
	}
	
	private void escribirArchivo(String path) throws IOException {
		PrintWriter pw = new PrintWriter(new FileWriter(path));
		
		pw.print(this.res);
		
		pw.close();
	}
}
