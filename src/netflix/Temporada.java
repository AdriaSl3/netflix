package netflix;

import java.util.ArrayList;

public class Temporada {
	
	private int numero;
	private ArrayList<Capitulo> capitulos;
	private Serie serie;
	public Serie getSerie() {
		return serie;
	}
	public void setSerie(Serie serie) {
		this.serie = serie;
	}
	
	public boolean addCapitulo(Capitulo capitulo) {
		if (!capitulos.contains(capitulo)) {
			capitulos.add(capitulo);
			//capitulo.setTemporada(this);
			return true;
		}
		else
			return false;
	}

	public String ListaCapitulos() {
		StringBuilder sb = new StringBuilder();
		String titulo = this.serie.getTitulo();
		for(Capitulo cap:capitulos) {
			sb.append(titulo+"T"+this.numero+"C"+cap.getNum());
		}
		return sb.toString();
	}
	public Temporada() {
		capitulos = new ArrayList<Capitulo>();
	}
	public Temporada(int numero, Serie serie) {
		this.numero=numero;
		this.serie=serie;
	}
}