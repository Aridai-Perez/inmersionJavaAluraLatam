package inmersionAluraMetodos;

import java.util.ArrayList;
import java.util.Scanner;

import inmersionAlura.Menu_Opciones;
import inmersionAluraModelos.Serie;

public class Series {

	Scanner teclado = new Scanner(System.in);
	private ArrayList<Serie> series = new ArrayList<>();
	
	public void menuSeries() {
		predeterminada();
		int opcion = 0;
		while (opcion != 4) {
			String menu = """
					**** Bienvenido a Screenmatch ****
					++ Series ++
					Escriba el numero de la opcion que desees realizar.
					1) Agregar nueva Serie
					2) Ver la lista de series
					3) Volver a menu principal
					""";
			System.out.println(menu);
			opcion = teclado.nextInt();
			teclado.nextLine();
			
			switch (opcion) {
			case 1:
				agregarSeries();
				break;
			case 2:
				listarSeries();
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
	
	private void predeterminada() {
		Serie friends = new Serie();
		friends.setCategoria("Serie");
		friends.setNombre("Friends");
		friends.setFechaDeLanzamiento(1994);
		friends.setEvaluacion(4.4);
		friends.setIncluidoEnPlanBasico(true);
		friends.setSinopsis("Sigue las vidas de seis amigos en Nueva York mientras enfrentan desafíos de amor, trabajo y amistad en una hilarante y entrañable comedia llena de momentos memorables.");
		friends.setTemporadas(10);
		friends.setEpisodiosPorTemporada(24);
		friends.setMinutosPorEpisodio(22);
		this.series.add(friends);
	}
	
	private void agregarSeries() {
		System.out.println("Ingresa el titulo de la serie: ");
		String nombre = teclado.nextLine();
		System.out.println("Ingresa el anio en el que se estreno: ");
		int fechaLanzamiento = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Ingresa una sinopsis corta (si no deseas poner una, simplemente oprime enter): ");
		String sinopsis = teclado.nextLine();
		teclado.nextLine();
		System.out.println("Cuantas temporadas tiene la serie?");
		int temporadas = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Cuantos capitulos son aprox por temporada?");
		int capitulos = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Cuanto duran sus capitulos?");
		int duracionCapitulos = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Por ultimo agrega una evaluacion del 1-5 para la pelicula: ");
		double evaluacion = teclado.nextDouble();
		teclado.nextLine();
		
		Serie serieUsuario = new Serie();
		serieUsuario.setCategoria("Serie");
		serieUsuario.setNombre(nombre);
		serieUsuario.setFechaDeLanzamiento(fechaLanzamiento);
		serieUsuario.setEvaluacion(evaluacion);
		serieUsuario.setIncluidoEnPlanBasico(true);
		serieUsuario.setSinopsis(sinopsis);
		serieUsuario.setTemporadas(temporadas);
		serieUsuario.setEpisodiosPorTemporada(capitulos);
		serieUsuario.setMinutosPorEpisodio(duracionCapitulos);
		
		this.series.add(serieUsuario);
	}
	
	private void listarSeries() {
		for (int i = 0; i < this.series.size(); i++) {
			System.out.println("------------------------------");
			this.series.get(i).muestraFichaTecnica();
			System.out.println("------------------------------");
		}
	}
}
