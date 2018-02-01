import java.io.*;

public class Tabulacion {

	public static void main(String[] args) throws IOException {
		String x;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Escribe tu nombre: ");
		x = br.readLine();
		System.out.print("Hola " + x + ", escribe tu edad: ");
		String edadString = br.readLine();
		int edadEntero = Integer.parseInt(edadString);
		System.out.println("El próximo año tendrás: " + (edadEntero + 1));
	}
}
