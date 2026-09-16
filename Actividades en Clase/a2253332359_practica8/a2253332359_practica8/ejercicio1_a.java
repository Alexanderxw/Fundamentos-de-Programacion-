package a2253332359_practica8;

import java.util.Scanner;

public class ejercicio1_a {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num;
        int unidades, decenas;
        String cadena = "";

        System.out.print("Introduzca un número (0 a 99): ");
        num = entrada.nextInt();

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
                break;

            case 1:
                if (decenas == 0)
                    cadena = "uno";
                else if (decenas != 1)
                    cadena += " y uno";
                break;

            case 2:
                if (decenas == 0)
                    cadena = "dos";
                else if (decenas != 1)
                    cadena += " y dos";
                break;

            case 3:
                if (decenas == 0)
                    cadena = "tres";
                else if (decenas != 1)
                    cadena += " y tres";
                break;
        }

        System.out.println("Número en texto: " + cadena);

        entrada.close();
    }
}    