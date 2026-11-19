package tarea14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cuadrado_relleno {

	public static void main(String[] args) throws IOException {
		char[][] matriz = new char[20][20];
		int opcion;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		LimpiarMatriz(matriz);

		do {
			System.out.println("=================================");
			System.out.println("MENU DE PATRONES");
			System.out.println("1. Cuadrado relleno");
			System.out.println("2. Cuadrado hueco");
			System.out.println("3. Triangulo rectangulo izquierdo");
			System.out.println("4. Triangulo rectangulo derecho");
			System.out.println("5. Piramide");
			System.out.println("6. Piramide invertida");
			System.out.println("7. Rombo");
			System.out.println("8. Diagonal principal");
			System.out.println("9. Diagonal secundaria");
			System.out.println("10. X (ambas diagonales)");
			System.out.println("11. Mostrar matriz actual");
			System.out.println("0. Salir");
			System.out.print("Elige una opcion: ");
			opcion = Integer.parseInt(br.readLine());

			switch (opcion) {
			case 1:
				CuadradoRelleno(matriz);
				break;
			case 2:
				CuadradoHueco(matriz);
				break;
			case 3:
				TrianguloIzq(matriz);
				break;
			case 4:
				TrianguloDer(matriz);
				break;
			case 5:
				Piramide(matriz);
				break;
			case 6:
				PiramideInvertida(matriz);
				break;
			case 7:
				Rombo(matriz);
				break;
			case 8:
				DiagonalPrincipal(matriz);
				break;
			case 9:
				DiagonalSecundaria(matriz);
				break;
			case 10:
				Equis(matriz);
				break;
			case 11:
				MostrarMatriz(matriz);
				break;
			case 0:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Opcion no valida.");
			}
		} while (opcion != 0);
	}

	public static void LimpiarMatriz(char[][] m) {
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				m[i][j] = ' ';
			}
		}
	}

	public static void CuadradoRelleno(char[][] m) {
		LimpiarMatriz(m);
		for (int i = 4; i <= 13; i++) {
			for (int j = 4; j <= 13; j++) {
				m[i][j] = '*';
			}
		}
		System.out.println("Patron: Cuadrado relleno generado.");
		MostrarMatriz(m);
	}

	public static void CuadradoHueco(char[][] m) {
		LimpiarMatriz(m);
		for (int i = 4; i <= 13; i++) {
			for (int j = 4; j <= 13; j++) {
				if (i == 4 || i == 13 || j == 4 || j == 13) {
					m[i][j] = '*';
				}
			}
		}
		System.out.println("Patron: Cuadrado hueco generado.");
		MostrarMatriz(m);
	}

	public static void TrianguloIzq(char[][] m) {
		LimpiarMatriz(m);
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <= i; j++) {
				m[i][j] = '*';
			}
		}
		System.out.println("Patron: Triangulo izquierdo generado.");
		MostrarMatriz(m);
	}

	public static void TrianguloDer(char[][] m) {
		LimpiarMatriz(m);
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <= i; j++) {
				m[i][9 - j] = '*';
			}
		}
		System.out.println("Patron: Triangulo derecho generado.");
		MostrarMatriz(m);
	}

	public static void Piramide(char[][] m) {
		int centro = 9;
		LimpiarMatriz(m);
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <= i; j++) {
				m[i][centro - (i - j)] = '*';
				m[i][centro + (i - j)] = '*';
			}
		}
		System.out.println("Patron: Piramide generada.");
		MostrarMatriz(m);
	}

	public static void PiramideInvertida(char[][] m) {
		int centro = 9;
		LimpiarMatriz(m);
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < (10 - i); j++) {
				m[i][centro - (9 - i - j)] = '*';
				m[i][centro + (9 - i - j)] = '*';
			}
		}
		System.out.println("Patron: Piramide invertida generada.");
		MostrarMatriz(m);
	}

	public static void Rombo(char[][] m) {
		int centro = 9;
		LimpiarMatriz(m);
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <= i; j++) {
				m[i][centro - (i - j)] = '*';
				m[i][centro + (i - j)] = '*';
			}
		}
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < (9 - i); j++) {
				m[i + 10][centro - ((8 - i) - j)] = '*';
				m[i + 10][centro + ((8 - i) - j)] = '*';
			}
		}
		System.out.println("Patron: Rombo generado.");
		MostrarMatriz(m);
	}

	public static void DiagonalPrincipal(char[][] m) {
		LimpiarMatriz(m);
		for (int i = 0; i < 20; i++) {
			m[i][i] = '*';
		}
		System.out.println("Patron: Diagonal principal generada.");
		MostrarMatriz(m);
	}

	public static void DiagonalSecundaria(char[][] m) {
		LimpiarMatriz(m);
		for (int i = 0; i < 20; i++) {
			m[i][19 - i] = '*';
		}
		System.out.println("Patron: Diagonal secundaria generada.");
		MostrarMatriz(m);
	}

	public static void Equis(char[][] m) {
		LimpiarMatriz(m);
		for (int i = 0; i < 20; i++) {
			m[i][i] = '*';
			m[i][19 - i] = '*';
		}
		System.out.println("Patron: X (diagonales cruzadas) generada.");
		MostrarMatriz(m);
	}

	public static void MostrarMatriz(char[][] m) {
		System.out.println();
		System.out.println("+--------------------+");
		for (int i = 0; i < 20; i++) {
			System.out.print("|");
			for (int j = 0; j < 20; j++) {
				System.out.print(m[i][j]);
			}
			System.out.println("|");
		}
		System.out.println("+--------------------+");
		System.out.println();
	}
}