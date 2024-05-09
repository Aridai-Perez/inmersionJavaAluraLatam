package inmersionAluraModelos;

public class Pelicula extends Titulo {
	
	private String director;
	
	@Override
	public void muestraFichaPeli() {
		if( director != null && director != "") {
			System.out.println("Director(a): " + director);
		}else {
			System.out.println("Director(a): Desconocido");
		}
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

}
