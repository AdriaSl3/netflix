package netflix;

import java.util.ArrayList;

public class Capitulo {
	protected int duration;
	public final int DURATION = 45;
	protected int num;
	protected Temporada temorada;
	protected ArrayList<Personaje> personajes;
	
	public Capitulo() {
	}
	public Capitulo(int num, Temporada temporada) {
		this.num=num;
		this.temorada=temporada;
	}
	public String listaPersonajes() {
		StringBuffer sb = new StringBuffer();
		//String cadena = "";
		for(Personaje per:personajes) {
			sb.append(per);
			//cadena+=per;
		}
		return sb.toString();
		//return cadena;
	}
}