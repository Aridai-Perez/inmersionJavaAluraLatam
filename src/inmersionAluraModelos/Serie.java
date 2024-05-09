package inmersionAluraModelos;

public class Serie extends Titulo {
	
	private int temporadas;
	private int episodiosPorTemporada;
	private int minutosPorEpisodio;
	
	@Override
	public void muestraFichaSerie() {
		System.out.println("Temporadas: " + temporadas);
		System.out.println("Episodios por temporada: " + episodiosPorTemporada);
		System.out.println("Duracion de los capitulos: " + minutosPorEpisodio + " min");
	}
	
	//se sobreecribe un metodo ya hecho en titulo, la clase padre
	@Override
	public int getDuracionEnMinutos() {
		return (minutosPorEpisodio * episodiosPorTemporada) * temporadas / 24;
	}
	
	public int getTemporadas() {
		return temporadas;
	}
	
	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}
	
	public int getEpisodiosPorTemporada() {
		return episodiosPorTemporada;
	}
	
	public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
		this.episodiosPorTemporada = episodiosPorTemporada;
	}
	
	public int getMinutosPorEpisodio() {
		return minutosPorEpisodio;
	}
	
	public void setMinutosPorEpisodio(int minutosPorEpisodio) {
		this.minutosPorEpisodio = minutosPorEpisodio;
	}
	
}
