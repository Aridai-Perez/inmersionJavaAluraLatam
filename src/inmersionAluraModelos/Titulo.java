package inmersionAluraModelos;

public class Titulo {
	
	private String nombre;
	private int fechaDeLanzamiento;
	private double evaluacion;
	private boolean incluidoEnPlanBasico;
	private String sinopsis;
	private int duracionEnMinutos;
	private String categoria;
	
	public void muestraFichaTecnica() {
		System.out.println("****FICHA TECNICA****");
		System.out.println("Titulo: " + nombre);
		if(categoria == "Serie") {
			System.out.println("Categoria: " + categoria);
			System.out.println("Buena para maratonear, te tomaria " + getDuracionEnMinutos() + " hrs terminarla");
		} else {
			System.out.println("Categoria: " + categoria);
			System.out.println("Tiempo de duracion: " + getDuracionEnMinutos() + " min");
		}
		
		if (sinopsis != null && sinopsis != "") {
			System.out.println("Sinopsis: " + sinopsis);
		}
		
		System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
		
		if (categoria == "Serie") {
			muestraFichaSerie();
		} else {
			muestraFichaPeli();
		}
		System.out.println("La calificacion de este titulo es: " + evaluacion + "/5");
	}

	//se obtiene el resultado
	public String getNombre() {
		return nombre;
	}
	//se setea un valor, o sea se "guarda"
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getFechaDeLanzamiento() {
		return fechaDeLanzamiento;
	}

	public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
		this.fechaDeLanzamiento = fechaDeLanzamiento;
	}

	public double getEvaluacion() {
		return evaluacion;
	}

	public void setEvaluacion(double evaluacion) {
		this.evaluacion = evaluacion;
	}

	public boolean getIncluidoEnPlanBasico() {
		return incluidoEnPlanBasico;
	}

	public void setIncluidoEnPlanBasico(boolean incluidoEnPlanBasico) {
		this.incluidoEnPlanBasico = incluidoEnPlanBasico;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public int getDuracionEnMinutos() {
		return duracionEnMinutos;
	}

	public void setDuracionEnMinutos(int duracionEnMinutos) {
		this.duracionEnMinutos = duracionEnMinutos;
	}

	public void muestraFichaSerie() {
		// TODO Auto-generated method stub
		
	}

	public void muestraFichaPeli() {
		// TODO Auto-generated method stub
		
	}
	
}
