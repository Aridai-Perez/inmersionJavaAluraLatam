package inmersionAlura;

import java.util.Scanner;

import inmersionAluraMetodos.Peliculas;
import inmersionAluraMetodos.Series;

public class Menu_Opciones {
	
	public void mostrarMenu() {
		Scanner teclado = new Scanner(System.in);
		int opcion = 0;
		while (opcion != 3) {
			String menu = """
					**** Bienvenido a Screenmatch ****
					Escriba el numero de la opcion que desees realizar.
					1) Peliculas
					2) Series
					3) Salir
					""";
			System.out.println(menu);
			opcion = teclado.nextInt();
			teclado.nextLine();
			
			switch (opcion) {
			case 1:
				Peliculas menuPelis = new Peliculas();
				menuPelis.menuPeliculas();
				break;
			case 2:
				Series menuSeries = new Series();
				menuSeries.menuSeries();
				break;
			case 3: 
				System.out.println("Gracias por usar Screenmatch, hasta luego!");
				break;
			default:
				System.out.println("Opcion no valida");
				break;
			}
		}
		
		teclado.close();
	}
	
}