package campionato;

import java.util.ArrayList;
import java.util.List;

public class Squadra {
	
	
	
	private String nome;
	private int punti;
	private int retiSubite;
	private int retiFatte;
	
	List<Giocatore> giocatori = new ArrayList<Giocatore>();
	
	
	
	//Costruttori
	
	public Squadra() {
		
	}


	public Squadra(String nome, int punti, int retiSubite, int retiFatte) {
		
		this.nome = nome;
		this.punti = 0;
		this.retiSubite = 0;
		this.retiFatte = 0;
	}

	// Getter Setter
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getPunti() {
		return punti;
	}


	public void setPunti(int punti) {
		this.punti = punti;
	}


	public int getRetiSubite() {
		return retiSubite;
	}


	public void setRetiSubite(int retiSubite) {
		this.retiSubite = retiSubite;
	}


	public int getRetiFatte() {
		return retiFatte;
	}


	public void setRetiFatte(int retiFatte) {
		this.retiFatte = retiFatte;
	}

	public List<Giocatore> getGiocatori() {
		return giocatori;
	}
	
	
	public void setGiocatori(List<Giocatore> giocatori) {
		this.giocatori = giocatori;
	}

	//Metodo per aggiungere giocatore alla Lista della squadra
	
		//public void aggiungiGiocatoresquadra(Giocatore g){
		//	giocatori.add(g);
	//	}


		
	
	
	
	
	
	
	

}
