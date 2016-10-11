package campionato;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ServizioCampionato {

	// Metodo 1)

	public Giocatore registraGiocatore(Campionato c, Squadra sq, String nome,
			String cognome, String ruolo, String stipendio, int età,
			int ammunizioni, int espulsioni, int reti, int assist, String cF) {

		// HashMap non garantisce l'ordine della mappa(key, value) di
		// giocatori.Non mi interessa ordine per registrare giocatori

		Giocatore g = null;
		if (c.getGiocatori().containsKey(cF) == true) {

			System.out.println("Giocatore già registrato!");

		} else {// se non è contenuto in mappa dei giocatori del campionato

			Giocatore g1 = new Giocatore(nome, cognome, età, cF);

			c.aggiungiGiocatore(g1);
			// sq.aggiungiGiocatoresquadra(g1); E' il metodo 3!
			g = g1;
		}
		return g;
	}

	// Metodo 2)

	public Squadra registraSquadra(Campionato c, String nome, int punti,
			int retiSubite, int retiFatte) {

		Squadra s = null;
		List<Squadra> listasquadre = c.getSquadre();

		for (Squadra stemp : listasquadre) {

			if (stemp.getNome().equals(nome)) {
				s = stemp;
				break;
			} 
		}
		
		if (s == null){

		s = new Squadra(nome, 0, 0, 0);
			listasquadre.add(s);
		}

		return s;
	}

	// Metodo 3)

	public boolean assegnaGiocatoreSquadra(Campionato c, Giocatore g, Squadra sq) {

		boolean risultato = false;

		if (!c.getGiocatori().containsValue(g)) { // non esiste in mappa
			System.out.println("Giocatore non registrato al campionato!");

		} else { // se esiste

			sq.getGiocatori().add(g);
			System.out.println("Giocatore inserito in squadra");
			risultato = true;
		}
		return risultato;
	}

	// Metodo 4)

	public Partita registraPartita(Campionato c, Squadra sCasa,
			Squadra sOspite, int retisCasa, int retisOspite, String data,
			List<Giocatore> marcatori, List<Giocatore> espulsi,
			List<Giocatore> ammoniti) {
		
		
		Partita partita=null;
		
		for(Squadra s : c.getSquadre()){//verifico che le squadre siano iscritte al campionato
			
			if(!c.getSquadre().contains(sCasa) && !c.getSquadre().contains(sOspite)){
				System.out.println("La partita non è possibile");
				
			}else{//si gioca la partita. Occorre: REGISTRARE LA PARTITA ALLA LISTA DELLE PARTITE IN CAMPIONATO
				
				Partita p = new Partita();	//RICORDA DI METTERE GLI ARGOMENTI DEL METODO RISOLVI PROBLEMA DELLA DATA
				c.getPartite().add(p);
				partita=p;
				
				//AUMENTARE L' ATTRIBUTO DELLE retiSquadraCcasa e retiSquadraospite e inserire char per risultato IN CLASSE PARTITA
				
				int retiCasa=p.getRetiSquadracasa();
				int retiOspite=p.getRetiSquadraospite();
				char ris=p.getRisultato();
				
				
				retiCasa = retisCasa;
				retiOspite=retisOspite;
				
				//INSERIRE RISULTATO PARTITA
				if(retiCasa > retiOspite){
					ris='1';					
				}
				if(retiCasa == retiOspite){
					ris='X';					
				}else{
					ris='2';
				}
				
				
				p.setRetiSquadracasa(retiCasa);
				p.setRetiSquadraospite(retiOspite);
				p.setRisultato(ris);
				
				//AUMENTARE L' ATTRIBUTO DELLE reti,espulsioni,ammonizioni IN CLASSE GIOCATORE
				
				Giocatore g = null;
				
				
				for (Giocatore goal : marcatori){
					if(p.getMarcatori().contains(goal)){
						
						int reti = g.getReti();
						reti++;
						
						g.setReti(reti);
						
					}
				}
						
				for (Giocatore rosso : espulsi){
					if(p.getEspulsi().contains(rosso)){
						
						int espulsioni=g.getEspulsioni();
						espulsioni++;
						
						g.setEspulsioni(espulsioni);
					}
				}	
				
				for (Giocatore giallo : ammoniti){
					if(p.getAmmoniti().contains(giallo)){
						
						int ammonizioni=g.getAmmonizioni();
						
						ammonizioni++;
						
						g.setEspulsioni(ammonizioni);	
				
						
					}
				}		
			}
			
		}
		return partita;
	}
	
	
//Metodo 5)	
	
	public Giocatore getCapocannoniere(Campionato c){
		
		
		
		//converto mappa dei giocatori in campionato in lista da poter inserire in collezione		
		List<Giocatore> listaGiocatori = new ArrayList<Giocatore>(c.getGiocatori().values());
		
		
		CalciatoreComparator capoCann= new CalciatoreComparator();
		//Mette in ordine decrescente i giocatori contenuti in lista usando IL CRITERIO di Calciatore Comparator(capoCann)
		Collections.sort(listaGiocatori, capoCann);
		
		//Prendi il primo della lista ITERATOR
		
		Iterator<Giocatore> it = listaGiocatori.iterator();
		Giocatore g = it.next();//è il primo oggetto
		
		return g;
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
