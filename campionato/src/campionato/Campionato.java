package campionato;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Campionato {
	
	
	
	private String nome;
	
	Map<String, Giocatore> giocatori = new HashMap<String, Giocatore>();
	
	List<Squadra> squadre = new ArrayList<Squadra>();
	
	List<Partita> partite = new ArrayList<Partita>();
	
	
	
	//Costruttore
	
	public Campionato(String nome) {
		this.nome = nome;
	}
	
	
	

	public String getNome() {
		return nome;
	}

	

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Map<String, Giocatore> getGiocatori() {
		return giocatori;
	}

	public void setGiocatori(Map<String, Giocatore> giocatori) {
		this.giocatori = giocatori;
	}

	public List<Squadra> getSquadre() {
		return squadre;
	}

	public void setSquadre(List<Squadra> squadre) {
		this.squadre = squadre;
	}
	
	
	public void setPartite(List<Partita> partite) {
		this.partite = partite;
	}
	
	
	
	
	public void aggiungiGiocatore(Giocatore g){
		giocatori.put(g.getcF(), g);
	}
	
	//Metodo per aggiungere Giocatore alla Mappa del campionato
	
	public List<Partita> getPartite() {
		return partite;
	}




	
	
	
	
	

	
	

}
