package campionato;


public class Giocatore {
	
	
	
	private String nome;
	private String cognome;
	private String ruolo;
	private String stipendio;
	private int et�;
	private int ammunizioni;
	private int espulsioni;
	private int reti;
	private int assist;
	private String cF;
	
	
	
	
	//Costruttori
	
	
	public Giocatore() {
		
	}

	public Giocatore(String nome, String cognome, int et�, String cF) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.et� = et�;
		this.cF = cF;
	}

	public Giocatore(String nome, String cognome, String ruolo,
			String stipendio, int et�, int ammonizioni, int espulsioni,
			int reti, int assist, String cF) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.ruolo = ruolo;
		this.stipendio = stipendio;
		this.et� = et�;
		this.ammunizioni = ammonizioni;
		this.espulsioni = espulsioni;
		this.reti = reti;
		this.assist = assist;
		this.cF = cF;
	}

	//Getter Setter 
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}

	public String getStipendio() {
		return stipendio;
	}

	public void setStipendio(String stipendio) {
		this.stipendio = stipendio;
	}

	public int getEt�() {
		return et�;
	}

	public void setEt�(int et�) {
		this.et� = et�;
	}

	public int getAmmonizioni() {
		return ammunizioni;
	}

	public void setAmmonizioni(int ammunizioni) {
		this.ammunizioni = ammunizioni;
	}

	public int getEspulsioni() {
		return espulsioni;
	}

	public void setEspulsioni(int espulsioni) {
		this.espulsioni = espulsioni;
	}

	public int getReti() {
		return reti;
	}

	public void setReti(int reti) {
		this.reti = reti;
	}

	public int getAssist() {
		return assist;
	}

	public void setAssist(int assist) {
		this.assist = assist;
	}

	public String getcF() {
		return cF;
	}

	public void setcF(String cF) {
		this.cF = cF;
	}


	
	
	
	
	

}
