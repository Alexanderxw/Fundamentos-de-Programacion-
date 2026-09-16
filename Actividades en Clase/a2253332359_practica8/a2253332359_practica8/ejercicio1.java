package a2253332359_practica8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio1 {

    public static void main(String[] args) throws IOException {

        int num;
        int unidades, decenas;
        String cadena = "";

        BufferedReader entrada = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("Introduzca un número (0 a 99): ");
        num = Integer.parseInt(entrada.readLine());

        unidades = num % 10;
        decenas = num / 10;

        switch (decenas) {
            case 0: cadena = ""; break;
            case 1: cadena = "diez"; break;
            case 2: cadena = "veinte"; break;
            case 3: cadena = "treinta"; break;
            case 4: cadena = "cuarenta"; break;
            case 5: cadena = "cincuenta"; break;
            case 6: cadena = "sesenta"; break;
            case 7: cadena = "setenta"; break;
            case 8: cadena = "ochenta"; break;
            case 9: cadena = "noventa"; break;
        }

        switch (unidades) {

            case 0:
                cadena = cadena + "";
                break;

            case 1:
                if (decenas == 0)
                    cadena = "uno";
                else if (decenas != 1)
                    cadena = cadena + " y uno";
                break;

            case 2:
                if (decenas == 0)
                    cadena = "dos";
                else if (decenas != 1)
                    cadena = cadena + " y dos";
                break;

            case 3:
                if (decenas == 0)
                    cadena = "tres";
                else if (decenas != 1)
                    cadena = cadena + " y tres";
                break;

            case 4:
                if (decenas == 0)
                    cadena = "cuatro";
                else if (decenas != 1)
                    cadena = cadena + " y cuatro";
                break;

            case 5:
                if (decenas == 0)
                    cadena = "cinco";
                else if (decenas != 1)
                    cadena = cadena + " y cinco";
                break;

            case 6:
                if (decenas == 0)
                    cadena = "seis";
                else if (decenas != 1)
                    cadena = cadena + " y seis";
                break;

            case 7:
                if (decenas == 0)
                    cadena = "siete";
                else if (decenas != 1)
                    cadena = cadena + " y siete";
                break;

            case 8:
                if (decenas == 0)
                    cadena = "ocho";
                else if (decenas != 1)
                    cadena = cadena + " y ocho";
                break;

            case 9:
                if (decenas == 0)
                    cadena = "nueve";
                else if (decenas != 1)
                    cadena = cadena + " y nueve";
                break;
        }

        System.out.println(cadena);
    }
}