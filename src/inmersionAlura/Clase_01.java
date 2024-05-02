package inmersionAlura;
import java.util.Scanner;

public class Clase_01 {
	
	public static void main(String[] args) {
		System.out.println("Bienvenidos a la inmersion en Java");
		// TODO Auto-generated method stub
		
		int fechaLanzamiento = 1999;
		double evaluacion = 4.5;
		boolean incluidoEnPlanBasico =  true;
		String nombre = "Matrix";
		//bloques de texto  en string :0
		String sinopsis = """
				La mejor pelicula del fin del milenio
				""";
		
		System.out.println("Pelicula: " + nombre);
		System.out.println("Fecha de lanzamiento: " + fechaLanzamiento);
		System.out.println("Evaluacion: " + evaluacion);
		System.out.println("se incluye en plan Basico? " + incluidoEnPlanBasico);
		System.out.println("Sinopsis: " + sinopsis);
		
		double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
		System.out.println("Evaluacion media: " + mediaEvaluacion);
		
		if (fechaLanzamiento <= 2023) {
			System.out.println("Pelicula retro que vale la pena ver");
		} else {
			System.out.println("Pelicula actual");
		}
		
		double mediaEvaluacionMatrix = 0;
		
		Scanner entrada = new Scanner(System.in);
		for(int i =0; i <3; i++) {
			System.out.println("Ingresa tu evaluacion para Matrix: ");
			double notaMatrix = entrada.nextDouble();
			mediaEvaluacionMatrix = mediaEvaluacionMatrix + notaMatrix;
		}
		
		System.out.println("La media de la pelicula Matrix calculada por el usuario es: " + (mediaEvaluacionMatrix / 3));
		
		double mediaEvaluacionHPotter = 0;
		int count = 0;
		while (count < 3 ) {
			count++;
			System.out.println("Ingresa tu calificacion para la pelicula Harry potter 1: ");
			double notaHarryPotter = entrada.nextDouble();
			mediaEvaluacionHPotter = mediaEvaluacionHPotter + notaHarryPotter;
		}
		
		entrada.close();
		System.out.println("La media de la pelicula Harry Potter 1 calculada por el usuario es: " + (mediaEvaluacionHPotter / 3));

	}
}
