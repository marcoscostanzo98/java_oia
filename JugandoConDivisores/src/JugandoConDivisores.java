import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JugandoConDivisores {

	private int numInicial;
	private int[] res = new int[2];
	
	public JugandoConDivisores(int numInicial) {
		this.numInicial = numInicial;
	}
	
	public static void main(String[] args) throws IOException {
		JugandoConDivisores jcd = leerArchivo("entrada.in");
		jcd.resolver();
		jcd.escribirArchivo("salida.out");
	}

	private static JugandoConDivisores leerArchivo(String path) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(path));
		
		int numInicial = sc.nextInt();
		
		sc.close();
		
		return new JugandoConDivisores(numInicial);
	}
	
	public void resolver() {
		ArrayList<Integer> listaPrimos = listaPrimos(this.numInicial);
		
		int pizarron = this.numInicial;
		int sumaTotal = pizarron;
		int i = 0;
		
		// Iteraremos buscando el primo mas chico
		while (pizarron > 1 && i < listaPrimos.size()) {
			int primo = listaPrimos.get(i);
			while (pizarron % primo == 0 && i < listaPrimos.size()) {
				pizarron /= 2;
				sumaTotal += pizarron;
				i++;
			}
			
			i = 0;
		}
		
		this.res[0] = sumaTotal;
		this.res[1] = 0;
		
	}

	private ArrayList<Integer> listaPrimos(int numero) {
		ArrayList<Integer> primos = new ArrayList<Integer>();
		
		if (numero == 1) {
			return primos;
		}
		
		int inicial = 2;
		
		while (inicial < numero) {
			if (esPrimo(inicial)) {
				primos.add(inicial);
			}
			
			inicial++;
		}
		
		return primos;
	}
	
    public static boolean esPrimo(int numero){
        int contador = 2;
        boolean primo=true;
        while ((primo) && (contador!=numero)){
          if (numero % contador == 0) //validamos cuando no es primo
            primo = false;
          contador++;
        }
        return primo;
    }
	
	private void escribirArchivo(String path) throws IOException {
		PrintWriter pw = new PrintWriter(new FileWriter(path));
		
		pw.print(this.res[0] + " " + this.res[1]);
		
		pw.close();
	}
	
}
