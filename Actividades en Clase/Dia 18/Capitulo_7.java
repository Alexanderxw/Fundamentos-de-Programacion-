package dia18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Capitulo_7 {
	static String ventas[][];
	static int posventas = -1;
	static int tamventas = 100;
	static String fecha;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ventas = CrearVenta();
		String ultimo = UltimoTicket(posventas, ventas);
		System.out.println("Ultimo ticket registrado: " + ultimo);
		String[][] ticketActual = CrearTicket();
		System.out.print("Ingresa el codigo del producto: ");
		ticketActual[0][0] = br.readLine();
		System.out.print("Ingresa el nombre del producto: ");
		ticketActual[0][1] = br.readLine();
		System.out.print("Ingresa el precio: ");
		ticketActual[0][2] = br.readLine();
		System.out.print("Ingresa la cantidad: ");
		ticketActual[0][3] = br.readLine();
		System.out.print("Ingresa el codigo a buscar en el ticket: ");
		String codigoBuscar = br.readLine();
		int posicionEncontrada = ExisteTicketCodigo(ticketActual, codigoBuscar);
		if (posicionEncontrada != -1) {
			System.out.println("El producto ya esta en el ticket, en la fila: " + posicionEncontrada);
		} else {
			System.out.println("El producto no se encuentra en el ticket.");
		}
	}

	public static String[][] CrearVenta() {
		return new String[tamventas][5];
	}

	public static String UltimoTicket(int pos, String[][] mventa) {
		String idticket = "000";
		if (pos > -1) {
			idticket = mventa[pos][0];
		}
		return idticket;
	}

	public static String[][] CrearTicket() {
		return new String[20][4];
	}

	public static int ExisteTicketCodigo(String[][] mticket, String codigo) {
		int enc = -1;
		int pos = ObtenerUltimaPosicion(mticket);
		System.out.println("buscando " + codigo + " tamaño arreglo " + pos);
		for (int ciclo = 0; ciclo <= pos; ciclo++) {
			if (mticket[ciclo][0].compareTo(codigo.trim()) == 0) {
				enc = ciclo;
				return enc;
			}
		}
		return enc;
	}

	public static int ObtenerUltimaPosicion(String[][] matriz) {
		int ultimaPosicion = -1;
		for (int i = 0; i < matriz.length; i++) {
			if (matriz[i][0] != null && !matriz[i][0].trim().isEmpty()) {
				ultimaPosicion = i;
			} else {
				break;
			}
		}
		return ultimaPosicion;
	}
}