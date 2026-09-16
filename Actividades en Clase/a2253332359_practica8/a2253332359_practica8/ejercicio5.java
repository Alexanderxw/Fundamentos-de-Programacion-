package a2253332359_practica8;


	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;

	class ejercicio5 {

	    public static void main(String[] args) throws IOException {

	        String producto1, producto2;
	        double precio1, precio2;
	        double iva1, iva2;
	        double subtotal1, subtotal2;
	        double total1, total2;

	        int opc, cant1, cant2;

	        BufferedReader entrada = new BufferedReader(
	                new InputStreamReader(System.in));

	        producto1 = "coca cola light lata 400 ml";
	        producto2 = "coca cola lata 400 ml";

	        precio1 = 16;
	        precio2 = 15;

	        System.out.println("Menu de Opciones");
	        System.out.println("1.- Productos");
	        System.out.println("2.- Punto de venta");
	        System.out.print("Que opcion deseas: ");

	        opc = Integer.parseInt(entrada.readLine());

	        switch (opc) {

	            case 1:

	                System.out.println("Elegiste la opcion de productos");
	                System.out.println("El " + producto1 + " cuesta $" + precio1);
	                System.out.println("El " + producto2 + " cuesta $" + precio2);

	                break;

	            case 2:

	                System.out.print("Introduzca la cantidad comprada de "
	                        + producto1 + ": ");
	                cant1 = Integer.parseInt(entrada.readLine());

	                System.out.print("Introduzca la cantidad comprada de "
	                        + producto2 + ": ");
	                cant2 = Integer.parseInt(entrada.readLine());

	                subtotal1 = cant1 * precio1;
	                iva1 = subtotal1 * 0.16;
	                total1 = subtotal1 + iva1;

	                System.out.println("\n" + cant1 + " " + producto1);
	                System.out.println("Subtotal fue: $" + subtotal1);
	                System.out.println("IVA fue: $" + iva1);
	                System.out.println("Total fue: $" + total1);

	                subtotal2 = cant2 * precio2;
	                iva2 = subtotal2 * 0.16;
	                total2 = subtotal2 + iva2;

	                System.out.println("\n" + cant2 + " " + producto2);
	                System.out.println("Subtotal fue: $" + subtotal2);
	                System.out.println("IVA fue: $" + iva2);
	                System.out.println("Total fue: $" + total2);

	                System.out.println("\n===== TOTAL DE LA VENTA =====");
	                System.out.println("Subtotal fue: $"
	                        + (subtotal1 + subtotal2));
	                System.out.println("IVA fue: $"
	                        + (iva1 + iva2));
	                System.out.println("Total fue: $"
	                        + (total1 + total2));

	                break;

	            default:

	                System.out.println("Seleccion incorrecta");
	        }
	    }
	}
