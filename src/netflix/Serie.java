package netflix;

import java.util.ArrayList;
import java.util.List;

public class Serie {
	private String titulo;
	private List<Temporada> temporadas;
	public int duraciontotalserie() {
		int duracion = 0;
		for (Temporada temporada:temporadas) {
			ArrayList<Capitulo> capitulos = temporada.getCapitulo();
			for (Capitulo capitulo:capitulos) {
				duracion += capitulo.getDuracion();
			}	
		}
		System.out.print("La duracion de la serie es " + duracion);
	}
	public void duraciontotalserieCON() {
		int duracion = 0;
		for (Temporada temporada:temporadas) {
			duracion += temporada.getMinutosTemporada();
		}
		System.out.print("La duracion de la serie es " + duracion);
	}
	public Serie(String titulo) {
		this.titulo = titulo;
		this.temporadas = new ArrayList<Temporada>();
	}
	
	public Serie() {
		this.temporadas = new ArrayList<Temporada>();
	}
	
	public void addTemporada(Temporada temporada) {
		temporadas.add(temporada);
		temporada.setSerie(this);
	}
	
}
