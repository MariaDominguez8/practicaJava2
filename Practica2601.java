package clase2601;

import java.util.Scanner;

public class Practica2601 {

	/*
	 * Ejemplo 2.14 Una compa��a de paqueter�a internacional tiene servicio en
	 * algunos pa�ses de Am�rica del Norte, Am�rica Central, Am�rica del Sur, Europa
	 * y Asia. El costo por el servicio de paqueter�a se basa en el peso del paquete
	 * y la zona a la que va dirigido. Lo anterior se muestra en la siguiente tabla:
	 * 
	 * Zona Ubicaci�n Costo 1 Am�rica del Norte $11.00 2 Am�rica Central $10.00 3
	 * Am�rica del Sur $12.00 4 Europa $24.00 5 Asia $27.00
	 * 
	 * Parte de su pol�tica implica que los paquetes con un peso superior a 5 kg no
	 * son transportados, esto por cuestiones de log�stica y de seguridad. Realice
	 * un algoritmo para determinar el cobro por la entrega de un paquete o, en su
	 * caso, el rechazo de la entrega.
	 *
	 */

	public static void main(String[] param) {

		int zona;
		float pesoPaq, costoEntrega = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese el peso del paquete expresado en gramos: ");
		pesoPaq = scan.nextFloat();
		if (pesoPaq > 5000) {
			System.out.println("No se puede dar el servicio");

		} else {

			System.out.println(
					"Zonas disponibles a enviar : 1. Am�rica del Norte - 2. Am�rica Central - 3. Am�rica del Sur - 4. Europa - 5. Asia ");
			zona = scan.nextInt();

			switch (zona) {
			case 1:
				costoEntrega = pesoPaq * 11;
				break;
			case 2:
				costoEntrega = pesoPaq * 10;
				break;
			case 3:
				costoEntrega = pesoPaq * 12;
				break;
			case 4:
				costoEntrega = pesoPaq * 24;
				break;
			case 5:
				costoEntrega = pesoPaq * 27;
			}

			/*
			 * if (zona == 1) { costoEntrega = pesoPaq * 11; } else if (zona == 2) {
			 * costoEntrega = pesoPaq * 10; } else if (zona == 3) { costoEntrega = pesoPaq *
			 * 12; } else if (zona == 4) { costoEntrega = pesoPaq * 24; } else {
			 * costoEntrega = pesoPaq * 27; } Este m�todo de ifs anidados ya no es utilizado
			 * e incluso es m�s pesado que switch
			 */

			System.out.println("El costo del servicio por la entrega de este paquete es de : $" + costoEntrega);

		}

	}
}