package campionato;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Partita {
	
	private Date data;
	private String squadraCasa;
	private String squadraOspite;
	private int retiSquadracasa;
	private int retiSquadraospite;
	private char risultato;
	
	List<Giocatore> marcatori = new ArrayList<Giocatore>();
	List<Giocatore> espulsi = new ArrayList<Giocatore>();
	List<Giocatore> ammoniti = new ArrayList<Giocatore>();

	
	//Costrutori
	public Partita() {
		super();
	}
	
	
	
	public Partita(Date data, String squadraCasa, String squadraOspite,
			int retiSquadracasa, int retiSquadraospite, char risultato) {
		super();
		this.data = data;
		this.squadraCasa = squadraCasa;
		this.squadraOspite = squadraOspite;
		this.retiSquadracasa = retiSquadracasa;
		this.retiSquadraospite = retiSquadraospite;
		this.risultato = risultato;
	}
	
	
	public List<Giocatore> getEspulsi() {
		return espulsi;
	}



	public void setEspulsi(List<Giocatore> espulsi) {
		this.espulsi = espulsi;
	}



	public List<Giocatore> getAmmoniti() {
		return ammoniti;
	}



	public void setAmmoniti(List<Giocatore> ammoniti) {
		this.ammoniti = ammoniti;
	}





	// Setter Getter
	
	
	public Date getData() {
		return data;
	}



	public List<Giocatore> getMarcatori() {
		return marcatori;
	}



	public void setMarcatori(List<Giocatore> marcatori) {
		this.marcatori = marcatori;
	}



	public void setData(Date data) {
		this.data = data;
	}



	public String getSquadraCasa() {
		return squadraCasa;
	}



	public void setSquadraCasa(String squadraCasa) {
		this.squadraCasa = squadraCasa;
	}



	public String getSquadraOspite() {
		return squadraOspite;
	}



	public void setSquadraOspite(String squadraOspite) {
		this.squadraOspite = squadraOspite;
	}



	public int getRetiSquadracasa() {
		return retiSquadracasa;
	}



	public void setRetiSquadracasa(int retiSquadracasa) {
		this.retiSquadracasa = retiSquadracasa;
	}



	public int getRetiSquadraospite() {
		return retiSquadraospite;
	}



	public void setRetiSquadraospite(int retiSquadraospite) {
		this.retiSquadraospite = retiSquadraospite;
	}



	public char getRisultato() {
		return risultato;
	}



	public void setRisultato(char risultato) {
		this.risultato = risultato;
	}
	
	
	

}
