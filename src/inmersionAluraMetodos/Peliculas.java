package inmersionAluraMetodos;

import java.util.ArrayList;
import java.util.Scanner;

import inmersionAlura.Menu_Opciones;
import inmersionAluraModelos.Pelicula;

public class Peliculas {
	Scanner teclado = new Scanner(System.in);
	
	private ArrayList<Pelicula> pelis = new ArrayList<>();
	
	public void menuPeliculas() {
		predeterminadas();
		int opcion = 0;
		while (opcion != 4) {
			String menu = """
					**** Bienvenido a Screenmatch ****
					++ Peliculas ++
					Escriba el numero de la opcion que desees realizar.
					1) Agregar nueva pelicula
					2) Ver la lista de peliculas
					3) Volver a menu principal
					""";
			System.out.println(menu);
			opcion = teclado.nextInt();
			teclado.nextLine();
			
			switch (opcion) {
			case 1:
				agregarPelicula();
				break;
			case 2:
				listarPeliculas();
				break;
			case 3: 
				Menu_Opciones displayMenu = new Menu_Opciones();
				displayMenu.mostrarMenu();
			default:
				System.out.println("Opcion no valida");
				break;
			}
		}
		teclado.close();
		
	}
	
	private void predeterminadas() {
		Pelicula tierraOsos = new Pelicula();
		tierraOsos.setCategoria("Pelicula");
		tierraOsos.setNombre("Tierra de osos");
		tierraOsos.setFechaDeLanzamiento(2022);
		tierraOsos.setEvaluacion(4.0);
		tierraOsos.setIncluidoEnPlanBasico(true);
		tierraOsos.setSinopsis("Un joven que busca vengar la muerte de su hermano se transforma en oso y hace amistad con un cachorro que acaba de perder a su madre.");
		tierraOsos.setDuracionEnMinutos(85);
		tierraOsos.setDirector("Aaron Blaise");
		this.pelis.add(tierraOsos);
	}
	
	private void agregarPelicula() {
		System.out.println("Ingresa el titulo de la pelicula: ");
		String nombre = teclado.nextLine();
		System.out.println("Ingresa el anio en el que se estreno: ");
		int fechaLanzamiento = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Ingresa una sinopsis corta (si no deseas poner una, simplemente oprime enter): ");
		String sinopsis = teclado.nextLine();
		System.out.println("Ingresa, en minutos, la duracion de la pelicula: ");
		int duracion = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Ingresa el director de la pelicual (si no lo conoces oprime enter): ");
		String director = teclado.nextLine();
		System.out.println("Por ultimo agrega una evaluacion del 1-5 para la pelicula: ");
		double evaluacion = teclado.nextDouble();
		teclado.nextLine();
		
		Pelicula peliUsuario = new Pelicula();
		peliUsuario.setCategoria("Pelicula");
		peliUsuario.setNombre(nombre);
		peliUsuario.setFechaDeLanzamiento(fechaLanzamiento);
		peliUsuario.setEvaluacion(evaluacion);
		peliUsuario.setIncluidoEnPlanBasico(true);
		peliUsuario.setSinopsis(sinopsis);
		peliUsuario.setDuracionEnMinutos(duracion);
		peliUsuario.setDirector(director);
		
		this.pelis.add(peliUsuario);
	}
	
	private void listarPeliculas() {
		for (int i = 0; i < this.pelis.size(); i++) {
			System.out.println("------------------------------");
			this.pelis.get(i).muestraFichaTecnica();
			System.out.println("------------------------------");
		}
	}
	
}
